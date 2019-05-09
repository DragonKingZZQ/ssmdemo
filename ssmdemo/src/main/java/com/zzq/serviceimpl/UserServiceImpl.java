package com.zzq.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.UserDao;
import com.zzq.entity.User;
import com.zzq.service.UserService;
import com.zzq.util.CookieUtils;

@Service
public class UserServiceImpl implements UserService{
	//依赖持久层：注入
	@Autowired
	private UserDao userDao;

	private static String TT_TOKEN = "TT_TOKEN";
	
	@Override
	public Map<Integer,String> login(String username, String password,HttpServletRequest request, HttpServletResponse response) {
		Map<Integer,String> map = new HashMap<>();
		String password2 = DigestUtils.md5Hex(password.getBytes());
		List<User> userlist = userDao.getUser(username, password2);
		
		if(userlist == null || userlist.isEmpty()) {
			map.put(400, "用户名或密码错误");
			return map;
		}
		User user = userlist.get(0);
		System.out.println(DigestUtils.md5Hex(password.getBytes())+"啥玩意");
		//判断密码是否正确
		if(!DigestUtils.md5Hex(password.getBytes()).equals(user.getPassword())) {
			System.out.println("222");
			map.put(400, "用户名或密码错误");
			return map;
		}
		//生成token
		UUID uuid = UUID.randomUUID();
		String token = uuid.toString();
		CookieUtils.setCookie(request, response,TT_TOKEN, token);
		//返回token
		map.put(200, token);
		return map ;
	}

	@Override
	public User checkInfo(String data, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer,String> registe(User user) {
		Map<Integer,String> map = new HashMap<>();
		//密码进行md5加密
		String password = DigestUtils.md5Hex(user.getPassword().getBytes());
		user.setPassword(password);
		//查询用户名是否已经存在
		List<User> list = userDao.selectByUsername(user.getUsername());
		if(list.size() > 0) {
			map.put(1, "此用户名已经有人注册过");
			return map;
		}
		int i = userDao.insertUser(user.getUsername(), password);
		if(i != 1) {
			map.put(2, "注册失败");
			return map;
		}
		map.put(3, "注册成功");
		return map;
	}

	

	
	

	
	
}

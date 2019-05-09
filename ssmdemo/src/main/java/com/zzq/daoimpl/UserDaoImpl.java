package com.zzq.daoimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.zzq.dao.UserDao;
import com.zzq.entity.User;
import com.zzq.mybatis.UserMapper;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> getUser(String username, String password) {
		
		return userMapper.selectLoginUser(username, password);
	}

	@Override
	public int insertUser(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(username, password);
	}

	@Override
	public List<User> selectByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectByUsername(username);
	}
	
	
	
	
}

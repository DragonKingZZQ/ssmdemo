package com.zzq.service;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzq.entity.User;


public interface UserService{
				
	//登录检验用户名和密码是否正确 返回map类型数据
	Map<Integer,String> login(String username,String password,HttpServletRequest request, HttpServletResponse response);
	
	//注册进行插入
	User checkInfo(String data,int type);
	Map<Integer,String> registe(User user);
}



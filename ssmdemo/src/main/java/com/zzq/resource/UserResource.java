package com.zzq.resource;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.zzq.entity.User;
import com.zzq.service.UserService;
@Controller
public class UserResource {
	//依赖服务层，自动注入	
	@Autowired
	private UserService userService;

	
	@RequestMapping("/index")	
	public String index() {
		//Map<Integer,String> map = userService.login(username, password,request,response);
		return "index";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<Integer,String>  dologin(String username,String password,HttpServletRequest request, HttpServletResponse response) {
		Map<Integer,String> map = userService.login(username, password,request,response);
		return map;
	}
	
	@RequestMapping("/registe")
	@ResponseBody
	public Map<Integer,String> doregiste(User user) {
		System.out.println("名字"+user.getUsername());
		Map<Integer,String> map = userService.registe(user);		
		return map;		
	}
}

package com.zzq.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zzq.entity.User;

public interface UserMapper {    //这个方法不再需要实现，但是需要准备映射语句
	//User selectUserByName(@Param("name")String name);
	//登录
	List<User> selectLoginUser(@Param("username")String username,@Param("password")String password);
	//注册前查询数据是否已经存在
	List<User> selectByUsername(@Param("username")String username);
	//注册
	int insertUser(@Param("username")String username,@Param("password")String password);
	
}

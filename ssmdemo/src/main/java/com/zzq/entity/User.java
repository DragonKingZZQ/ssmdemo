package com.zzq.entity;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
	private static final long serialVersionUID = 6569487135753301028L;
	private Integer uid;
	private String username;
	private String password;
	private String name;
	private String gender;//male 男 female 女 
	private String email;
	private String phone;
	private String addr;
	private Date birthday;
	private Integer state;   //用户状态 0:未激活  1:已激活
	private String code;     //激活码
	private String repassword;
	private String captcha;//激活码
	
	
	
	public User() {
		super();
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", name=" + name + ", gender="
				+ gender + ", email=" + email + ", phone=" + phone + ", addr=" + addr + ", birthday=" + birthday
				+ ", state=" + state + ", code=" + code + ", repassword=" + repassword + ", captcha=" + captcha + "]";
	}
	
	
}

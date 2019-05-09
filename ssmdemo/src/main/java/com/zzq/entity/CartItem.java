package com.zzq.entity;

public class CartItem {
	private Integer pid;	// 购物项中商品id
	private int count;			// 购买某种商品数量
	private double subtotal;	// 购买某种商品小计
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
}

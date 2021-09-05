package com;

public class OrderInfo {
	private Integer order_id;
	private String customer_address;
	private Integer customer_id ;
	private Integer product_id;
	private String total_amt;
	
	public OrderInfo()
	{
		super();
	}
	public OrderInfo(Integer order_id,String customer_address,Integer customer_id,Integer product_id,String total_amt)
	{
		super();
		this.order_id = order_id;
		this.customer_address = customer_address;
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.total_amt = total_amt;
}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(String total_amt) {
		this.total_amt = total_amt;
	}
}
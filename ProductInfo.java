package com;

public class ProductInfo {
	private Integer product_id;
	private String product_name;
	private Integer seller_id;
	private Integer brand_id;
	private Integer inventory_id;
	private String product_details;

	public ProductInfo() {
		super();
	}

	public ProductInfo(Integer product_id, String product_name, Integer seller_id, Integer brand_id,
			Integer inventory_id, String product_details) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.seller_id = seller_id;
		this.brand_id = brand_id;
		this.inventory_id = inventory_id;
		this.product_details = product_details;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(Integer seller_id) {
		this.seller_id = seller_id;
	}

	public Integer getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}

	public Integer getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(Integer inventory_id) {
		this.inventory_id = inventory_id;
	}

	public String getProduct_details() {
		return product_details;
	}

	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}
}
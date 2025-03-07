package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_DETAILS")
public class ProductDetails {
	
	@Id
	@Column(name="PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	
	@Column(name="PRODUCT_NAME")
	private String pName;
	
	@Column(name="PRODUCT_PRICE")
	private float pPrice;

	public ProductDetails() {
		super();
	}

	public ProductDetails(int pId, String pName, float pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public float getpPrice() {
		return pPrice;
	}

	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "ProductDetails [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	
	
	

}

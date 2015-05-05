package com.puneeth.sqlserver;

import java.awt.BufferCapabilities.FlipContents;

public class ProductPOJO {
	private int productID,Quantity;
	private String productName;

	public ProductPOJO(){	}

	@Override
	public String toString() {
		//System.out.println("ID: "+productID+" Product: "+productName+" Quantity: "+Quantity);
		return "ID:"+productID+" Product: "+productName+" Quantity: "+Quantity;
	}

	public ProductPOJO(int quantity, String productName) {
		this.Quantity = quantity;
		this.productName = productName;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}

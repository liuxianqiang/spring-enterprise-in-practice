package com.baobaotao.injectfun;

public class Car {
	private String brand;
	private String corp;
	private double price;
	
	public Car() {
		super();
		System.out.println("constructing a car!");
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCorp() {
		return corp;
	}
	public void setCorp(String corp) {
		this.corp = corp;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

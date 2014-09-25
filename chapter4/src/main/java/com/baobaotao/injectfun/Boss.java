package com.baobaotao.injectfun;
public class Boss implements MagicBoss{
	public Car getCar() {
		Car car = new Car();
		car.setBrand("宝马Z4");
		return car;
	}
}

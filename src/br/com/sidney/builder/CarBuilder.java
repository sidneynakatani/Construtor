package br.com.sidney.builder;

import br.com.sidney.builder.model.Car;

public abstract class CarBuilder {
	
	protected Car car;
	
	public Car getCar(){
		
		return this.car;
	}
	
	public void createCar(){
		
		this.car = new Car();
	}
	
	
	public abstract void buildColor();
	public abstract void buildBrand();

}

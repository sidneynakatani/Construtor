package br.com.sidney.builder.impl;

import br.com.sidney.builder.CarBuilder;

import br.com.sidney.builder.model.Car;

public class CarConstructor {
	
	private CarBuilder carBuilder;
	
	public void setCar(CarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}
	
	public Car getCar(){
		return this.carBuilder.getCar();
	}
	
	public void makeCar(){
		this.carBuilder.createCar();
		this.carBuilder.buildColor();
		this.carBuilder.buildBrand();
	}

}

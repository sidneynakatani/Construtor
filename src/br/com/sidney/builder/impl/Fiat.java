package br.com.sidney.builder.impl;

import br.com.sidney.builder.CarBuilder;

public class Fiat extends CarBuilder{

	@Override
	public void buildColor() {
		car.setColor("Blue");
		
	}

	@Override
	public void buildBrand() {
		car.setBrand("Fiat");
		
	}
	
	

}

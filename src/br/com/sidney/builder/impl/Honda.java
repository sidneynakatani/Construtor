package br.com.sidney.builder.impl;

import br.com.sidney.builder.CarBuilder;

public class Honda extends CarBuilder{

	@Override
	public void buildColor() {
		car.setColor("Black");
		
	}

	@Override
	public void buildBrand() {
		car.setBrand("Honda");
		
	}

}

package br.com.sidney.builder.main;

import br.com.sidney.builder.impl.CarConstructor;
import br.com.sidney.builder.impl.Fiat;
import br.com.sidney.builder.impl.Honda;
import br.com.sidney.builder.model.Car;

public class Demo {
	
	public static void main(String[] args){
		
		CarConstructor carConstructor = new CarConstructor();
		
		Honda honda = new Honda();
		Fiat  fiat  = new Fiat();
		
		
		carConstructor.setCar(honda);
		carConstructor.makeCar();
		Car car = carConstructor.getCar();
		
		System.out.println("Car brand: "+ car.getBrand());
		System.out.println("Car color: "+ car.getColor());
		
		System.out.println();

		carConstructor.setCar(fiat);
		carConstructor.makeCar();
		car = carConstructor.getCar();
		
		System.out.println("Car brand: "+ car.getBrand());
		System.out.println("Car color: "+ car.getColor());
		
		
	}

}

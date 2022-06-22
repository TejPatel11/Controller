package com.PojoDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PojoApplication {

	public static void main(String[] args) {
		//extra method

		SpringApplication.run(PojoApplication.class, args);
		Car c = new Car("Honda","Civic", 20000.00,180, false);
		Car c1 = new Car("Honda","CR-V", 30000.00,180,false);
		System.out.println("Make: " + c.getMake() + " Model: " + c.getModel() + " Price : " + c.getPrice() + " Max Speed: " + c.getMaxSpeed() + " Electric: " +c.isElectric());
		System.out.println("Make: " + c1.getMake() + " Model: " + c1.getModel() + " Price : " + c1.getPrice() + " Max Speed: " + c1.getMaxSpeed() + " Electric: " +c1.isElectric());
		Bike b= new Bike("Honda", "splender","Black", 10000);
		Bike b1= new Bike("Karsihma", "ZMR", "Orange", 3000);
		System.out.println("Make: " + b.getMake() + "Model: " + b.getModel() + "Color: " + b.getColor() + "Price: " + b.getPrice());
		System.out.println("Make: " + b1.getMake() + "Model: " + b1.getModel() + "Color: " + b1.getColor() + "Price: " + b1.getPrice());
	}

}

package com;

public class Vehicemain {

	public static void main(String[] args) {

			// creating an inatance of Bicycle
			// doing some operations
			Interfaceimplementations bicycle = new Interfaceimplementations();
			bicycle.changeGear(2);
			bicycle.speedUp(3);
			bicycle.applyBrakes(1);

			System.out.println("Bicycle present state :");
			bicycle.printStates();

			// creating instance of bike.
			Bike bike = new Bike();
			bike.changeGear(1);
			bike.speedUp(4);
			bike.applyBrakes(3);

			System.out.println("Bike present state :");
			bike.printStates();
	
	}

}

package main;

import models.Car;
import models.Mechanic;

/**
 * Main del sistema
 *	 @author Fede
 *	@since 27/03/2018
 */
public class Main {
	
	public static void main(String[] args) {
		Car carToCheck= new Car(8.50,6.35,18.40,24,15.20,28);
		Mechanic mechanic =new Mechanic("Alberto");
		
		carToCheck.addObserver(mechanic);
		
		mechanic.setCarToCheck(carToCheck);
		mechanic.checkCar();
		
	}
}

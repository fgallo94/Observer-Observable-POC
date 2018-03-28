package models;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * 
 * 
 *	@author Fede
 *	@since 27/03/2018
 */
public class Mechanic implements Observer {

	private String name;
	private Car carToCheck;

	/**
	 * Constructor con parametro
	 * 
	 * @param name
	 * 
	 */
	public Mechanic(String name) {
		this.name = name;
	}

	/**
	 * Setter carToCheck
	 * 
	 * @param carToCheck
	 * 
	 */
	public void setCarToCheck(Car carToCheck) {
		this.carToCheck = carToCheck;
	}

	/**
	 * Setter name
	 * 
	 * @param name
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter carToCheck
	 * 
	 * @return carToCheck
	 * 
	 */
	public Car getCarToCheck() {
		return this.carToCheck;
	}

	/**
	 * Getter name
	 * 
	 * @return name
	 * 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Metodo core del mecanico, desde aqui realiza los setters. Inicializa una
	 * lista de Integer que contendra los datos traidos del methodo .checkCar() de
	 * la clase carToCheck(), para cada item de esa lista entra en un switch, caso
	 * 1, tenemos que cambiar aceite, caso 2, tenemos que cambiar el agua, caso 3,
	 * inflar la delantera izquierda, caso 4, inflar la delantera derecha, caso 5,
	 * inflar la trasera izquierda, caso 6, inflar la trasera derecha.
	 */
	public void checkCar() {
		ArrayList<Integer> tasks = carToCheck.checkCar();
		for (int task : tasks) {
			switch (task) {
			case 1:
				carToCheck.refillOil(10d);
				break;
			case 2:
				carToCheck.refillWater(10d);
				break;
			case 3:
				carToCheck.setFrontLeftWheelPressure(25d);
				break;
			case 4:
				carToCheck.setFrontRightWheelPressure(25d);
				break;
			case 5:
				carToCheck.setRearLeftWheelPressure(25d);
				break;
			case 6:
				carToCheck.setRearRightWheelPressure(25d);
				break;
			}
		}
	}

	/**
	 * Metodo que es un simple .sleep() que permite la correcta visualizacion de los
	 * datos.
	 */
	private void stepper() {
		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Metodo que proviene de Observer. Consulta si car y oldCar son instancias de
	 * Car para luego poder inicializar con esos valores 2 objetos auxiliares,
	 * actualCar y notActualCar, Consulta si el auto actual tiene distintos valores
	 * del auto viejo, si es asi emite por pantalla el valor que se cambio, duerme
	 * el proceso, emite el valor que contenia anteriormente , duerme el proceso,
	 * muestra el valor actual y vuelve a dormir el proceso.
	 * 
	 * @param car
	 *            objeto observable
	 * @param oldCar
	 *            objeto anterior al cambio
	 */
	@Override
	public void update(Observable car, Object oldCar) {
		if (car instanceof Car && oldCar instanceof Car) {
			Car actualCar = (Car) car;
			Car notActualCar = (Car) oldCar;
			if (actualCar.checkOilLevel() != notActualCar.checkOilLevel()) {
				System.out.println(this.name + " realizó un cambio de aceite. \n");
				stepper();
				System.out.println("Antes: " + notActualCar.checkOilLevel() + "\n");
				stepper();
				System.out.println("Ahora: " + actualCar.checkOilLevel() + "\n");
				stepper();
			} else if (actualCar.checkWaterLevel() != notActualCar.checkWaterLevel()) {
				System.out.println(this.name + " realizó un cambio de agua. \n");
				stepper();
				System.out.println("Antes: " + notActualCar.checkWaterLevel() + "\n");
				stepper();
				System.out.println("Ahora: " + actualCar.checkWaterLevel() + "\n");
				stepper();
			} else if (actualCar.getFrontLeftWheelPressure() != notActualCar.getFrontLeftWheelPressure()) {
				System.out.println(this.name + " infló el neumatico Frontal Izquierdo. \n");
				stepper();
				System.out.println("Antes: " + notActualCar.getFrontLeftWheelPressure() + "\n");
				stepper();
				System.out.println("Ahora: " + actualCar.getFrontLeftWheelPressure() + "\n");
				stepper();
			} else if (actualCar.getFrontRightWheelPressure() != notActualCar.getFrontRightWheelPressure()) {
				System.out.println(this.name + " infló el neumatico Frontal Derecho. \n");
				stepper();
				System.out.println("Antes: " + notActualCar.getFrontRightWheelPressure() + "\n");
				stepper();
				System.out.println("Ahora: " + actualCar.getFrontRightWheelPressure() + "\n");
				stepper();
			} else if (actualCar.getRearLeftWheelPressure() != notActualCar.getRearLeftWheelPressure()) {
				System.out.println(this.name + " infló el neumatico Trasero Izquierdo. \n");
				stepper();
				System.out.println("Antes: " + notActualCar.getRearLeftWheelPressure() + "\n");
				stepper();
				System.out.println("Ahora: " + actualCar.getRearLeftWheelPressure() + "\n");
				stepper();
			} else if (actualCar.getRearRightWheelPressure() != notActualCar.getRearRightWheelPressure()) {
				System.out.println(this.name + " infló el neumatico Trasero Derecho. \n");
				stepper();
				System.out.println("Antes: " + notActualCar.getRearRightWheelPressure() + "\n");
				stepper();
				System.out.println("Ahora: " + actualCar.getRearRightWheelPressure() + "\n");
				stepper();
			}
		}

	}

}

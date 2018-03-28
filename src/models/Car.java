package models;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 
 * 
 * @author Fede
 * @since 27/03/2018
 */
public class Car extends Observable {
	private double oilLevel;
	private double waterLevel;
	private double frontLeftWheelPressure;
	private double frontRightWheelPressure;
	private double rearLeftWheelPressure;
	private double rearRightWheelPressure;

	/**
	 * Constructor sin parametros con valores asignados.
	 */
	public Car() {
		this.oilLevel = 6d;
		this.waterLevel = 6d;
		this.frontLeftWheelPressure = 25d;
		this.frontRightWheelPressure = 22d;
		this.rearLeftWheelPressure = 25d;
		this.rearRightWheelPressure = 21d;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param oilLevel
	 * @param waterLevel
	 * @param frontLeftWheelPressure
	 * @param frontRightWheelPressure
	 * @param rearLeftWheelPressure
	 * @param rearRightWheelPressure
	 */
	public Car(double oilLevel, double waterLevel, double frontLeftWheelPressure, double frontRightWheelPressure,
			double rearLeftWheelPressure, double rearRightWheelPressure) {
		this.oilLevel = oilLevel;
		this.waterLevel = waterLevel;
		this.frontLeftWheelPressure = frontLeftWheelPressure;
		this.frontRightWheelPressure = frontRightWheelPressure;
		this.rearLeftWheelPressure = rearLeftWheelPressure;
		this.rearRightWheelPressure = rearRightWheelPressure;
	}

	/**
	 * Constructor copia
	 * 
	 * @param car
	 */
	public Car(Car car) {
		this.oilLevel = car.oilLevel;
		this.waterLevel = car.waterLevel;
		this.frontLeftWheelPressure = car.frontLeftWheelPressure;
		this.frontRightWheelPressure = car.frontRightWheelPressure;
		this.rearLeftWheelPressure = car.rearLeftWheelPressure;
		this.rearRightWheelPressure = car.rearRightWheelPressure;
	}

	/**
	 * Setter de oilLevel
	 * 
	 * @param oilLevel
	 */
	public void refillOil(double oilLevel) {
		Car oldCar = new Car(this);
		this.oilLevel = oilLevel;
		this.setChanged();
		this.notifyObservers(oldCar);
	}

	/**
	 * Setter de waterLevel
	 * 
	 * @param waterLevel
	 */
	public void refillWater(double waterLevel) {
		Car oldCar = new Car(this);
		this.waterLevel = waterLevel;
		this.setChanged();
		this.notifyObservers(oldCar);
	}

	/**
	 * Chequea que valores son necesarios cambiar del auto, y asigna en base a los
	 * condicionales el numero correspondiente a cada cambio, @see Mechanic.checkCar
	 * para mas informacion
	 * 
	 * @return changes es una arraylist de enteros que contienen numeros que
	 *         referencian a los cambios
	 */
	public ArrayList<Integer> checkCar() {
		ArrayList<Integer> changes = new ArrayList<Integer>();
		if (this.checkOilLevel() < 7) {
			changes.add(1);
		}
		if (this.checkWaterLevel() < 7) {
			changes.add(2);
		}
		if (this.getFrontLeftWheelPressure() < 22) {
			changes.add(3);
		}
		if (this.getFrontRightWheelPressure() < 22) {
			changes.add(4);
		}
		if (this.getRearLeftWheelPressure() < 22) {
			changes.add(5);
		}
		if (this.getRearRightWheelPressure() < 22) {
			changes.add(6);
		}
		return changes;
	}

	/**
	 * Setter de frontLeftWheelPressure
	 * 
	 * @param frontLeftWheelPressure
	 */
	public void setFrontLeftWheelPressure(double frontLeftWheelPressure) {
		Car oldCar = new Car(this);
		this.frontLeftWheelPressure = frontLeftWheelPressure;
		this.setChanged();
		this.notifyObservers(oldCar);
	}

	/**
	 * Setter frontRightWheelPressure
	 * 
	 * @param frontRightWheelPressure
	 */
	public void setFrontRightWheelPressure(double frontRightWheelPressure) {
		Car oldCar = new Car(this);
		this.frontRightWheelPressure = frontRightWheelPressure;
		this.setChanged();
		this.notifyObservers(oldCar);
	}

	/**
	 * Setter rearLeftWheelPressure
	 * 
	 * @param rearLeftWheelPressure
	 */
	public void setRearLeftWheelPressure(double rearLeftWheelPressure) {
		Car oldCar = new Car(this);
		this.rearLeftWheelPressure = rearLeftWheelPressure;
		this.setChanged();
		this.notifyObservers(oldCar);
	}

	/**
	 * Setter rearRightWheelPressure
	 * 
	 * @param rearRightWheelPressure
	 */
	public void setRearRightWheelPressure(double rearRightWheelPressure) {
		Car oldCar = new Car(this);
		this.rearRightWheelPressure = rearRightWheelPressure;
		this.setChanged();
		this.notifyObservers(oldCar);
	}

	/**
	 * Getter de oilLevel
	 * 
	 * @return this.oilLevel
	 */
	public double checkOilLevel() {
		return this.oilLevel;
	}

	/**
	 * Getter de waterLevel
	 * 
	 * @return this.waterLevel
	 */
	public double checkWaterLevel() {
		return this.waterLevel;
	}

	/**
	 * Getter de frontLeftWheelPressure
	 * 
	 * @return this.frontLeftWheelPressure
	 */
	public double getFrontLeftWheelPressure() {
		return this.frontLeftWheelPressure;
	}

	/**
	 * Getter de frontRightWheelPressure
	 * 
	 * @return frontRightWheelPressure
	 */
	public double getFrontRightWheelPressure() {
		return this.frontRightWheelPressure;
	}

	/**
	 * Getter de rearLeftWheelPressure
	 * 
	 * @return rearLeftWheelPressure
	 */
	public double getRearLeftWheelPressure() {
		return this.rearLeftWheelPressure;
	}

	/**
	 * Getter de rearRightWheelPressure
	 * 
	 * @return
	 */
	public double getRearRightWheelPressure() {
		return this.rearRightWheelPressure;
	}

}

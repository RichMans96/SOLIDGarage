package com.qa.vehicles;

public class Car extends Vehicle {
	
	private boolean hasBoot;
	private int numOfDoors;
	
	public Car() {}
	
	public Car(int id, int horsePower, String model, String make, boolean hasBoot, int numOfDoors) {
		super(id, horsePower, model, make);
		this.hasBoot = hasBoot;
		this.numOfDoors = numOfDoors;
	}

	public boolean isHasBoot() {
		return hasBoot;
	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	@Override
	public double costToFix() {
		return 250.0;
	}
	
	
	

}

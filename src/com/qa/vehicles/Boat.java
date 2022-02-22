package com.qa.vehicles;

public class Boat extends Vehicle {
	
	private boolean isSpeedBoat;
	private boolean hasSharkCage;
	
	public Boat() {}
	
	public Boat(int id, int horsePower, String model, String make, boolean isSpeedBoat, boolean hasSharkCage) {
		super(id, horsePower, model, make);
		this.hasSharkCage = hasSharkCage;
		this.isSpeedBoat = isSpeedBoat;
	}

	public boolean isSpeedBoat() {
		return isSpeedBoat;
	}

	public void setSpeedBoat(boolean isSpeedBoat) {
		this.isSpeedBoat = isSpeedBoat;
	}

	public boolean isHasSharkCage() {
		return hasSharkCage;
	}

	public void setHasSharkCage(boolean hasSharkCage) {
		this.hasSharkCage = hasSharkCage;
	}

	@Override
	public double costToFix() {
		return 400;
	}
	
	
	

}

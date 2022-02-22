package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Boat;
import com.qa.vehicles.Car;
import com.qa.vehicles.Vehicle;

public class Garage {
	
	public List<Vehicle> garage = new ArrayList<>();
	
	public void addToGarage(Vehicle vh) {
		garage.add(vh);
	}
	
	public void empty() {
		garage.clear();
	}
	
	public void removeVehicleById(int id) {
		Vehicle found = null;
		for(Vehicle vh : garage) {
			if(vh.getVehicleId() == id) {
				found = vh;
			}
		}
		int indexOfVehicle = garage.indexOf(found);
		garage.remove(indexOfVehicle);
	}

}

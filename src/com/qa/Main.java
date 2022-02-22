package com.qa;

import com.qa.garage.Garage;
import com.qa.vehicles.Boat;
import com.qa.vehicles.Car;
import com.qa.vehicles.Vehicle;
import com.qa.workers.Admin;
import com.qa.workers.Mechanic;
import com.qa.workers.Worker;

public class Main {

	public static void main(String[] args) {
			Garage garage = new Garage();
			Vehicle bigBoat = new Boat(1, 120, "Big", "Boat", false, false);
			Vehicle smallBoat = new Boat(2, 120, "Small", "Boat", false, false);
			Vehicle fiesta = new Car(3, 200, "Ford", "Fiesta", true, 3);
			Vehicle fiat = new Car(4, 90, "Fiat", "Panda", true, 3);
			
			Admin admin = new Admin("Richard", 5000);
			Mechanic mechanic = new Mechanic("David", 50000);
			
			garage.addToGarage(fiat);
			garage.addToGarage(bigBoat);
			garage.addToGarage(smallBoat);
			garage.addToGarage(fiesta);
			
			admin.calcBill(fiat);
			mechanic.fix(admin, bigBoat);
		}

}

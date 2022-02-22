package com.qa.workers;

import java.util.List;

import com.qa.utils.CalcBill;
import com.qa.vehicles.Vehicle;

public class Admin extends Worker implements CalcBill {

	public Admin() {}
	
	public Admin(String name, int salary) {
		super(name, salary);
	}

	public void calcAllBills(List<Vehicle> garage) {
		for (Vehicle vh : garage) {
			calcBill(vh);
		}
	}

	@Override
	public void calcBill(Vehicle vh) {
		System.out.println("Your bill is: " + vh.costToFix());
	}

}

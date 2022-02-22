package com.qa.workers;

import com.qa.utils.CalcBill;
import com.qa.vehicles.Vehicle;

public class Mechanic extends Worker {
	
	public Mechanic() {}

	public Mechanic(String name, int salary) {
		super(name, salary);
	}
                  // Boss boss
	              // Admin admin
	public void fix(CalcBill cb, Vehicle vh) {
		cb.calcBill(vh);
	}
	
}

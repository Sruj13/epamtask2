package com.ebsco.task2;

public class EstimateCost {
	public double calculate_Cost(double area, String s,String automated) {
		double cost = 0;
		if (s.equals("standard") && automated.equals("No")) {
			cost = area * 1200;
		} else if (s.equals("abovestandard") && automated.equals("No")) {
			cost = area * 1500;
		} else if (s.equals("highstandard") && automated.equals("No")) {
			cost = area * 1800;
		} else if(s.equals("highstandard") && automated.equals("Yes")) {
			cost = area * 2500;
		}
		return cost;
	}
}
package com.ebsco.task2;

public class SimpleCompoundInterest {
	public double compoundInterest(double principal, double rate, int time) {
		double compoundinterest = 0;
		compoundinterest= principal * Math.pow((1 + (rate / 100)), time);
		return compoundinterest;
	}
	public double simpleInterest(double principal, double rate, int time) {
		double simpleinterest = 0;
	     simpleinterest= (principal*time*rate)/100.0;
		return simpleinterest;
	}
}
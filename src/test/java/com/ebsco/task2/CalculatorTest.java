package com.ebsco.task2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator test = new Calculator();
	
	@Test
	public void addTest() {
		assertEquals(5.5, test.add(2.5,3),0.0);
		assertEquals(3.6, test.add(1.1, 2.5), 0.0);
		assertEquals(8.0, test.add(5.0,3.0), 0.0);
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(7.26, test.multiply(2.2, 3.3), 0.0);
		assertEquals(2.2, test.multiply(1.1, 2), 0.0);
		assertEquals(14.3, test.multiply(-2.2, -6.5), 0.0);
	}
	
	@Test()
	public void divisionTest() {
		assertEquals(0.67, test.divide(2.2, 3.3), 0.0);
		assertEquals(0 , test.divide(1.1, 0), 0.0);
		assertEquals(3.33, test.divide(10, 3), 0.0);
	}

}
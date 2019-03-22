package com.ebsco.task2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void compoundInterestTest() {
		SimpleCompoundInterest c=new SimpleCompoundInterest();
		assertEquals(331.0, c.compoundInterest(1000.0, 10.0, 3), 0.0);
		assertEquals(1333.1, c.compoundInterest(1200, 5.4, 2), 0.0);
		assertEquals(210.0, c.compoundInterest(1000, 10, 2), 0.0);
		assertEquals(1515.15, c.simpleInterest(20202,2.5,3), 0.0);
		
	}

}

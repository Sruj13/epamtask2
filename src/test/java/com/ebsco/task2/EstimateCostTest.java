package com.ebsco.task2;

import static org.junit.Assert.*;
import org.junit.Test;

public class EstimateCostTest {

	@Test
	public void test() {
		EstimateCost e = new EstimateCost();
		assertEquals(2400, e.calculate_Cost(2, "standard","No"), 0.0);
		assertEquals(3000, e.calculate_Cost(2, "abovestandard","No"), 0.0);
		assertEquals(3600, e.calculate_Cost(2, "highstandard","No"), 0.0);
		assertEquals(5000, e.calculate_Cost(2, "highstandard","Yes"), 0.0);
	}

}
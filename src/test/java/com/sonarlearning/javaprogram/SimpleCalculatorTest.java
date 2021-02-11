package com.sonarlearning.javaprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void multiplyTest() {
		SimpleCalculator s = new SimpleCalculator();
		assertEquals(4, s.multiply(2,2));
		 
	}
	@Test
	public void subtractTest() {
		SimpleCalculator s = new SimpleCalculator();
		assertEquals(0, s.subtract(2,2));
		 
	}
}


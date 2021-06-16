package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fizzbuzz.Buzz;

public class BuzzTest {
	
	private Buzz objectUnderTest;
	private List<String> input;
	
	@Before
	public void setup() {
		input = new ArrayList<>();
		input.add("1");
		input.add("3");
		input.add("5");
		
		objectUnderTest = new Buzz();
	}
	
	@Test(expected = NullPointerException.class)
	public void calculateTest() {
		assertEquals("", objectUnderTest.calculate(null));
		assertEquals("", objectUnderTest.calculate(Integer.parseInt(input.get(0))));
		assertEquals("", objectUnderTest.calculate(Integer.parseInt(input.get(1))));
		assertEquals("Buzz", objectUnderTest.calculate(Integer.parseInt(input.get(2))));	
	}

}

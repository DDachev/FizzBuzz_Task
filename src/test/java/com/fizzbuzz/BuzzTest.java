package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fizzbuzz.Buzz;
import com.fizzbuzz.Operation;

public class BuzzTest {
	
	private Operation objectUnderTest;
	private List<String> input;
	
	@Before
	public void setup() {
		input = new ArrayList<>();
		input.add("1");
		input.add("3");
		input.add("5");
		
		objectUnderTest = new Buzz();
	}
	
	@Test
	public void calculateTest() {
		assertEquals("", objectUnderTest.calculate(Integer.parseInt(input.get(0))));
		assertEquals("", objectUnderTest.calculate(Integer.parseInt(input.get(1))));
		assertEquals("Buzz", objectUnderTest.calculate(Integer.parseInt(input.get(2))));	
	}

}

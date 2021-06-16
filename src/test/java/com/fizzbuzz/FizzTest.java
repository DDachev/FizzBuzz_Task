package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fizzbuzz.Fizz;

public class FizzTest {
	
	private Fizz objectUnderTest;
	private List<String> input;
	
	@Before
	public void setup() {
		input = new ArrayList<>();
		input.add("1");
		input.add("3");
		input.add("5");
		
		objectUnderTest = new Fizz();
	}
	
	@Test(expected = NullPointerException.class)
	public void calculateTest() {
		assertEquals("", objectUnderTest.calculate(null));
		assertEquals("", objectUnderTest.calculate(Integer.parseInt(input.get(0))));
		assertEquals("Fizz", objectUnderTest.calculate(Integer.parseInt(input.get(1))));
		assertEquals("", objectUnderTest.calculate(Integer.parseInt(input.get(2))));
	}

}

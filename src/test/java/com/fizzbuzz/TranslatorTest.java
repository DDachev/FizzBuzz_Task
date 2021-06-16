package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TranslatorTest {

	private Translator<Integer, IntOperation> objectUnderTest;
	private List<String> input;
	private List<IntOperation> operations;
	
	@Before
	public void setup() {
		input = new ArrayList<>();
		input.add("1");
		input.add("3");
		input.add("5");
				
		operations = new ArrayList<>();
		operations.add(new Fizz());
		operations.add(new Buzz());
		
		objectUnderTest = new Translator<>(operations);
	}
	
	@Test(expected = NullPointerException.class)
	public void translateOperationToAnswerTest() {
		assertEquals("", objectUnderTest.translate(null));
		assertEquals("1", objectUnderTest.translate(1));
		assertEquals("Fizz", objectUnderTest.translate(3));
		assertEquals("Buzz", objectUnderTest.translate(5));
		assertEquals("FizzBuzz", objectUnderTest.translate(15));
	}
	
}

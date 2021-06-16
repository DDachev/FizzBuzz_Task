package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fizzbuzz.Buzz;
import com.fizzbuzz.Fizz;
import com.fizzbuzz.FizzBuzzTask;

public class FizzBuzzTaskTest {
	
	private List<IntOperation> operations;
	private List<String> input;

	@Before
	public void setup() {
		input = new ArrayList<>();
		input.add("1");
		input.add("3");
		input.add("5");
		input.add("15");

		operations = new ArrayList<>();
		operations.add(new Fizz());
		operations.add(new Buzz());
	}

	@Test
	public void initOperationsTest() {
		assertEquals(2, operations.size());
	}

	@Test
	public void validateDataTest() {
		assertEquals(false, FizzBuzzTask.validateData(null, null));
		assertEquals(false, FizzBuzzTask.validateData(new ArrayList<String>(), new ArrayList<IntOperation>()));
		assertEquals(false, FizzBuzzTask.validateData(new ArrayList<String>(), operations));
		assertEquals(false, FizzBuzzTask.validateData(input, new ArrayList<IntOperation>()));
	}

}

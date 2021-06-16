package com.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fizzbuzz.Buzz;
import com.fizzbuzz.Fizz;
import com.fizzbuzz.FizzBuzzTask;
import com.fizzbuzz.Operation;

public class FizzBuzzTaskTest {
	
	@Mock
	private FizzBuzzTask objectUnderTest;

	private List<Operation> operations;
	private List<String> input;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
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
		assertEquals(false, objectUnderTest.validateData(new ArrayList<String>(), operations));
		assertEquals(false, objectUnderTest.validateData(input, new ArrayList<Operation>()));
	}

	@Test
	public void printAnswerTest_with_valid_data() {
		objectUnderTest.validateData(input, operations);
		verify(objectUnderTest, never()).printAnswer(input, operations);
	}

	@Test
	public void printAnswerTest_with_not_valid_data() {
		objectUnderTest.validateData(new ArrayList<String>(), operations);
		verify(objectUnderTest, never()).printAnswer(input, operations);
	}
	
}

package com.fizzbuzz;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzTask {
	public static void main(String[] args) {
		
		//Input
		List<String> input = new ArrayList<>();
		input.add("1");
		input.add("3");
		input.add("5");
		input.add("15");
		
		List<IntOperation> operations = initOperations();
		
		if (validateData(input, operations)) {
			Translator<Integer, IntOperation> translator = new Translator<>(operations);
			
			for(String i : input) {
				System.out.println(translator.translate(Integer.parseInt(i)));
			}
		}
	}
	
	private static List<IntOperation> initOperations() {
		List<IntOperation> operations = new ArrayList<>();
		operations.add(new Fizz());
		operations.add(new Buzz());
		
		return operations;
	}
	
	public static boolean validateData(List<String> input, List<IntOperation> operations) {
		if(input == null || input.isEmpty()) {
			System.out.println("The input is null or empty.");
			return false;
		}
		
		if(operations == null || operations.isEmpty()) {
			System.out.println("The operations are null or empty.");
			return false;
		}
		
		return true;
	}
}

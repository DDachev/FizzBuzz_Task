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
		
		FizzBuzzTask task = new FizzBuzzTask();
		List<Operation> operations = initOperations();
		
		if (task.validateData(input, operations)) {
			task.printAnswer(input, operations);
		}
	}
	
	private static List<Operation> initOperations() {
		List<Operation> operations = new ArrayList<>();
		operations.add(new Fizz());
		operations.add(new Buzz());
		
		return operations;
	}
	
	public boolean validateData(List<String> input, List<Operation> operations) {
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
	
	public void printAnswer(List<String> input, List<Operation> operations) {
		StringBuilder answer = new StringBuilder();
		
		for(String i : input) {
			for(Operation o : operations) {
				answer.append(o.calculate(Integer.parseInt(i)));
			}
			
			if(answer.length() == 0) {
				System.out.println(i);
				continue;
			}
			System.out.println(answer);
			answer.delete(0,  answer.length());
		}
	}
}

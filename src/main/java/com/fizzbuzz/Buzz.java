package com.fizzbuzz;

public class Buzz implements Operation{

	@Override
	public String calculate(int number) {
		if(number % 5 == 0) {
			return "Buzz";
		}
		return "";
	}
}

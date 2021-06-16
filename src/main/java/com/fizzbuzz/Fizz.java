package com.fizzbuzz;

public class Fizz implements Operation {

	@Override
	public String calculate(int number) {
		if(number % 3 == 0) {
			return "Fizz";
		}
		return "";
	}
}

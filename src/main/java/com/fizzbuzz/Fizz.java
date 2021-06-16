package com.fizzbuzz;

public class Fizz implements IntOperation {

	@Override
	public String calculate(Integer number) {
		if(number % 3 == 0) {
			return "Fizz";
		}
		return "";
	}
}

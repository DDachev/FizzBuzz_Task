package com.fizzbuzz;

public class Buzz implements IntOperation{

	@Override
	public String calculate(Integer number) {
		if(number % 5 == 0) {
			return "Buzz";
		}
		return "";
	}
}

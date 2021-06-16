package com.fizzbuzz;

import java.util.List;

public class Translator<T, U extends Operation<T>> {
	
	private List<U> operations;
	
	public Translator(List<U> operations) {
		this.operations = operations;
	}
	
	public String translate(T input) {
		StringBuilder answer = new StringBuilder();

		for(U o : operations) {
			answer.append(o.calculate(input));
		}
		
		if(answer.length() == 0) {
			return String.valueOf(input);
		}
		return answer.toString();
	}

}

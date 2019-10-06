package com;

//Sample program to implement exceptional handling extensively. All possible scenarios.
public class ExceptionHandling {

	public int operation(int a, int b) {
		int result = 0;
		int firstValue = a * 10;
		int secondValue = b * 10;
		try {
			result = firstValue / secondValue;
		}
		catch (ArithmeticException e) {
		}
		return (result+5);
	}

	public static void main(String[] args) {
		ExceptionHandling e = new ExceptionHandling();
		int output = e.operation(70, 0);
		System.out.println(output);
	}
}

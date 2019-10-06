package com;

//Sample program to extensively use all string operations.
public class Stringopertations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="vijayaraghavan";
		s1=s1.concat("==how are you");
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
		long value=9032017;
		String s2=String.valueOf(value);
		System.out.println(s1+s2);
		System.out.println(s1.endsWith("you"));
		System.out.println((s1+" "+s2).toUpperCase());
		
	}

}

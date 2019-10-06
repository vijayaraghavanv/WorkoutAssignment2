package com;

import java.util.Scanner;

//Sample program to reverse a number using while, for and recursion.
public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------------");
		System.out.println(" Reverse a number using while Loop");
		System.out.println("---------------------");
		int num=0;
	      int reversenum =0;
	      System.out.println("Input your number and press enter: ");
	      //This statement will capture the user input
	      Scanner in = new Scanner(System.in);
	      //Captured input would be stored in number num
	      num = in.nextInt();
	      //While Loop: Logic to find out the reverse number
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);
	      
        System.out.println("---------------------");
		System.out.println(" Reverse a number using for Loop");
		System.out.println("---------------------");
		System.out.println("Input your number and press enter: ");
		 Scanner ln = new Scanner(System.in);
		 num = ln.nextInt();
		 reversenum =0;
		 for( ;num != 0; )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of specified number is: "+reversenum);
	      System.out.println("---------------------");
			System.out.println("Reverse a number using recursion");
			System.out.println("---------------------");
			System.out.println("Input your number and press enter: ");
			Scanner sn = new Scanner(System.in);
			num = sn.nextInt();
			System.out.print("Reverse of the input number is:");
			reverseMethod(num);
			System.out.println();
		 
	}
	
	public static void reverseMethod(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       }
	       else {
	           System.out.print(number % 10);
	           //Method is calling itself: recursion
	           reverseMethod(number/10);
	       }
	}
}

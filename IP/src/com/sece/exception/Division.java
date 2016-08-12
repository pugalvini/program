package com.sece.exception;

//import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		//Scanner s = new Scanner(System.in);
		int input = 20;//s.nextInt();
		try {
			int div = input/0;
			arr[15] = 20;
			System.out.println("Result : "+div);
			System.out.println(arr[15]);
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		System.out.println("Program executed");
		//s.close();
	}

}

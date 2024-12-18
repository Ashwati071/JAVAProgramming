package Javapackage;

import java.util.Scanner;

public class EvenOddNumber {

	//WAP to find the Even & Odd number

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int a = sc.nextInt();

		if(a%2==0) {
			System.out.println("Number is even number");
		}
		else {
			System.out.println("Number is odd number");

		}
		sc.close();
	}

}



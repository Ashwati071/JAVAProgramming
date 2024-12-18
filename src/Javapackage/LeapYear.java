package Javapackage;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int yr = sc.nextInt();
		
		if((yr%400==0)||(yr%4==0 && yr%100!=0))
		{
			System.out.println("is a leap year");

		}
		else {
			System.out.println("not a leap year");
			}
		sc.close();
	}

}

/*Conditions to find the leap year is:
 * year should be divisible by 400 
 * OR
 * year should be divisible by 4 but not divisible by 100 
 */

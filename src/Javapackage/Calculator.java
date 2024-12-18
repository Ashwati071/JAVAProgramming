package Javapackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String yn;  //Here i am declaring this as a local variable as there is a block
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 1st number");
			int a=sc.nextInt();
			System.out.println("Enter the 2nd number");
			int b=sc.nextInt();
			//String opr = "+,-,*,/";
			System.out.println("Enter any symbol(+,-,*,/)");
			String sym;
			sym= sc.next();
			if (sym.equals("+")){
				System.out.println(a+b);}
			else if (sym.equals("-")){
				System.out.println("Subtraction is "+(a-b));}
			else if (sym.equals("*")){
				System.out.println("Multiplication  is "+(a*b));}
			else if (sym.equals ("/")){
				System.out.println("Division is "+(a/b));
			}
			else {
				System.out.println("Please enter a valid symbol");
			}
			System.out.println("Do you want to re run this programme?(Press y for yes and n for No)");
			yn = sc.next();
		}
		while(yn.equals("y") || yn.equals( "Y"));

	}
}






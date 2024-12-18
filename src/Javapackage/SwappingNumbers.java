package Javapackage;

public class SwappingNumbers {



	public static void main(String[] args) {
		int a=10,b=20,temp;

		temp= a; // temp becomes 10
		a=b;     // a becomes 20
		b = temp;  // b becomes 10

		/*b = a+b;
	    a = b-a;
	    b = b-a;*/

		System.out.println("a's value is "+a);
		System.out.println("b's value is "+b);


	}

}

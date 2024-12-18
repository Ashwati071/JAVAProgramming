package Javapackage;

public class PrimeNumber {


	public static void main(String[] args) {

		int num=7;
		int count=0;

		for (int i =2;i<=num-1;i++) 
		{
			
			if(num%i==0) {
				
				count=count+1;
			}
		}

		if (count>0) {             // we have to mention it outside the for loop,otherwise it will keep on printing same line in the console.
			System.out.println(num+ " is not prime number");  
		}
		else {
			System.out.println(num+ " is a prime number");

		}
	}

}











package Javapackage;

public class PrimeNumbers {

	public static void main(String[] args) {

		//WAP to print all prime numbers between 1 to 100

		int num =100;int count=0;
		for (int i=1;i<=num;i++) 
		{
			for(int j=2; j<=i-1; j++) 
			{
				if(i%j==0) 
				{
					count=count+1;
				}

			}
			if(count==0) 
			{
				System.out.println(i);

			}
			else {
				count=0;

			} 

		}



	}

}

package Javapackage;

public class AmstrongNumberSecondMethod {

	public static void main(String[] args) {

		int num=153;
		int t1=num;
		int t2=num;
		int length=0;
		int rem;
		int arm=0;
		//1st logic to calculate how many digits are there in that number. which will give the length
		
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;  // Here we will get the output of length i.e; 3
		}
		
		// now put the 2nd logic.calculate the modulus. that will give rem.for each rem multiply with no of length found from 1st  logic
		
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			 arm=arm+mul;
			 t2=t2/10;

		}
		if(arm==num) {
			System.out.println("Number is amstrong number");
		}
		else {
			System.out.println("Number is not a amstrong number");

		}
	}

}

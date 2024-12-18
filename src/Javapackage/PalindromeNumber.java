package Javapackage;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num =121;
		int temp= num;  //storing the original value in temp variable, will use it while comparing
		int rev =0;
		int rem;

		while(num>0) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev);
		if(rev==temp) 
		{
			System.out.println("Number is palindrome number");
		}
		else {
			System.out.println("Number is not a palindrome number");

		}

	}

}

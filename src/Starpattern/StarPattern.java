package Starpattern;

public class StarPattern {

	public static void main(String[] args) {

		//pattern1(4);
		//pattern2(4);
		//pattern3(4);
		pattern4(6);
		

	}
	static void pattern1(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1; j<=n;j++) 
			{
				System.out.print("* ");


			}
			System.out.println();

		}

	}
	
	static void pattern2(int n) 
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{

				System.out.print("*");
			}
			System.out.println();

		}
	}
	
	static void pattern3(int n)
	{
	  for(int i=1; i<=n; i++)
	  {
		for(int j=n; j>i-1;j--)
		{
			System.out.print("*");

		}
		System.out.println();

	  }
	}
	static void pattern4(int n)
	{
		for(int row=1;row<=n;row++) 
		{
			int totSpace =n-row;
			for(int s=0;s<totSpace;s++)
			{
				System.out.print(" ");

			  }
			   for (int col=1;col<=row;col++)
			    {
				System.out.print("*");
			    }
			     System.out.println();
		}
	}
}




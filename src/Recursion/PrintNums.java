package Recursion;

public class PrintNums {

	public static void main(String[] args)
	{
		//print1(5);
		//print2(5);
		print3(5);
	}

	static void print1(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		print1(n-1);
	}

	static void print2(int n)
	{
		if(n==0)
		{
			return;
		}
		print2(n-1);
		System.out.println(n);

	}

	static void print3(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		print3(n-1);
		System.out.println(n);

	}



}

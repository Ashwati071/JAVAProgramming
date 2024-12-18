package Javapackage;

public class AmstrongNumber {
	
     
	public static void main(String[] args) {
		
		int num= 153;
		int original=num;
		int rem;
		int sum=0;
		 while(num>0)
		 {
			 rem=num%10;
			 sum=sum+rem*rem*rem;
			 num=num/10;
		 }
		 if(sum==original)
		 {
			 System.out.println("Number is amstrong number");
		 }
		 else
		 {
			 System.out.println("Number is not amstrong number"); 
		 }
	}
}

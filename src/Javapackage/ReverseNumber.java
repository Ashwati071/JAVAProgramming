package Javapackage;

public class ReverseNumber {

	public static void main(String[] args) {
      
		int num = 5462;    // Reverse=2645
		int rem;
		int res=0;
		
		while(num>0) {
			rem=num%10;       //2 , 6 ,4 ,5
			res=res*10+rem;   //0*10+2= 2 , 2*10+6=26, 26*10+4=264 , 264*10+5=2645
			num=num/10;       //546 ,54 ,5 ,0
		}
		System.out.println(res);
	}

}

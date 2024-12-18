package Javapackage;

public class FactorialNumber {

	public static void main(String[] args) {

		//5!=5*4*3*2*1= 120
		int a=5;
		int fact=1;

		for(int i=1;i<=a;i++) {
		fact=fact*i;	
		}
		System.out.println(fact);

		/*Here i can apply logic of counting 1 table till 5, 
		instead of storing the result in every multiplication, i keep on multiply till 5 , then print final number*/
		
	}

}

package OOP;

public class Main {

	public static void main(String[] args) {

		//Box box1 =new Box();
		//box1.greeting();    // i am in box class
		
		//BoxWeight box2 = new BoxWeight();
		//box2.greeting();
		

		
        Box box = new BoxWeight();
		Box.greeting();       /* I am in box class(when the methods in both parent and child are static.overriding not happening.
		//other wise it would have printed i am in box weight class.that means u cn not override static method*/
		
		/*You can inherit static but you can't override. You can run but u can't hide*/

		

		
		
		
		
	}

}

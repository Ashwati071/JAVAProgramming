package Interfaces;

public class Demo {

	public static void main(String[] args) {

//		Car car =new Car();
//		car.start();
//		car.stop();
//		car.acc();
//		System.out.println(car.a);

		//     Engine car = new Car();
		//     System.out.println(car.a);
		// here we are not able to access int a which is declared in car class.bcoz the reference variable can access only Engine
		//class not car.it cn access if the ref variable is created in Engine class.
		
		
		NiceCar car= new NiceCar();
		car.start();
		car.startMusic();
		car.upgradeEngine();
		car.start();

	}

}

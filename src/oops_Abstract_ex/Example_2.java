package oops_Abstract_ex;
//Abstract class
abstract class Car {
 abstract void start();
 abstract void stop();
}

//Concrete subclass
class Sedan extends Car {
 void start() {
     System.out.println("Sedan car has started");
 }
 
 void stop() {
     System.out.println("Sedan car has stopped");
 }
}


public class Example_2 {

	public static void main(String[] args) {
		Car car = new Sedan();
	     car.start();
	     car.stop();
	

	}

}

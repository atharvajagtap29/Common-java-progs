// we cannot create object of abstract class. we can create a reference of an abstract class if someone is extending the abstract class
// abstract class may or maynot contain abstract methods. it is not compulsary that it should contain abstract methods

abstract class Bike{
	Bike(){ // abstract class constructor
		System.out.println("Bike is created successfully!");
	}
	
	abstract void run();
	
	void changeGear(){
		System.out.println("Changing the gear");
	}
}

class Honda extends Bike{
	Honda(){
		System.out.println("I am Honda classes constructor. I will be called after calling super classes constructor");
	}
	void run(){
		System.out.println("Bike is running smoothly...");
	}
}

public class Exg1{
	public static void main(String[] args){
		
		Bike b1 = new Honda();  // when object of subclass is created it will by default call the constructor of superclass as its first action
		b1.run();
		b1.changeGear();
		
	}
}

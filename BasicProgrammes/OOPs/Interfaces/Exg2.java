// an example of multiple inheritance achieved via interfaces in java

interface Printable{
	void print();
}

interface Showable{
	void show();
}

class Actions implements Printable, Showable{

	public void show(){
		System.out.println("I am showing here..");		
	}
	
	public void print(){
		System.out.println("I am printing here..");
	}
}

public class Exg2{
	public static void main(String[] args){
		
		Actions a1 = new Actions();
		a1.show();
		a1.print();
		
	}
}

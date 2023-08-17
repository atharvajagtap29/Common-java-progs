// method overloading

class Operations{
	void add(int a, int b){
		System.out.println("The addition of two numbers is "+(a+b));
	}
	void add(double a, double b){
		double sum = Math.round((a+b) * 100) / 100;
		System.out.println("The addition of two decimal numbers is "+sum);
	}
	void add(int a, int b, int c){
		System.out.println("The addition of three numbers is "+(a+b+c));
	}
}

public class Compiletime{
	public static void main(String[] args){
		Operations o1 = new Operations();
		o1.add(10,20);
		o1.add(5.3, 50.8);
		o1.add(14, 28);
	}
}

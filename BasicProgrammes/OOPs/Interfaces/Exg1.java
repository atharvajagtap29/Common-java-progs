// in interfaces you can declare methods
// all methods are public abstract here by default
// all variables declared in interfaces are public static final

interface Drawable{
	public abstract void draw();
}

class Circle implements Drawable{
	public void draw(){
		System.out.println("Drawing a circle");
	}
}

class Square implements Drawable{
	public void draw(){
		System.out.println("Drawing a square");
	}
}

public class Exg1{
	public static void main(String[] args){
		Drawable d1 = new Circle();
		Drawable d2 = new Square();
		
		d1.draw();
		d2.draw();
	}
}

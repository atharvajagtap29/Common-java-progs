class Employee{
	String name;
	double salary;
}
class Programmer extends Employee{
	double bonus;
	void totalSal(){
		double sum = salary + bonus;
		System.out.println("Total salary of Programmer is "+sum);
	}
}
// hirerchial inheritance
class HR extends Employee{
	double bonus;
	void totalSal(){
		double sum = salary + bonus;
		System.out.println("Total salary of HR is "+sum);	
	}	
}

public class Exg1{
	public static void main(String[] args){
	
		Programmer p1 = new Programmer();
		p1.name = "Atharva";
		p1.salary = 34000;
		p1.bonus = 10000;
		p1.totalSal();
		
		HR h1 = new HR();
		h1.salary = 25000;
		h1.bonus = 8000;
		h1.totalSal();
	}
}

import java.util.Scanner;

public class CountDigits{
	
	static void Method1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		String numToString = Integer.toString(num);
		
		System.out.println("The number of digits in the number "+num+" are "+numToString.length());
	}
	
	static void Method2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num > 0){
			num = num / 10;
			count++;
		}
		
		System.out.println("The number of digits are "+count);
	}
		
	public static void main(String[] args){
		//Method1();
		Method2();
	}
}

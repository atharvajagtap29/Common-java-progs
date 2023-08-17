import java.util.Scanner;

public class EvenOddCntNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int evenCnt = 0;
		int oddCnt = 0;
		
		while(num > 0){
			int rem = num % 10;
			
			if(rem % 2 == 0){
				evenCnt++;
			} else{
				oddCnt++;
			}
			
			num = num / 10;
		}
		
		System.out.println("Even Count: "+evenCnt);
		System.out.println("Odd Count: "+oddCnt);
	}
}

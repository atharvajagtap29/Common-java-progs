import java.util.Scanner;

public class ReverseNum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    
    // algorithm
    int rev = 0; 
    while(num != 0){
      int remainder = num%10; // returns last digit of number. 1234 -> gives 4
      rev = rev*10 + remainder; 
      num = num/10; // eliminates that last digit from number. 1234 -> 123
    }
    
    System.out.println("The reverse number is "+rev);
  }
}

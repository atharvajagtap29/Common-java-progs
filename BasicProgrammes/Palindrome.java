import java.util.Scanner;
public class Palindrome{

  static void NumExg(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check");
    int num = sc.nextInt();
    int temp = num;
    
    // logic same as reverse number
    int rev = 0;
    while(num!=0){
      int remainder = num%10;
      rev = rev*10 + remainder;
      num = num/10;
    }
    if(rev == temp){
      System.out.println("Palindrome Number");
    } else{
      System.out.println("Not Palindrome");
    }
  }
  
  static void StringExg(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String to check");
    String s = sc.next();
    String temp = s;
    
    String rev = "";
    for(int i=s.length()-1; i>=0; i--){
      rev = rev+s.charAt(i);
    }
    if(rev.equals(temp)){
      System.out.println("Palindrome String");
    } else{
      System.out.println("Not Palindrome String");
    }
  }
  
  public static void main(String[] args){ 
    //NumExg();
    StringExg();
  }
  
}

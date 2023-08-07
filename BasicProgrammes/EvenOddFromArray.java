import java.util.Scanner;
public class EvenOddFromArray{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of elements you want to enter");
    int length = sc.nextInt();
    
    int arr[] = new int[length];
    
    System.out.println("Enter the numbers");
    for(int i=0; i<length; i++){
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Even numbers are: ");
    for(int i=0; i<length; i++){
      if(arr[i]%2==0){
        System.out.print(arr[i]+" ");
      }
    }
    
    System.out.print("\nOdd numbers are: ");
    for(int i=0; i<length; i++){
      if(arr[i]%2!=0){
        System.out.print(arr[i]+" ");
      }
    }
  }
}

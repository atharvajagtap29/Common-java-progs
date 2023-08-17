import java.util.Scanner;
public class SumArrayElements{
  static void Sum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int array[] = new int[size];
    
    // accept elements
    System.out.println("Enter the numbers of array");
    for(int i=0; i<size; i++){
      array[i] = sc.nextInt();
    }
    // print elements
    System.out.println("Elements are: ");
    for(int i=0; i<size; i++){
      System.out.print(array[i]+" ");
    }
    // add up the elements
    int sum = 0;
    for(int i=0; i<size; i++){
      sum = sum+array[i];
    }
    System.out.println("\nThe sum of these elements is "+sum);
  }
  public static void main(String[] args){
    Sum();
  }
}  

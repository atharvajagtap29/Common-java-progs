import java.util.Scanner;
public class MissingNum{
  public static void Exg(){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers you want to enter");
    int length = sc.nextInt();
    int array[] = new int[length];
    
    for(int i=0; i<length; i++){
      System.out.println("Enter the number at "+i);
      array[i] = sc.nextInt();
    }
    
    int max = array[0];
    for(int i=0; i<length; i++){
      if(array[i] > max){
        max = array[i];
      }
    }
    System.out.println("The maximum number from this array is "+max);
    
    int min = array[0];
    for(int i=0; i<length; i++){
      if(array[i] < min){
        min = array[i];
      }
    }
    System.out.println("The minimum number from this array is "+min);
    
    // now finding out the missing number
    int sum1 = 0;
    for(int i=0; i<length; i++){
      sum1 = sum1+array[i];
    }
    System.out.println("First sum is "+sum1);
    
    int sum2 = 0;
    for(int i=min; i<=max; i++){
      sum2 = sum2+i;
    }
    System.out.println("Second sum is "+sum2);
    
    int missingNum = sum2-sum1;
    System.out.println("In the array you provided the missing number is "+missingNum);
  }
  
  public static void main(String[] args){
    Exg();
  }
}

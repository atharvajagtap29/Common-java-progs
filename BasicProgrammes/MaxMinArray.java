import java.util.Scanner;
public class MaxMinArray{
  public static void Exg(){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers you want to enter");
    int length = sc.nextInt();
    int numbers[] = new int[length];
    
    for(int i=0; i<length; i++){
      System.out.println("Enter the number at "+i+": ");
      numbers[i] = sc.nextInt();
    }
    
    int max = numbers[0];
    //System.out.println(max);
    for(int i=0; i<length; i++){
      if(numbers[i] > max){
        max = numbers[i];
      }
    }
    System.out.println("Maximum number from the given array is "+max);
    
    int min = numbers[0];
    for(int i=0; i<length; i++){
      if(numbers[i] < min){
        min = numbers[i];
      }
    }
    System.out.println("The minumum number from the given array is "+min);
  }
  public static void main(String[] args){
    Exg();
  }
}

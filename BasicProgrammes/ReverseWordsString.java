import java.util.Scanner;
public class ReverseWordsString{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String s = sc.nextLine();
    
    System.out.println("The reversed string is:");
    String arr[] = s.split(" ");
    for(int i=arr.length-1; i>=0; i--){
      System.out.print(arr[i]+" ");
    }
  }
}

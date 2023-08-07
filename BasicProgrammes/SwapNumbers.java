public class SwapNumbers{
  public static void main(String[] args){
    int num1 = 10;
    int num2 = 20;
    System.out.println("Before swapping numbers are: Number 1 = "+num1+" and Number 2 = "+num2);
    
    /*swap logic 1 with third variable
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("\nLogic1 swap: Number 1 = "+num1+" and Number 2 = "+num2);*/
    
    /*swap logic 2 without third variable
    num1 = num1+num2; //10+20=30
    num2 = num1-num2; //30-20=10
    num1 = num1-num2; //30-10=20
    System.out.println("Logic2 swap: Number 1 = "+num1+" and Number 2 = "+num2);*/
  }
}

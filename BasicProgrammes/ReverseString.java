public class ReverseString{

  static void First(String s){
    String rev = "";
    for(int i=s.length()-1; i>=0; i--){
      rev = rev+s.charAt(i);  // extract last alphabet and add in this string
    }
    System.out.println("OG String: "+s);
    System.out.println("Reverse String: "+rev);
  }
  
  public static void main(String[] args){
    First("ABCDE");
  }
}

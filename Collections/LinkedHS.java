import java.util.LinkedHashSet;

public class LinkedHS{
  public static void main(String[] args){
    
    // declaration
    // here duplicates are not allowed but the insertion order is preserved
    LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
    lhs.add("Atharva");
    lhs.add("Darshana");
    lhs.add("Riddhi");
    lhs.add("Srushti");
    lhs.add("Sayali");
    System.out.println(lhs);
  }
}

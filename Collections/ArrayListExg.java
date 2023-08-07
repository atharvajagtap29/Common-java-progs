import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListExg {
  public static void main(String[] args) {
  
      // Declare ArrayList with specific type 
      ArrayList<Object> al = new ArrayList<Object>();  // Use Object type to accept heterogeneous data 
      // ArrayList<Integer> al = new ArrayList<>();   // will accept duplicate and only integer type data
      // ArrayList<String> al = new ArrayList<>();   // will store only string type data 
      // List<Integer> al = new ArrayList<>();  // since List interface is the parent interface of ArrayList class, we can use it as a reference object
      
      // Add new elements to the ArrayList
      al.add(17);
      al.add("Atharva");
      al.add(10.5);
      al.add(true);
      al.add('A');
      
      // Print the ArrayList
      System.out.println(al);
      
      // Print size
      System.out.println("The size of the array list is "+al.size());  // prints the count of the object present in the array list
      
      // Remove
      al.remove(1); // removes object at 1st index
      //al.remove(17); // can directly pass an object too
      System.out.println(al);
      
      // Insert new element
      al.add(1, "Atharva");  // will add new obj at specified index position
      al.add("Darshana");  // will add a new object at the end
      System.out.println(al);
      
      // Retrieve element
      System.out.println(al.get(5)); // gets elements at index 5;
      
      // replace element
      al.set(0, "Srushti"); // will replace element at 0 with specified element 
      System.out.println(al);
      
      // search if
      System.out.println(al.contains("Darshana")); // boolean value
      System.out.println(al.contains("Pranav")); 
      
      // if empty
      System.out.println(al.isEmpty());  // is empty or not
      
      
      // Reading the data
      
      // 1) for loop
      System.out.println("\nReading data using for loop");
      for(int i=0; i<al.size(); i++){
          System.out.println(al.get(i));
      }
      
      // 2) foreach loop
      System.out.println("\nReading data using for each loop");
      for(Object e: al){
          System.out.println(e);
      }
      
      // 3) iterator() - method present in the iterable interface which is implemented by collection interface classes
      System.out.println("\nReading data using iterator interface");
      Iterator it = al.iterator();  
      while(it.hasNext()){
          System.out.println(it.next());
      }
  }
}


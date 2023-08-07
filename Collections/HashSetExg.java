import java.util.HashSet;
import java.util.Iterator;

public class HashSetExg{
  public static void main(String[] args){
    
    // declaration
    HashSet<Object> hs = new HashSet<Object>();  // default capacity 16 and load factor is 0.75
    //HashSet<Object> hs = new HashSet<Object>(100, float(0.90));  // initial capacity 100 and load factor is 0.90 i.e when 90 percent space is utilized it will create a new space of specified load factor.
    
    // add
    hs.add(1);
    hs.add("Hello");
    hs.add("World");
    hs.add(10.5);
    hs.add(true);
    hs.add(null);
    hs.add(false);
    System.out.println(hs); 
    
    // remove
    hs.remove(10.5);
    System.out.println(hs);
  
    // contains
    System.out.println(hs.contains(10.5));
    
    // reading data
    System.out.println("With for each loop:");
    for(Object e : hs){
      System.out.println(e);
    }
    //Iterator
    System.out.println("\nWith for iterator class:");
    Iterator it = hs.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}

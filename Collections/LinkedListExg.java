import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExg{
    public static void main(String[] args){
        
        // Creating linkedList
        LinkedList<Object> list = new LinkedList<Object>();  // heterogeneous data
        //LinkedList<Integer> list = new LinkedList<Integer>(); // only numbers, and likewise for other data types
        
        // Add elements to linked list
        list.add('A');
        list.add("Yash");
        list.add(43);
        list.add(10.6);
        list.add(false);
        list.add(null);
        
        System.out.println(list);
        System.out.println("Count of nodes added internally are "+list.size());  // count of elements
        
        // Remove
        list.remove(0);  // removing by index, but you can also remove by passing value
        System.out.println("After removing, list "+list);
        
        // Insert
        list.add(3, "Java"); // will add to 3rd index position
        System.out.println("After adding java to 3rd index position, list "+list);
        
        // Retriving element
        System.out.println(list.get(3));
        
        // replace
        list.set(4, 'X');
        System.out.println("After setting X"+list);
        
        
        // Reading elements using
        
        // 1) For Loop
        System.out.println("\nUsing for loop:");
        for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
        }
        
        //2) For each loop
        System.out.println("\nUsing for each loop");
        for(Object e : list){
          System.out.println(e);
        }
        
        //3) Iterator method
        System.out.println("\nUsing Iterator method:");
        Iterator it = list.iterator();
        while(it.hasNext()){
          System.out.println(it.next());
        }
        
    }
}

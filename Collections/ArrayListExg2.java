import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExg2{
    public static void main(String[] args){
    
        ArrayList<String> al = new ArrayList<String>();        
        
        al.add("Yash");
        al.add("Ronak");
        al.add("Pranav");
        al.add("Atharva");
        al.add("Prajwal");
        
        ArrayList<String> duplicateList = new ArrayList<String>();
        duplicateList.addAll(al);  // adding a collection to a collection using addAll method
        
        duplicateList.add("Ankit");  // adding to know difference
        //System.out.println(duplicateList);
        
        duplicateList.removeAll(al);  // will remove all the elements of al collection from duplicateList collection
        //System.out.println("After removing "+duplicateList);
        
        // Sorting
        System.out.println("Elements right now in the list "+al);    
        Collections.sort(al);
        System.out.println("Elements in the list after sorting "+al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Elements in reversed order "+al);
        
        // Shuffling
        Collections.shuffle(al);
        System.out.println("Elements after shuffling "+al);
    } 
}

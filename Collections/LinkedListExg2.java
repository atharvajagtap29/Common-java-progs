import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExg2{
	public static void main(String[] args) {
		
		// 1) Sorting a given array
		String[] friends = {"Ross", "Rachel", "Joey", "Chandler", "Monica", "Phoebe"};
		System.out.println("Unsorted list is:");
		for(String e : friends){
		  System.out.println(e);
		}
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(friends));
		Collections.sort(list);
		System.out.println("\nSorted list is "+list);
		
		// Shuffling elements
		Collections.shuffle(list);
		System.out.println("Shuffled list "+list);
		
		// 2) The addAll method is same as the ArrayList one
		list.add("Mark");
		list.add("Ted");
		list.add("Susane");
		list.add("Gunther");
		System.out.println("\nAdded new elements "+list);
		
		//list.removeAll(list);
		//System.out.println("After removing all "+list);
		
		
		// methods specifically associated with LinkedList class
		list.addFirst("Atharva");  // adds element at first position of the list
		list.addLast("Yash");  // adds element at last position
		System.out.println("After adding to first and last "+list);
		
		System.out.println(list.getFirst()); // get first element
		System.out.println(list.getLast());  // get last element
		
		list.removeFirst();
		list.removeLast();
		System.out.println("After removing first and last elements list "+list);
	}
}

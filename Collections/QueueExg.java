import java.util.PriorityQueue;

public class QueueExg{
  public static void main(String[] args){
    
    // declaration
    PriorityQueue<String> q = new PriorityQueue<String>();  // here hetro data is not allowed
    
    // adding elements by both offer() and add() methods
    q.add("Atharva");
    q.add("Atharva");
    q.offer("Shravan");
    q.offer("Rohit");
    System.out.println(q);
    
    // get head element by both element() and peek() method
    System.out.println(q.element());  // if queue is empty throws an exception
    System.out.println(q.peek());  // if queue is empty returns null
    
    // return and remove head element by both remove() and poll() methods
    System.out.println(q.remove());  // if queue is empty it will return exception
    System.out.println(q);
    System.out.println(q.poll());  // if queue is empty it will return null
    System.out.println(q);
  }
}

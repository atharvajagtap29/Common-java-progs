import java.util.HashSet;

public class HashSetExg2{
  public static void main(String[] args){
  
    HashSet<Integer> grp1 = new HashSet<>();
    grp1.add(2);
    grp1.add(4);
    grp1.add(6);
    grp1.add(8);
    grp1.add(5);
    grp1.add(7);

    HashSet<Integer> grp2 = new HashSet<>();
    grp2.add(1);
    grp2.add(3);
    grp2.add(5);
    grp2.add(7);

    HashSet<Integer> numbers = new HashSet<>();
    numbers.addAll(grp1);
    numbers.addAll(grp2);
    System.out.println("All numbers are " + numbers);

    // Intersection
    HashSet<Integer> intersection = new HashSet<>(grp1);
    intersection.retainAll(grp2);
    System.out.println("Intersection. Common elements: " + intersection);

    // Remove all
    numbers.removeAll(grp2);
    System.out.println("After removing odd: " + numbers);
    numbers.removeAll(grp1);
    System.out.println("After removing even: " + numbers);

    // Union
    grp1.addAll(grp2);
    System.out.println("Union. Unique elements: " + grp1);


  }
}


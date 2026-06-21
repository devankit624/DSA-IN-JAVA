// Java Framework Collections - 1 Part-2
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
public class variousfunctions{
    public static void main(String[] args){       
        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(50);
        n2.add(10);
        n2.add(8);
        n2.add(2);
        System.out.println(n2);
        // sorted in the array list
        Collections.sort(n2);
        System.out.println(n2);
        System.out.println("Clone List");
        ArrayList <Integer> newlist = (ArrayList<Integer>)n2.clone();
        System.out.println(newlist);
        newlist.ensureCapacity(100);
        System.out.println(newlist.isEmpty());
        System.out.println(newlist.indexOf(50));
        //Java Linked List
        // Cloning in the Linked list Not Possible
        LinkedList<Integer> n2 = new LinkedList<>();
        n2.add(50);
        n2.add(10);
        n2.add(8);
        n2.add(2);
        System.out.println(n2);
        // sorted in the array list
        Collections.sort(n2);
        System.out.println(n2);
        System.out.println("Clone List");
        LinkedList <Integer> newlist = (LinkedList<Integer>)n2.clone();
        System.out.println(newlist);
        //newlist.ensureCapacity(100);
        System.out.println(newlist.isEmpty());
        System.out.println(newlist.indexOf(50));
        System.out.println(n2);
        n2.add(50);
        n2.add(70);
        n2.add(50);
        n2.add(30);
        n2.add(50);
        n2.add(10);
        System.out.println(n2);
        System.out.println(n2.lastIndexOf(50));
        System.out.println(n2);
        n2.remove(3);
        n2.remove(3);
        n2.remove(3);
        n2.remove(3);
        n2.remove(3);
        n2.remove(3);
        System.out.println(n2);
        n2.addFirst(50);
        System.out.println(n2);
        n2.addLast(1010);
        System.out.println(n2);
        n2.removeFirst();
        System.out.println(n2);
        n2.removeLast();
        System.out.println(n2);        
        System.out.println(n2.getFirst());
        //peek print first element of the Linked List
        System.out.println(n2.peek());
        // poll return and remove the forst element of the first element of the Linked List
        System.out.println("after polling" + n2.poll());
        System.out.println(n2);
        // "offer" add the element at the last of the Linked List
        System.out.println(n2.offer(909));
    }
}
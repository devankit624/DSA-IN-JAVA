import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
public class jcf1,2{
    public static void main(String[] args){
        //Implementing Queue by the Linked List
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(50);
        q1.add(70);
        q1.add(80);
        q1.add(89);
        //add -> add element in the first
        //remove -> remove element from the first
        //peek -> Return first element
        //offer -> all last element
        //poll -> return and remove the first element
        System.out.println(q1);
        System.out.println(q1.offer(45));
        q1.remove(70);
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1);
        //implementing the Queue by the Array
        Queue<Integer> d1 = new ArrayDeque<>();
        d1.add(50);
        d1.add(70);
        d1.add(45);
        d1.add(26);
        System.out.println(d1);
        //stack
        Deque<Integer> s1 = new ArrayDeque<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
        // priority queue-> follow the which has more priority
        // priority queue-> gives the special privilage/preference
        Queue<Integer> p1 = new PriorityQueue<>((a,b) -> b-a);
        p1.add(20);
        p1.add(50);
        p1.add(98);
        System.out.println(p1);
        p1.remove();
        System.out.println(p1);
        // offer -> adding element at the last
        // priority queue-> less priority integers -> remove at the first -> default craeteed a min heap
        // (a,b) -> b-a - > created a max Heap
        // in the strinfgs make the own comparator
        p1.offer(20);
        p1.offer(50);
        p1.offer(98);
        System.out.println(p1);
        System.out.println(p1.poll());
    }
}
// Sets in java collection framework
// Sets store the unique elements 
// dublicate elements not allowed in the sets
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class jcf-2,2{
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>();
        // Only one times show
        // order do not presrve in the set
        // Intersection of the set called -> Retain all the set
        Set<Integer> s2 = new HashSet<>();
        // Set - 1 ->
        s1.add(10);
        s1.add(10);
        s1.add(20);
        s1.add(20);
        s1.add(30);
        s1.add(30);
        // Set - 2 ->
        s2.add(10);
        s2.add(20);
        s2.add(40);
        s2.add(30);
        s2.add(89);
        // input the dublicate elements but the only ones time addded
        System.out.println("Set - 1 -> " + s1);
        System.out.println("set -2 -> " + s2);
        s1.retainAll(s2);
        System.out.println("Intersection called retain all -> " + s1);
        System.out.println(s1.containsAll(s2));
        System.out.println(s2.containsAll(s1));

        // In place of the Hash Set used linked Set
        // Order Follow in the LinkedHashSet
        Set<Integer> l1 = new LinkedHashSet<>();
        // order prerserve in the Linked hash Set
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println("by LinkedHashSet" + l1);
        // TreeSet
        Set<Integer> l2 = new TreeSet<>();
        // In TreeSet the output gives in the Soretd form
        // Automatically Sorted in the TreeSet 
        l2.add(98);
        l2.add(95);
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        System.out.println("by TreeSet" + l2);

        // TimeComplexity->
        // HashSet -> O(1);
        // LinkedHashSet -> O(n)
        // TreeSet -> BST -> O(log(n))

    }

}
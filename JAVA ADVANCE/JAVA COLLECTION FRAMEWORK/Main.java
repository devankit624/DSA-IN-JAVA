// Java Framework Collections - 1 Part-1 

import java.util.ArrayList;
import java.util.List;
public class Main{

    //Java collection framework is the set of that implement the vartious typesd ofg the 
   // Data Structuure
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList <>();
        arr.add(50);
        arr.add(40);
        arr.add(70);
        System.out.println(arr);
        arr.remove(2);
        System.out.print(arr);


        // Add all in the LList
        List<Integer> List1 = new ArrayList<>();
        List1.add(80);
        List1.add(90);
        arr.addAll(List1);
        System.out.println(List1);
        arr.removeAll(List1);
        System.out.println(List1);
        System.out.println(List1.size());
        List1.clear();
        System.out.println(List1.size());
        List<Integer> n1 = new ArrayList<>();
        n1.add(50);
        n1.add(689);
        n1.add(485);
        n1.add(481);
        System.out.println("before set" + n1);
        System.out.println(n1.get(2));
        n1.set(1,589);
        System.out.println("After List" + n1);

        // any daytatype to array conversion
        Object[] arry = n1.toArray();
        for (Object obj: arry){
            System.out.println(obj);
        }
        System.out.println(n1.contains(589));


    }
}
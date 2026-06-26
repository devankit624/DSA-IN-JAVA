// Problem ->
// find first dublicate element
import java.util.HashMap;
public class firstdublicate{
    static int finddublicate(int[] arr){
        HashMap<Integer , Integer> freq = new HashMap<>();
        for (int num : arr){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }
        for (int i : arr){
            if(freq.get(i) > 1){
                return i;
            } 
        }
        return -1;
    }

public static void main(String[] args){
    int[] arr = {1,2,4,2,5,6};
    int ans = finddublicate(arr);
    System.out.println(ans);
}
}


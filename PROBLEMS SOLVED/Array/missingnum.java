// Find dublicate in the Repeated Array list
import java.util.ArrayList;
import java.util.List;
public class missingnum{
    static List<Integer> findmissing(int[] arr){
    // marking
    List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0 ; i< n ; i++){
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position] > 0){
                arr[position] = -arr[position];
            }
        }
for (int j = 0 ; j < n ; j++){
    if (arr[j] > 0){
        int value = j+1;
        ans.add(value);
    }
}
return ans; 
}
public static void main(String[] args){
    int[] arr = {1,2,2,3,5};
    List<Integer> ans = findmissing(arr);
    for (int num : ans){
        System.out.print(num + ", ");
 }
}
}

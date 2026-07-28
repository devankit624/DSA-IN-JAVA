import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
   public static void solve(int[] nums, int index, List<Integer>output , List<List<Integer>> ans){
        // base  case 
        if(index >= nums.length){
            // ans is ready to put in the ans 
            ans.add(new ArrayList<> (output));
            return;
        }
        // include
        //current to pahele call karo
        int currentvalue = nums[index];
        output.add(currentvalue);
        solve(nums, index + 1, output , ans);
        output.remove(output.size() - 1);
        // ecxlude ka case ye hai
        while(index + 1 < nums.length && nums[index] == nums[index + 1]){
            index++;
        }

        // ab hum log exclude ki call marenge
        solve(nums, index + 1 , output, ans);


    }
    public static List<List<Integer>> subsets(int[] nums){
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int index = 0;
        solve(nums, index , output , ans);
        return ans;
    }
    
}

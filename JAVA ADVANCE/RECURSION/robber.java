public class robber{
    public static int solve(int[]arr, int index){
        if(index >= arr.length){
            return 0;
        }
        // both include and exclude case
        // include 
        int includeans = arr[index] + solve(arr, index+2);
        int excludeans = 0 + solve(arr, index+1);
        int finalans = Math.max(includeans, excludeans);
        return finalans;
    }
        // solving by the reccursion
        public static int robberprob(int[] nums){
            int index = 0;
            int solve = solve(nums, index);
            return solve;
        }
}

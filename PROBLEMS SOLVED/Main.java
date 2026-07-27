public class Main{
    public static boolean solve(int[] arr, int sum , int k , int index){
        if(index >= arr.length){
            if(sum == k){
                return true;
            }
            else{
                return false;
            }
        }
        int currentvalue = arr[index];
        // exclude 
        boolean exclude = solve (arr,sum,k,index+1);
        // include
        boolean include = solve(arr, sum + currentvalue, k, index+1);
        boolean finalans = exclude || include;
        return finalans;
    }
    public static boolean subsequence(int[] arr, int k){
        int sum = 0;
        int index = 0;
        boolean ans = solve(arr, sum , k , index);
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,4,7,8,9,5};
        int k = 100;
        boolean ans = subsequence(arr, k);
        System.out.println(ans);
    }
}
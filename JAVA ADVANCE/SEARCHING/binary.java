public class binary{
    public static int binaryserch(int[] arr, int target){
       // Binary Search ->
        // Time complexity = O(log(n))
        int n = arr.length;
        int mid;
        int start = 0;
        int end = n - 1;
        mid = start + (end - start) / 2;
        while(start <= end){
            if (target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }

            // update mid
            mid = start + (end - start) / 2;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5,7,9};
        int target = 9;
        int ans = binaryserch(arr, target);
        System.out.println(ans);
    }
}

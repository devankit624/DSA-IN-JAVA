// search in rotated search array
public class Main{
    public static int searchrotated(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        if (arr[0] < arr[n-1]){
            return -1;
        }
        while(start < end){
        int mid = start + (end - start) / 2;
        if (arr[mid] <= arr[n-1]){
            end = mid - 1;
        }
        else {
            ans = mid;
            start = mid + 1;
        }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};
        int ans = searchrotated(arr);
        System.out.println(ans);
    }
}
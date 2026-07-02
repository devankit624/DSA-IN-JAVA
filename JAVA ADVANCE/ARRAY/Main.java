// Mountain peak
// On the leftr side the elements are smaller than the mountain element.
public class Main{
    public static int findmountain(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;      
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            
            else{
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,4,2};
        int ans = findmountain(arr);
        System.out.println(ans);
    }
}
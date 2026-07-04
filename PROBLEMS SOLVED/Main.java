public class Main{
    public static int searchalmostsorted(int[] arr, int target){
        int  n = arr.length;
        int s = 0;
        int e = n - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(mid - 1 >=0 && arr[mid - 1] == target){
                return mid - 1;
            }
            else if(mid + 1 < n && arr[mid + 1] == target){
                return mid + 1;
            }
            if(target > arr[mid]){
                s = mid + 2;
            }
            else{
                e = mid - 2;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {5,10,20,30,40};
        int target = 20;
        int ans = searchalmostsorted(arr, target);
        System.out.println(ans);
    }
}
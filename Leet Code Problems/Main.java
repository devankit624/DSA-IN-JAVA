// Cow Arranging problem
public static void Main{
    public static boolean iscowvalid(int[] arr, int k , int cow){
        int n = arr.length;
        int cowcount = 1;
        int lastposition = 0;
        for (int i = 0; i < n ; i++){
            if(arr[i] - arr[lastposition] >= cow){
                cowcount++;
            }
            lastposition = i;
            if(cowcount == k){
                return true;
            }
        }
        return false;
    }
    public static int cowproblem(int[] arr , int k){
        Array.sort(arr);
        int s =0;
        int n = arr.length;
        int e = arr[n-1] - arr[0];
        int ans = -1;
        while (s <= e){
            int mid = s + (e - s) / 2;
            if(iscowvalid(arr, k , mid)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
}
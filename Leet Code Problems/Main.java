// Painter Partition Problem (PPP) ->
public class Main{

    public static boolean isvalidpainter(int[] arr, int k , int maxlength){
        int n = arr.length;
        int paintercount = 1;
        int painterdlength = 0;
        if(painterdlength < arr[i] <= maxlength){
            painterdlength = painterdlength + arr[i];
        }
        else{
            paintercount++;
            painterdlength = 0;
            if(paintercount < k || arr[i] > maxlength){
                return false;
            }
            else{
                painterdlength = painterdlength + arr[i];
            }
        }
        return true;
    }
    public static int painterprob(int[] arr, int k){
        int n = arr.length;
        int s = 0;
        int sum = 0;
        int ans = -1
        for (int i = 0; i < n ; i++){
            sum += arr[i];
        }
        int e = sum;
        while (s <= e){
            int mid  = s + (e - s) / 2;
            if(isvalidpainter(int[] arr , int k , int mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
    }
}
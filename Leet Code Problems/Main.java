// Book allocation problem->
public class Main{

    public static boolean isanswervalid(int[] arr, int k , int maxpages){
        int studentcount = 1;
        int pages = 0;
        for (int i = 0; i < arr.length ; i++){
            if(pages + arr[i] <= maxpages){
                pages = pages + arr[i];
            }
            else {
                studentcount++;
                if (studentcount > k){
                    return false;
                }
                else if(arr[i] > maxpages){
                    return false;
                }
            }
        }
        return true;
    }
    public static int findpages(int[] arr, int k){
        int n = arr.length;
        int s = 1;
        int sum = 0;
        for (int i =0 ; i < n ; i++){
            sum += arr[i];
        }
        int e = sum;
        int ans = -1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(isanswervalid(arr,k,mid)){
                ans = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return ans;
    }
}


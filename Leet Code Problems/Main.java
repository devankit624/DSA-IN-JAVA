Parathas Cook Problem ->
public class Main{
public static boolean isvalidtime(int[] arr , int timelimit, int parathamake){
    int toatlcooks = arr.length;
    int parathacount = 0;
    for (int i = 0; i < arr.length; i++){
        int currentcook = arr[i];
        int timetaken = 0;
        int j = 1;
        while(timetaken <= timelimit){
           if (timetaken + j * currentcook <= timelimit) {
    timetaken += j * currentcook;
    parathacount++;
    j++;
        } else {
            break;
         }
        }
          }
    if(parathacount >= parathamake){
        return true;
    }
    return false;
}
    public static int maxparathascook(int[] arr, int cook, int total){
        int maxi = -1;
        int n = arr.length;
        for (int i =0; i < arr.length ; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        int s = 0;
        int ans = -1;
        int e = maxi * (total * (total + 1) / 2 );
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(isvalidtime(arr,mid, total)){
                ans = mid;
                e = mid - 1;
            }

            else{
                s = mid + 1;
            }

        }
    return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2};
        int n = 8;
        int i = 2;
        int ans = maxparathascook(arr, i, 8);
        System.out.println(ans);
    }
}
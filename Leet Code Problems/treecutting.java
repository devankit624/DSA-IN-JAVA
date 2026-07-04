//EKO SPOJ Problem->
// Tree Cutting Problem->
public class treecutting{
    public static boolean isvalidtree(int[] arr, int m , int maxlength){
        int totalwoodcollected = 0;
        int currenttreewoodcollected = 0;
        for (int i =0; i < arr.length ; i++){
            if(arr[i] > maxlength){
                // Wood kuch part dega
                currenttreewoodcollected = arr[i] - maxlength;
                totalwoodcollected += currenttreewoodcollected;
            }
        }
        if(totalwoodcollected >= m){
            return true;
        }
        else{
            return false;
        }
    }
    public static int treeproblem(int[] arr, int k){
        int n = arr.length;
        int s = 0;
        int ans = -1;
        int maxi = -1;
        for (int i =0; i < n ;i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        int e = maxi;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(isvalidtree(arr,k,mid)){
                ans = mid;
                s = mid + 1;
            }
            else {
               e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {20,15,10,17};
        int cut = 7;
        int ans = treeproblem(arr, cut);
        System.out.println(ans);
    }
}

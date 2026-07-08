public class Main{
    public static int firstoccur(int[][] arr , int rowindex){
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int target = 1;
        int ans = -1;
        if(arr[rowindex][totalcol - 1] == 0){
            return totalcol;
        }
        else {
            // 1 wala case handkle
            int s = 0;
            int e = totalcol - 1;
            while(s <= e){
                int mid = s + (e - s) / 2;
                if(arr[rowindex][mid] == 0){
                    // move to the right
                    s = mid + 1;
                }
                else{
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
    }
    public static int firstoccurence(int[][] brr){
        int totalrow = brr.length;
        int totalcol = brr[0].length;
        int maxi = -1;
        int rowindexone = -1;
        for(int row = 0; row < totalrow < row++){
            int firstoccurence = firstoccur(brr, row);
            int onecount = totalcol - firstoccurence;
            if(onecount !=0 && onecount > maxi){
                maxi = onecount;
                rowindexone  = row;
            }
        }
    }
    return rowindexone;
}


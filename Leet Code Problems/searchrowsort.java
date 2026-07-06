// Search In 2D Matrix where Row only sorted
search in 2d matrix
public class searchrowsort{
    public static boolean findtwod(int[][] arr, int target){
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int n = totalrow + totalcol;
        int s = 0;
        int e = n - 1;
        while (s <= e){
            int mid = s + (e - s) / 2;
            int rowindex = mid / totalcol;
            int colsindex = mid % totalcol;
            if(arr[rowindex][colsindex] == target){
                return mid;
            }
            else if(arr[rowindex][colsindex] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }

        }
    return false;
    }

}

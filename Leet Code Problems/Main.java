// Find in the both Row and Column sorted
// Time Complexity = O(m+n)
public class Main{
    public static boolean findnum(int[][] arr, int target){
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int row = 0;
        int col = totalcol - 1;
        while(row < totalrow && col >= 0){
            if(arr[row][col] == target){
                return true;
            }
            else if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    } 
    public static void main(String[] args){
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{18,21,23,26,30}};
        int target = 13;
        boolean ans = findnum(arr,target);
        System.out.print(ans);
    }
}
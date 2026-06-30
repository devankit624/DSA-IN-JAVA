//2d array
// printint the spiral the the 2d Matrix
spiral printying of the matrix
import java.util.List;
import java.util.ArrayList;
public class spiral{
    public static List <Integer> waveprint(int [][] matrix , int m , int n){
        List<Integer> result = new ArrayList<>();
        for (int cols = 0 ; cols < n ; cols++){
            if ((cols & 1) == 1){
                // bottom to top 
                // odd
                for (int row = m-1 ; row >= 0 ; row--){
                    result.add(matrix[row][cols]);
                }
                 System.out.println();
            }
            else{
                for (int row = 0 ; row < m ; row++){
                    result.add(matrix[row][cols]);
                }
                 System.out.println();
            }
        }
        return result;
    }
public static void main(String[] args){
    int [][]arr = new int[3][3];
    int brr[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int rowindex = brr.length;
    int colsindex = brr[0].length;
    List<Integer> res = waveprint(brr, rowindex , colsindex);
    for (int num : res){
        System.out.print(num + " ");
        
    }
    System.out.println();
}
}




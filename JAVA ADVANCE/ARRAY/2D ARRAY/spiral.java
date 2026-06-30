import jav.util.List;
import java.util.ArrayList;
public class spiral{
    public Lst<Interger> spiralorder(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int startingrow = 0;
        int endinggrow = m - 1;
        int startingcols = 0;
        int endingcols = n- 1;

        while(startingrow<=endinggrow && startingcols <= endingcols){
            // startingcols and endingcols
            for (int col = startingcols ; col < endingcols ; col++){
                result.add(matrix[startingrow][col]);
            }
            startingrow++;
            //starting row and the ending row
            for (int row = startingrow ; row < endinggrow ; row+++){
                result.add(matrix[row][endingcols]);
            }
            endingcols--;

            // ending col and starting cols
            for (int col = endingcols ; col >= startingcols ; col--){
                result.add(matrix[endinggrow][col]);
            }
            endinggrow--;

            // ending row and starting row
            if (startingcols <= endingcols){
            for (int row = endinggrow ; i>= startingrow ; i--){
                result.add(matrix[row][startcol]);
            }
            startcol++;
        }
            
        }
        return result;

    }

}

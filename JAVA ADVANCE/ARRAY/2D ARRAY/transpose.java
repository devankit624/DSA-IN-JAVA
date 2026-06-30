// Transpose of a matrix
public class transpose{
    public static int[][] transpose(int [][]arr){
        if (arr == null || arr.length == 0){
            return new int[0][0];
        }
        int totalrows = arr.length;
        int totalcols = arr[0].length;

        int newtotalrows = totalcols;
        int newtotalcols = totalrows;

        int ans[][] = new int[newtotalrows][newtotalcols];


        // actial
        for (int i = 0 ; i < totalrows ; i++){
            for (int j = 0 ; j < totalcols ; j++){
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int [][] brr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] res = transpose(brr);
        for (int i = 0 ; i < res.length ; i++){
            for (int j = 0 ; j < res[0].length ; j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}

import java.util.List;
 import java.util.ArrayList;

public class Main {

    static List<Integer> findColsSum(int arr[][]) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;      // rows
        int n = arr[0].length;   // columns

        for (int col = 0; col < n; col++) {
            int sum = 0;

            for (int row = 0; row < m; row++) {
                sum += arr[row][col];
            }

            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {

        int arr[][] = {
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> sum = findColsSum(arr);

        System.out.println(sum);
    }
}


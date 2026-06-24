public class printextreme {
    static void printextreme(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            System.out.print(arr[i] + " ");
            System.out.print(arr[j] + " ");
            i++;
            j--;
        }
        if (i == j) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 9};
        printextreme(arr);
    }
}

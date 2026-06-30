//Bubble sorting
public class Main{
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = 0; j < n - i - 1 ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
     return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,4,5,2,3,6,9,8};
        int[] ans = bubblesort(arr);
        for (int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
//Selection Sorting ->
public class Main{
    public static int[] sorting(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            int minindex = i;
        
        for (int j = i+1 ; j  < n ; j++){
            if (arr[j] < arr[minindex]){
                minindex = j;
            }
    }
        int temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
    }
    return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,4,2,5,3,8,7,9,6};
        int[] ans = sorting(arr);
        for (int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
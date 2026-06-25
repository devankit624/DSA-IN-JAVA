// sort the 0s and 1s
// Time - Complexity = O(n^2)
import java.util.Collections;
public class sort{
    static int[] sortthenumber(int[] arr){
        int size = arr.length;
        int temp;
        for (int i = 0; i<size - 1; i++){
            for (int j = 0; j<size-i-1 ; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1,1,0,1,0,0};
        int[] ans = sortthenumber(arr);
        for (int key : ans){
            System.out.print(key + ", ");
        }
    }

    // Apporach - 2
    // Time Complexity - (O(n))
    static int[] sortnumber(int[] arr){
        int size = arr.length;
        int i = 0;
        int temp;
        int j = size-1;
        while(i<j){
            if (arr[i] == 1 && arr[j] == 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if (arr[i] == 0){
                i++;
            }
            else if(arr[j] == 1){
                j--;
            }
        }
        return arr;
}
    public static void main(String[] args){
        int[] arr = {0,1,1,0,0,0,1,1,0,1,0};
        int[] key = sortnumber(arr);
        for(int num : key){
            System.out.print(num + ", ");
        }
    }
}

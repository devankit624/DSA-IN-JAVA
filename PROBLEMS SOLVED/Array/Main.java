// Problem ->
// find the pair which add traget in the array

public class Main{
    static int[] findppair(int[] arr, int target){
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size-1; i++){
            for (int j = 1; j < size; j++){
                if (arr[i] + arr[j] == target){
                    int[] ans = {arr[i],arr[j]};
                    return ans;
                }
            }
        }
       return null;

    }
public static void main(String[] args){
    int[] arr = {1,4,5,8,7,8};
    int target = 9;
    int[] key = findppair(arr,target);
    for(int value : key){
        System.out.print(value + ", ");
    }
}

// triplet sum
static int[] findtriplet(int[] arr, int target){
    int size = arr.length;
    for (int i = 0; i<size - 2 ;i++){
        for(int j = 1 ; j < size - 1;j++){
            for (int k = 2; k < size ; k++){
                if (arr[i] + arr[j] + arr[k] == target){
                    int[] ans = {arr[i] , arr[j] , arr[k]};
                    return ans;
                }
            }
        }
        
    }
    return null;
}

public static void main(String[] args){
    int[] arr = {1,5,8,9,6,4,7};
    int target = 18;
    int[] ans = findtriplet(arr,target);
    for(int num : ans){
        System.out.print(num + ", ");
    }
}
}
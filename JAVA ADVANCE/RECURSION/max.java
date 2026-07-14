
// find max using recursion
public class max{
    public static void linearsearch(int[] arr , int i ,  int target){
        if(target == arr[i]){
            System.out.print(arr[i]);
        }
        linearsearch(arr, i+1, target);
    }
    public static void main(String[] args){
        int[] arr = {1,4,5,7,8,9,};
        int i = 0;
        int target = 9;
        linearsearch(arr, i+1, target);
    }
}


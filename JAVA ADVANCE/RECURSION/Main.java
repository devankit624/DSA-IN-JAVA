
//print array using recursion
public class Main{
    public static void printarray(int[] arr ,int i){
        if (i >= arr.length){
            return;
        }
        System.out.println(arr[i]);
        printarray(arr , i+1);
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,8};
        int i = 0;
        printarray(arr,i);
    }
}

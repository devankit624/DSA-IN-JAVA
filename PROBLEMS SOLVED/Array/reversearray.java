K// Kuch bhadiya Problems
public class reversearray{
    static int[] findreverse(int[] arr){
        int size = arr.length;
        int i = 0;
        int j = size - 1;
        int temp;
        while(i<=j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
}
public static void main(String[] args){
    int[] arr = {1,4,5,8,6};
    int[] reverse = findreverse(arr);
    for(int num : reverse){
        System.out.print(num + ", ");
    }
}
}

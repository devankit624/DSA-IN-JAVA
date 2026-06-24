// Shift element by 1 position
public class shiftarray{
    static int[] shiftelement(int[] arr){
        int size = arr.length;
         int temp = arr[size-1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,8,9};
        int[] shift = shiftelement(arr);
        for(int num : shift){
        System.out.print(num + ", ");
        }
    }
}

// fins the missing number
public class Main{
// Time complexity = O(n)
    static int findmissing(int[] arr){
        int xorsum = 0;
        for (int num : arr){
            xorsum = xorsum ^ num;
        }
        for (int i = 0; i <arr.length; i++){
            xorsum = xorsum ^ i;
        }
        return xorsum;
    }
public static void main(String[] args){
    int[] arr = {1,4,5,8,9,6};
    int key = findmissing(arr);
    System.out.println(key);
}
}
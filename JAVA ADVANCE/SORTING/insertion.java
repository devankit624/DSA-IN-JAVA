// Insertion sorting ->
public class insertion{
    static int[] inssertionsort(int[] arr){
        int n = arr.length;
        for (int i =1; i < n ; i++){
        int curr = i;
        int prev = i-1;
        int currvalue = arr[i];
        while(prev>=0 && currvalue < arr[prev]){
             arr[prev + 1] = arr[prev];
             prev--;
        }

        // ek khali space ab bachi hogi
        arr[prev + 1] = currvalue;
        
    }
    return arr;
}

    public static void main(String[] args){
        int[] arr = {1,4,7,5,2,3,6};
        int[] ans = inssertionsort(arr);
        for (int num : ans){
            System.out.print(num);
        }
        System.out.println();
    }
}

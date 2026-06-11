//find max and min in the array
import java.util.Scanner;
public class arr_4{
    public static void main(String[] args){
        System.out.println("Enter N size of array ->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int p = arr.length;
        int max = arr[0];
        
        for (int i = 0; i <p ; i++){
            System.out.println("Enter array Element for -> " + i);
            arr[i] = sc.nextInt();
        }
        // for max
        for (int i = 0; i <p ; i++){
            if(arr[i] > max ){
                max = arr[i];
            }       
    }
    // for min
    int min = arr[0];
    for (int i =0 ; i <p; i++){
        if (arr[i] < min)
        min = arr[i];
    }
    System.out.println("the max value in the array" + max);
     System.out.println("the min value in the array" + min);
}
}
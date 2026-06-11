import java.util.Scanner;
public class arr_2{
    public static void main(String[] args){
        System.out.println("Enter N size of array ->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int p = arr.length;
        int sum = 0;
        
        for (int i = 0; i <p ; i++){
            System.out.println("Enter array Element for -> " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <p ; i++){
        sum = sum + arr[i];
    }
    System.out.print(sum);
}
}
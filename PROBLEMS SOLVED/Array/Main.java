import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    //Prob - 1

    // finding the average of the array
        System.out.println("Enter no of elements");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        // printing array
        for (int i = 0; i <n ; i++){
            System.out.print(arr[i] + " ");
        }
        double average;
        average = (double) sum / n;
        System.out.println(average);
        System.out.println(sum);


        

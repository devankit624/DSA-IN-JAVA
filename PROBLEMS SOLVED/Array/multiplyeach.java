import java.util.Scanner;
public class multiphyeach{
    public static void main(String[] args){
    //Prob - 2


        // mutiply each element by 10

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        // printing array
        for (int i =0; i <n; i++){
            System.out.print(arr[i] + " ");
        }
        // multiply by 10
        System.out.println("Enter Num which multiply");
        int b = sc.nextInt();
        int[] brr = new int[b];
        for (int  i = 0; i <n ; i++){
            brr[i] = b * arr[i];
        }

        for (int  i = 0; i <n ; i++){
            System.out.print(brr[i] + " ");
        }

    }
}


        


        

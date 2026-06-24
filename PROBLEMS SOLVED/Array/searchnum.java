import java.util.Scanner;
public class searchnum{
    public static void main(String[] args){
    //Prob - 3
    //    static int searching(int arr[] , int n){
            int size = arr.length;
            for (int i = 0;i<size ; i++){
                if (arr[i] == n){
                    System.out.println("found");
                    return i;
                }                                 
                }
                System.out.println("Not ");
                return -1;
        }

        public static void main(String[] args){
            int[] arr ={1,5,8,7,5};
            int n = 5;
            int search = searching(arr,n);
            System.out.println("Index " + search);
        }

    }
}

        


        


        

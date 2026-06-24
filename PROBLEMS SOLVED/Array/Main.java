import java.util.Scanner;
public class findmax{
    public static void main(String[] args){
    //Prob - 5
    static int findmax(int arr[]){
            int max;
            int size = arr.length;
            max = arr[0];
            for  (int i = 0; i <size ; i++){
                if (arr[i] > max){
                    max = arr[i];                
                }
            }
            System.out.println("max Element");
                    return max;
        }
        public static void main(String[] args){
            int[] arr = {1,4,7,8,9};
            int n = findmax(arr);
            System.out.println(n);
        }

    }
}

        


        


        

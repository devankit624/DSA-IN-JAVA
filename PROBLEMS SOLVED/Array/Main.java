import java.util.Scanner;
public class sumofpositiveandnegative{
    public static void main(String[] args){
    //Prob - 6
        static int findsum(int arr[]){
            int positivesum = 0;
            int negativesum = 0;
            int size = arr.length;
            for (int i = 0; i <size ; i++){
                if (arr[i] > 0){
                    positivesum = positivesum + arr[i];
                }
                else if (arr[i] < 0) {
                    negativesum = negativesum + arr[i];
                }
            }
            System.out.println(positivesum);
            System.out.println(negativesum);

            return positivesum + negativesum ;
        }
        public static void main(String [] args){
            int[] arr = {1,4,7,8,-6,-8,-7};
            int total = findsum(arr);
            System.out.println(total);
        }
        }

}

        


        


        

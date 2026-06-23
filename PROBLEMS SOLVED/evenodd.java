// Problems ->
import java.util.Scanner;
public class evenodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Prob - 1 ->
        // Check the number Even or Odd by the Bitwise operator
        System.out.println("Enter Num ->");
        int a = sc.nextInt();
        if ((a&1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}
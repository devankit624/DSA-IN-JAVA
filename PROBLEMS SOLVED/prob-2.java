// Problems ->
import java.util.Scanner;
public class prob-2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Pro - 2 ->
        // Check the number is the power of the 2 or Not
        System.out.println("Enter Num ->");
        int b = sc.nextInt();
        int count = 0;
        while(b != 0){
            if ((b&1) != 0){
                count++;
            }
            b = b >> 1;
        }
        System.out.println("The Set bit Count " + count);
        if (count <= 1){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not");
        }
        // Alter
        if ((b & (b-1)) == 0 ){
            System.out.println("power of 2");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}

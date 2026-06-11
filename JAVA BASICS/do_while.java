// Do while loop
import java.util.Scanner;
public class do_while{
    public static void main(String [] args){
        System.out.print("Enter num");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        do{
            System.out.print("Hola");
            i++;
        }while(i <= 5);
    }
}
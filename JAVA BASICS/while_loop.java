import java.util.Scanner;
public class while_loop{
    public static void main(String [] args){
        System.out.print("Enter num");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while (i <= 5){
            System.out.print("Hola!!");
            i++;
        }
    }
}
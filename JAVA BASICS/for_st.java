import java.util.Scanner;
public class for_st {
    public static void main(String [] args){
        System.out.print("Enter how many times print 'Hola' ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num ; i++){

            System.out.print("Hola");
            System.out.println();
        }
        sc.close();
    }
}

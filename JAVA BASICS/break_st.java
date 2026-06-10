import java.util.Scanner;
public class break_st {
    public static void main(String [] args){
        System.out.print("Enter how many times print 'Hola' ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num ; i++){
            if(i == 2){
                break;
            }
            System.out.print("Hola");
            System.out.println();
        }
        sc.close();
    }
}

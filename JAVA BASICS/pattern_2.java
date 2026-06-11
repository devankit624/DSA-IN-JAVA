//Left triangle printing

import java.util.Scanner;
public class pattern_2{
    public static void main(String[] args){
        System.out.print("Enter num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <num; i++){
            for (int j = 0; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }
}
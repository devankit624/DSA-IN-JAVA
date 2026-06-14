import java.util.Scanner;
// reverse num 
public class basic_2{
        static int reversenum(int x){
                int reverse = 0;
                int original = x;
                while (x != 0){
                        int digit = x % 10;
                        reverse = reverse * 10 + digit;
                        x = x/10;
                }
                return reverse;
        
        }
        static boolean isplaindrome(int num){
                int original = num;
                int reversednum = reversenum(num);
                if (original == reversednum){
                        System.out.println("Palidrome");
                        return true;
                }
                else{
                        System.out.println("Not palindrome");
                        return false;
                }
        }
        static void main(){
                boolean ans = isplaindrome(11111);
                // int a = 3568;
                // int ans = reversenum(a);

                // System.out.println(ans);
        }

        // check prime
        static boolean checkprime(int num){
                if (num <= 1){
                        System.out.println("Whole Not Prime");
                        return false;
                }
                        for (int i = 2  ; i < num; i++){
                                if (num % i == 0){
                                        System.out.println("Not prime");
                                        return false;
                                }
                                
                        }
                        System.out.println("Prime");
                        return true;                      
                }
        

        static void main(){
                boolean ans = checkprime(8);
        }
}
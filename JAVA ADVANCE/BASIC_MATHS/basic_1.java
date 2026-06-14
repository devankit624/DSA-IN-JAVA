import java.util.Scanner;
//basic Maths to solve Heigher Problems in JAVA ->

        // public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Integer ->");
                int a = sc.nextInt();
                
                while (a != 0){
                        int digit = a % 10;
                        System.out.println(digit);
                        a = a/10;
                }
        }


        count no of the digits
        static int countdigits(int x){
                int count = 0;
                while (x != 0){
                        int digit = x % 10;
                        count++;
                        x = x/10;
                }
                return count;
        }
        static void main(){
                int num = 3256458;
                int ans = countdigits(num);
                System.out.println(ans);
        }

        sum of each digit in the number
        static int sumeachdigit(int x){
                // finding the no of digit
                int sum = 0;
                while (x != 0){
                        int digit = x % 10;
                        sum = sum + digit;
                        x = x/10;
                }
                return sum;
                }
                static void main(){
                        int n = 36589;
                        int sum = sumeachdigit(n);
                        System.out.println(sum);
                }
        // Number ka reverse 
        static int getreversenum(int x){
                int reverse = 0;
                while (x != 0){
                        int digit = x % 10;
                        reverse = reverse * 10 + digit;
                        digit = digit / 10;
                }
                return reverse;
        }
        static void main(){
                int num = 36589;
                int reversenum = getreversenum(num);
           System.out.println(reversenum);
        }


        // Leet problem
import java.util.Scanner;
class Solution {
    public static  boolean checkGoodInteger(int n) {
        int digitsum = 0;
        int squaresum = 0;
        int sum = 0;
        while (n != 0){
            int digit = n % 10;
            digitsum = digitsum + digit;
           int  square = digit * digit;
            squaresum += square;
            n = n / 10;
        }
       int ans = squaresum - digitsum;     
        if (ans == 0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean answer = checkGoodInteger(a);
        System.out.println(answer);
    }
}
        
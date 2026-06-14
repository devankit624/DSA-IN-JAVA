import java.util.Scanner;
public class basic_3{
        static boolean optimizeprime(int x){
                if(x<=1){
                        System.out.println("Invalid");
                        return false;
                }
                for (int i = 2; i*i<=x ;i++){
                        if (x % i == 0){
                                System.out.println("Not prime");
                                return false;
                        } 
                }
                System.out.println("prime");
                        return true;
        }
        static void main(){
                int num = 7;
                boolean ans = optimizeprime(num);
                System.out.println(ans);
        }

        // Finding gcd
        static int getgcd(int a, int b){
                //(gcd (a,b) = gcd(b, a%b))
                while (b != 0){
                int temp = b;
                b = a%b;
                a = temp;
        }
        int ans = a;
        return ans;
        }
        static void main(){
                int n = 6;
                int m = 4;
                int ans = getgcd(n, m);
                System.out.println(ans);
        }

        // finding LCM
        LCM * HCF or GCD = a * b
        static int lcmofnum(int a, int b){
                int gcd;
                gcd = getgcd(a , b);
                int lcm;
                lcm = ( a * b) / gcd;
                return lcm;
        }
        static void main(){
                int a = 18;
                int b = 12;
                int lcm = lcmofnum(a, b);
                System.out.println(lcm);
        }
// Finding Armstrong number
static boolean findarmstrong(int n){
        int cube;
        int original = n;
        int sum = 0;
        if (n <= 0){
                System.out.println("Invalid case");
                return false;
        }
        while ( n != 0){
                int digit = n % 10;
                cube = digit * digit * digit;
                sum = sum + cube;
                n = n/10;
        }
        if (original == sum){
                System.out.println("Armstrong");
                return true;               
        }
        else {
                System.out.println("Not Armstrong");
                return false;
        }
}

static void main(){
        int num = 153;
        boolean ans = findarmstrong(num);
        System.out.println(ans);
}
}
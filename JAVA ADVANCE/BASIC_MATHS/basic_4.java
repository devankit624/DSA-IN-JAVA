import java.util.Scanner;
public class basic_4{
        static boolean checkperfectnum(int num){
                int sum = 1;
                if (num <= 0){
                        return false;
                }
                for (int i = 1; i*i<=num ; i++){
                        if (num % i ==0){
                        // firstfactor = i
                        //secondfactor = num/i
                        int firstfactor = i;
                        int secondfactor = num/i;
                        sum = sum + firstfactor + secondfactor;
                }
                if (sum == num){
                return true;
        }
        else {
                return false;
        }
        static void main(){
                int num = 6;
                System.out.println(checkperfectnum(num));
        }
}
}

// range of prime
static boolean checkprime(int n){
    if (n <= 1){
        return false;
    }

    for (int i = 2; i * i <= n; i++){
        if (n % i == 0){
            return false;
        }
    }

    return true;
}

static void printallprimenum(int n){
    for (int i = 2; i < n; i++){
        if (checkprime(i)){
            System.out.println(i);
        }
    }
}

static void main(){
    int num = 10;
    printallprimenum(num);
}
}
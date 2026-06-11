// call by value 
// copy of the value pass to the function not riginal value 
public class function_3{
    static void solve(int num){
        System.out.println("Inside function " + num);
        num = num * 10;
        System.out.println("inside function " + num);
    }
    static void main(){
        int num = 6;
        System.out.println("inside main " +num);
        solve(num);
        System.out.println("inside main " + num);

    }
}
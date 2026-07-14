// printdigits using recursion
public static void printdigit(int nums){
    if(nums == 0){
        return;
    }
    int digit = nums % 10;
    System.out.println(digit);
    nums = nums / 10;
    printdigit(nums);
}
public static void main(String[] args){
    int nums = 13789;
    printdigit(nums);
}
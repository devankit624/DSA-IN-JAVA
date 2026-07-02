public class Main{
    public static int squareroot(int square){
        int s = 1;
        int e = square;
        int ans = -1;
        if(square == 0){
            return 0;
        }
        while (s <= e){
            int mid = s + (e - s) / 2;
            if (mid == square/mid){
                return mid;
            }
            else if(mid > square/mid){
                e = mid - 1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int num = 56;
        int ans = squareroot(num);
        System.out.println(ans);
    }
}
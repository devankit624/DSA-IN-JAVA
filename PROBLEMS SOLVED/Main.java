public class Main{
    public static int solve(int amount,int[] coins, int index){
        if(amount == 0)
            return 1;
        if(amount < 0){
            return 0;
        }
        if (index >= coins.length)
    return 0;
        // include ka ans
        // jab hum kisi coin ko include karenge
        // to current include coin se amount ko minus karna padega
        int includeans = solve(amount-coins[index],coins,index);
        // agar kisi coin ko exclude kiya hai to index + 1 krna padega
        int excludeans = solve(amount,coins,index+1);
        int finalans = includeans + excludeans ;
        return includeans + excludeans;
    }
        public static int change(int amount , int[]coins){
        int index = 0;
        int ans = solve(amount,coins, index);
        return ans;
        }

        public static void main(String[] args){
            int[] arr = {1,4,7,8,9,5};
            int target = 5;
            System.out.println(change(target, arr));
        }
    }
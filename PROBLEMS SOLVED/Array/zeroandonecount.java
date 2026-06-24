public class Main{
    static int zeroandonecount(int arr[]){
        int size = arr.length;
        int zerocount = 0;
        int onecount = 0;
        for(int i = 0; i < size; i++){
            if (arr[i] > 0){
                onecount++;
            }
            else{
                zerocount++;
            }
        }
        System.out.println("Zero count " + zerocount);
        System.out.println("One count " + onecount);
        return zerocount + onecount;
    }

    public static void main(String [] args){
        int[] arr = {1,0,1,0,1,1,0,1};
        int total = countzeroandone(arr);
        System.out.println(total);
    }
}

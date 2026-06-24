// Prob- Find the unsorted Element in the Array
public class unsortedelement{
        static int getunsorted(int arr[]){
            for (int i = 0; i < arr.length ; i++){
                if (arr[i+1] <= arr[i]){
                    return arr[i+1];
                }
            }
             return -1;
        }
       

    public static void main(String[] args){
        int arr[] = {1,2,5,4,9};
        int find = getunsorted(arr);
        System.out.println(find);
}
}

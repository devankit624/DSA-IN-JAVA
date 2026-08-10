class Solution{
    static int merge(int [] arr , int s, int e , int mid){
        // left and right array ke liye do empty array me store
        int leftarraylen = mid - s + 1;
        int rightarraylen = e - mid;

        int [] leftarr = new int[leftarraylen];
        int [] rightarr = new int[rightarraylen];

        int k = s;
        for(int i = 0; i < leftarraylen ;i++){
            leftarr[i] = arr[k];
            k++;
        }

        k = mid + 1;
        for(int j = 0; j < leftarraylen ;j++){
            leftarr[j] = arr[k];
            k++;


            int i = 0;
            int j = 0;
            int k = s;
            int inversioncount = 0;
            while(i < leftarraylen && j < rightarraylen){
                if(leftarr[i] <= rightarr[j]){
                    arr[k] = leftarr[i];
                    k++;
                    i++;
                }
                else{
                    // leftar[i] > rightarr[j]

                    //merge ka logic 
                    arr[k] = rightarr[j];
                    j++;
                    k++;
                    inversioncount = inversioncount + (leftarraylen - i);
                }
            }

            // kuch elements bache hai to copy kardo
            while(i < leftarraylen){
                arr[k] = leftarr[i];
                k++;
                i++;
            }

            // for right
            while(j < rightarraylen){
                arr[k] = leftarr[j];
                k++;
                j++;
            }

    }
    static int mergesort(int[] arr, int s int e){
        int mid = (s + e) / 2;
        // base case
        if(s > e){
            return 0;
        }
        if(s == e){
            return 0;
        }
        // left wale array to recursion sort karega
        int leftinversion = left(arr, 0, mid);

        // right wale part ko recursion sort karega
        int rightinversion = right(arr, mid + 1 , e);

        int interinversion = merge(arr, s, e , mid);
        int totalinversion = leftinversion + rightinversion + interinversion;

    }
}
}

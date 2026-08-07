class Solution {

    static void merge(int[] arr, int s, int e, int mid) {

        int leftarraylength = mid - s + 1;
        int rightarrlen = e - mid;

        int[] leftarr = new int[leftarraylength];
        int[] rightarr = new int[rightarrlen];

        // Copy left array
        int k = s;
        for (int i = 0; i < leftarraylength; i++) {
            leftarr[i] = arr[k++];
        }

        // Copy right array
        k = mid + 1;
        for (int j = 0; j < rightarrlen; j++) {
            rightarr[j] = arr[k++];
        }

        // Merge
        int i = 0;
        int j = 0;
        k = s;

        while (i < leftarraylength && j < rightarrlen) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k++] = leftarr[i++];
            } else {
                arr[k++] = rightarr[j++];
            }
        }

        // Copy remaining left elements
        while (i < leftarraylength) {
            arr[k++] = leftarr[i++];
        }

        // Copy remaining right elements
        while (j < rightarrlen) {
            arr[k++] = rightarr[j++];
        }
    }

    public void mergesort(int[] arr, int s, int e) {

        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        mergesort(arr, s, mid);
        mergesort(arr, mid + 1, e);

        merge(arr, s, e, mid);
    }
}

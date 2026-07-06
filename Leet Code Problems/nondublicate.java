public class nondublicate {
    public static int numsoccur(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            // Base case: if only one element is left, it's the unique one
            if (s == e) {
                return arr[s];
            }

            int mid = s + (e - s) / 2;
            int currentvalue = arr[mid];
            int prevvalue = (mid - 1 >= 0) ? arr[mid - 1] : -1;
            int nextvalue = (mid + 1 < n) ? arr[mid + 1] : -1;

            // If the element is not equal to its neighbors, it's the unique one
            if (currentvalue != prevvalue && currentvalue != nextvalue) {
                return currentvalue;
            }

            // Case 1: First occurrence is at mid-1, second occurrence is at mid
            if (currentvalue == prevvalue) {
                int firstOccurrenceIndex = mid - 1;
                // If the first occurrence is at an even index, the unique element is on the right
                if ((firstOccurrenceIndex & 1) == 0) {
                    s = mid + 1;
                } else { // If it's at an odd index, the unique element is on the left
                    e = mid - 2; // mid-1 is already checked, so move to mid-2
                }
            }
            // Case 2: First occurrence is at mid, second occurrence is at mid+1
            else if (currentvalue == nextvalue) {
                int firstOccurrenceIndex = mid;
                // If the first occurrence is at an even index, the unique element is on the right
                if ((firstOccurrenceIndex & 1) == 0) {
                    s = mid + 2; // mid+1 is already checked, so move to mid+2
                } else { // If it's at an odd index, the unique element is on the left
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 30, 30, 40, 40, 50, 60, 60};
        int ans = numsoccur(arr);
        System.out.println(ans); // Output: 50
    }
}

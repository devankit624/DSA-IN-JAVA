//Recurence by Binary Search

public class rev {

    public static int solve(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return solve(arr, target, s, mid - 1);
        } else {
            return solve(arr, target, mid + 1, e);
        }
    }

    public static int binarysearch(int[] arr, int target) {
        return solve(arr, target, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 8, 9};
        int target = 9;

        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
}

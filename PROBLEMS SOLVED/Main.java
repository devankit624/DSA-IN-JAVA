import java.util.ArrayList;

public class Main {

    public static boolean isSafeMove(int newx, int newy, int[][] arr, boolean[][] visited) {
        int n = arr.length;

        if (newx < 0 || newx >= n || newy < 0 || newy >= n) {
            return false;
        }

        if (arr[newx][newy] == 0) {
            return false;
        }

        if (visited[newx][newy]) {
            return false;
        }

        return true;
    }

    public static void solve(int[][] arr, int srcx, int srcy,
                             int destx, int desty,
                             boolean[][] visited,
                             ArrayList<String> ans,
                             String path) {

        // Base Case
        if (srcx == destx && srcy == desty) {
            ans.add(path);
            return;
        }

        visited[srcx][srcy] = true;

        // UP
        int newx = srcx - 1;
        int newy = srcy;
        if (isSafeMove(newx, newy, arr, visited)) {
            solve(arr, newx, newy, destx, desty, visited, ans, path + "U");
        }

        // DOWN
        newx = srcx + 1;
        newy = srcy;
        if (isSafeMove(newx, newy, arr, visited)) {
            solve(arr, newx, newy, destx, desty, visited, ans, path + "D");
        }

        // LEFT
        newx = srcx;
        newy = srcy - 1;
        if (isSafeMove(newx, newy, arr, visited)) {
            solve(arr, newx, newy, destx, desty, visited, ans, path + "L");
        }

        // RIGHT
        newx = srcx;
        newy = srcy + 1;
        if (isSafeMove(newx, newy, arr, visited)) {
            solve(arr, newx, newy, destx, desty, visited, ans, path + "R");
        }

        // Backtracking
        visited[srcx][srcy] = false;
    }

    public static ArrayList<String> ratInMaze(int[][] arr) {

        int n = arr.length;

        ArrayList<String> ans = new ArrayList<>();

        if (arr[0][0] == 0 || arr[n - 1][n - 1] == 0) {
            return ans;
        }

        boolean[][] visited = new boolean[n][n];

        solve(arr, 0, 0, n - 1, n - 1, visited, ans, "");

        return ans;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        ArrayList<String> paths = ratInMaze(maze);

        System.out.println(paths);
    }
}
package Grind75.Medium;

public class Problem74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] < target) left = mid + 1;
                else if (matrix[i][mid] > target) right = mid - 1;
                else return true;
            }
        }
        return false;
    }
}

package Grind75.Review;

import java.util.Arrays;

public class Problem733 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            helper(image, sr, sc, image[sr][sc], color);
        }
        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int originalColor, int changeColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = changeColor;
        helper(image, sr + 1, sc, originalColor, changeColor);
        helper(image, sr - 1, sc, originalColor, changeColor);
        helper(image, sr, sc + 1, originalColor, changeColor);
        helper(image, sr, sc - 1, originalColor, changeColor);
    }


}

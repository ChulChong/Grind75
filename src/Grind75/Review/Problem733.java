package Grind75.Review;

import java.util.Arrays;

public class Problem733 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc]) return image;
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int color, int originalColor) {
        if (sc < 0 || sc >= image[0].length || sr < 0 || sr >= image.length) return;
        if (image[sr][sc] != originalColor) return;
        image[sr][sc] = color;
        helper(image, sr + 1, sc, color, originalColor);
        helper(image, sr - 1, sc, color, originalColor);
        helper(image, sr, sc + 1, color, originalColor);
        helper(image, sr, sc - 1, color, originalColor);
    }


}

package h16;

// https://leetcode.com/problems/flood-fill/
public class Task1 {

  public void dfs(int color, int r, int c, int img[][], int originalcolour) {
    if (r >= img.length || c >= img[0].length || r < 0 || c < 0) {
      return;
    }
    if (img[r][c] != originalcolour) {
      return;
    } else {
      img[r][c] = color;
      dfs(color, r - 1, c, img, originalcolour);

      dfs(color, r + 1, c, img, originalcolour);
      dfs(color, r, c - 1, img, originalcolour);
      dfs(color, r, c + 1, img, originalcolour);
    }
  }

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int originalColor = image[sr][sc];
    if (originalColor == color) {
      return image;
    }
    dfs(color, sr, sc, image, originalColor);
    return image;
  }
}

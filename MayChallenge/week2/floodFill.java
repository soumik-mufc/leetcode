class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int x = image.length;
        int y = image[0].length;
        if(sr >= 0 && sr < x && sc >= 0 && sc <y && image[sr][sc] != newColor) {
            int temp = image[sr][sc];
            image[sr][sc] = newColor;
            if(sr + 1 < x && image[sr+1][sc] == temp)
                image = floodFill(image, sr+1, sc, newColor);
            if(sc + 1 < y && image[sr][sc+1] == temp)
                image = floodFill(image, sr, sc+1, newColor);
            if(sr - 1 >= 0 && image[sr-1][sc] == temp)
                image = floodFill(image, sr-1, sc, newColor);
            if(sc-1 >= 0 && image[sr][sc-1] == temp)
                image = floodFill(image, sr, sc-1, newColor);
            return image;
        } else {
            return image;
        }
    }
}
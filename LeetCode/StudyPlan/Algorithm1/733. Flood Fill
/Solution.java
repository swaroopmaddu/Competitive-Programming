class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int colour = image[sr][sc];
        int numberOfColumns = image[0].length;
        int numberOfRows = image.length;
        sweep(image,sr,sc,numberOfRows,numberOfColumns,colour,newColor);

        return image;
    }
    public void sweep(int[][]image,int x,int y,int r,int c,int source,int dest){
        if(x<0||x>=r||y<0||y>=c||image[x][y]!=source||image[x][y]==dest){
            return;
        }
        if(image[x][y]==source)
            image[x][y] = dest;
        sweep(image, x+1, y, r, c, source, dest);
        sweep(image, x, y+1, r, c, source, dest);
        sweep(image, x-1, y, r, c, source, dest);
        sweep(image, x, y-1, r, c, source, dest);
    }
}
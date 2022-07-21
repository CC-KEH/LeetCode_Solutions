package com.company.AlgorithmOne.DFS;

import java.util.Arrays;
import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] image = {{1, 1, 1}, {2, 1, 0}, {1, 0, 1}};
        int sr = in.nextInt();
        int sc = in.nextInt();
        int color = in.nextInt();
        int prevcolor = image[sr][sc];
        dfs(image, sr, sc,prevcolor, color);
    }

    public static void dfs(int[][] image, int r, int c,int color, int newColor){
        if(image[r][c]==color){
            image[r][c]=newColor;
            if(r>=1){
                dfs(image,r-1,c,color,newColor);
            }
            if(c>=1){
                dfs(image,r,c-1,color,newColor);
            }
            if(r+1<image.length){
                dfs(image,r+1,c,color,newColor);
            }
            if(c+1<image[0].length){
                dfs(image,r,c+1,color,newColor);
            }
        }
    }
}

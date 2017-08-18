package com.example;

/**
 * Created by Cain on 2017/8/18.
 * https://leetcode.com/problems/island-perimeter/description/
 * 463
 * Pass by Cain on 2017/8/18.
 */

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int oneCount = 0;
        int count = 0;
        for (int i = 0, maxA = grid.length; i < maxA; i++) {
            for (int j = 0, maxB = grid[i].length; j < maxB; j++){
                int target = grid[i][j];
                if (isOne(target)) {
                    oneCount++;
                    //上
                    if (i >= 1 && isOne(grid[i - 1][j])) {
                        count++;
                    }
                    //下
                    if (i< maxA - 1 && isOne(grid[i + 1][j])) {
                        count++;
                    }
                    //左
                    if (j >= 1 && isOne(grid[i][j - 1])) {
                        count++;
                    }
                    //右
                    if (j < maxB - 1 && isOne(grid[i][j + 1])) {
                        count++;
                    }
                }
            }
        }
        return oneCount * 4 - count;
    }

    private boolean isOne(int n){
        if (n == 1) {
            return true;
        }
        return false;
    }
}

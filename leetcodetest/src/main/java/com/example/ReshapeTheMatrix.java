package com.example;

/**
 * Created by Cain on 2017/8/18.
 * https://leetcode.com/problems/reshape-the-matrix/description/
 * 566
 * Pass by Cain on 2017/8/18.
 */

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c || nums.length == r) return nums;
        int[][] reshapeMatrix = new int[r][c];
        for (int i = 0, maxA = nums.length; i < maxA; i++) {
            for(int j = 0, maxB = nums[i].length; j < maxB; j++) {
                int position = i * maxB + j;
                int newColumn = (int) position % c;
                int newRow = (int) position / c;
                reshapeMatrix[newRow][newColumn] = nums[i][j];
            }
        }
        return reshapeMatrix;
    }
}

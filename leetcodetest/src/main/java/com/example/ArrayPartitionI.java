package com.example;

/**
 * Created by Cain on 2017/8/16.
 * https://leetcode.com/problems/array-partition-i/description/
 * 561
 * Pass by Cain on 2017/8/16.
 * 其实不算是自己完成，因为这个问题核心在排序算法那里，但我的排序算法是 Copy 过来的。
 */

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int min = 0;
        sort(nums);
        for (int i = 0, max = nums.length; i < max; i = i + 2) {
            min = min + min(nums[i], nums[i + 1]);
        }
        return min;
    }

    /**
     * @param nums
     */
    public void sort(int[] nums){

    }

    public int min(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}

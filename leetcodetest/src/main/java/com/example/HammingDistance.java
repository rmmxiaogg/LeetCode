package com.example;

/**
 * Created by Cain on 2017/8/16.
 * https://leetcode.com/problems/hamming-distance/description/
 * 461
 * Pass by Cain on 2017/8/16.
 */

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int hammingDistance = 0;
        int z = x ^ y;
        String binaryString = Integer.toBinaryString(z);
        char[] binaryChars = binaryString.toCharArray();
        for (char binaryChar : binaryChars) {
            if ('1' == binaryChar){
                hammingDistance ++;
            }
        }
        return hammingDistance;
    }
}

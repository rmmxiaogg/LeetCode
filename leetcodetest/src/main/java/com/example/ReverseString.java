package com.example;

/**
 * Created by Cain on 2017/8/18.
 * https://leetcode.com/problems/reverse-string/description/
 * 344
 * Pass by Cain on 2017/8/18.
 */

public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 0, max = chars.length; i < max; i++){
            char c = chars[max - i - 1];
            sb.append(c);
        }
        return sb.toString();
    }
}

package com.example;

/**
 * Created by Cain on 2017/8/18.
 */

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        if (s == null) return null;
        String[] splitStrings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String string : splitStrings) {
            if (string.length() > 1) {
                char[] chars = new char[string.length()];
                char[] tempchars = string.toCharArray();
                for (int i = 0, max = string.length(); i < max; i++){
                    chars[i] = tempchars[max - i - 1];
                }
                sb.append(String.valueOf(chars) + " ");
            } else {
                sb.append(string + " ");
            }
        }
        return sb.toString().trim();
    }
}

package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Cain on 2017/8/16.
 * https://leetcode.com/problems/encode-and-decode-tinyurl/description/
 * 535
 * Pass by Cain on 2017/8/16.
 */

public class EncodeAndDecodeTinyURL {
    public static final String SHORT_URL = "http://tinyurl.com/";
    public static ArrayList<String> urlList = new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (isNull(longUrl)) return null;
        int ten = urlList.size();
        urlList.add(longUrl);
        return SHORT_URL + Integer.toHexString(ten);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if (isNull(shortUrl)) return null;
        String[] splitStrings = shortUrl.split(SHORT_URL);
        if (splitStrings.length > 0){
            String hex = splitStrings[1];
            if (!isNull(hex)){
                int position = Integer.parseInt(hex, 16);
                return urlList.get(position);
            }
        }
        return null;
    }

    public static boolean isNull(String content) {
        if (content == null || content.trim().length() == 0) {
            return true;
        } else {
            if ("null".equals(content.trim().toLowerCase())) {
                return true;
            } else {
                return false;
            }

        }
    }
}

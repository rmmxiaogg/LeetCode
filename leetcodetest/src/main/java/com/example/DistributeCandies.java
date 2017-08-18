package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Cain on 2017/8/18.
 * https://leetcode.com/problems/distribute-candies/description/
 * 575
 * Pass by Cain on 2017/8/18.
 */

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int candy : candies){
            hashSet.add(candy);
        }
        return hashSet.size() < candies.length / 2 ? hashSet.size() : candies.length / 2;
    }
}

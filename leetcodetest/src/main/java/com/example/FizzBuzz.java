package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cain on 2017/8/18.
 * https://leetcode.com/problems/fizz-buzz/description/
 * 412
 * Pass by Cain on 2017/8/18.
 */

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i = 1; i <= n; i++) {
            if (multiplesOfThree(i) && multiplesOfFive(i)) {
                list.add("FizzBuzz");
            } else if (multiplesOfThree(i)) {
                list.add("Fizz");
            } else if (multiplesOfFive(i)) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }
        return list;
    }

    private boolean multiplesOfThree (int n) {
        return multiplesOf(n, 3);
    }

    private boolean multiplesOfFive (int n) {
        return multiplesOf(n, 5);
    }

    private boolean multiplesOf (int n, int target) {
        if (n / target != 0 && n % target == 0) {
            return true;
        } else {
            return false;
        }
    }
}

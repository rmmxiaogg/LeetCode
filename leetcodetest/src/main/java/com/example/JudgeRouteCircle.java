package com.example;

/**
 * Created by Cain on 2017/8/16.
 * https://leetcode.com/problems/judge-route-circle/description/
 * 657
 * Pass by Cain on 2017/8/16.
 */

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        if (!isNull(moves)){
            char[] movechars = moves.toCharArray();
            for (char movechar : movechars) {
                switch (movechar){
                    case 'L':
                        horizontal--;
                        break;
                    case 'R':
                        horizontal++;
                        break;
                    case 'U':
                        vertical--;
                        break;
                    case 'D':
                        vertical++;
                        break;
                    default:break;
                }
            }
        }
        if (horizontal == 0 && vertical == 0){
            return true;
        } else {
            return false;
        }
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

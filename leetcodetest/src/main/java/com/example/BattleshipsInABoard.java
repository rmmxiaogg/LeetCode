package com.example;

/**
 * Created by Cain on 2017/8/18.
 */

public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;
        //循环遍历每一行
        for (int i = 0, maxH = board.length; i < maxH; i++) {
            //循环遍历每一列
            for (int j = 0, maxV = board[i].length; j < maxV; j++) {
                int temp = j;
                //获取字符
                char a = board[i][j];
                if ('.' == a) {
                    continue;
                } else if ('X' == a) {
                    //count ++;
                    //水平处理
                    for (int k = j + 1; k < maxV; k++) {
                        char b = board[i][k];
                        temp = k;
                        if ('.' == b){
                            break;
                        } else if ('X' == b){
                            continue;
                        }
                    }
                    //垂直处理
                    if (i - 1 >= 0) {
                        char c = board[i - 1][j];
                        if ('X' != c) {
                            count ++;
                        }
                    } else {
                        count ++;
                    }
                    j = temp;
                }
            }
        }
        return count;
    }
}

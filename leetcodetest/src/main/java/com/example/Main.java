package com.example;

/**
 * Created by Cain on 2017/8/16.
 */

public class Main {
    public static void main(String[] args) {
//        battleShipTest();
//        reverseWords();
        distributeCandies();
    }

    private static void battleShipTest(){
        BattleshipsInABoard aboard = new BattleshipsInABoard();
//        char[][] board = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        char[][] board = {{'X', '.', 'X'}, {'X', '.', 'X'}};
        System.out.println(aboard.countBattleships(board));
    }

    private static void reverseWords(){
        ReverseWordsInAStringIII reverseWordsInAStringIII = new ReverseWordsInAStringIII();
        String string = "Let's take LeetCode contest";
        String stringa = reverseWordsInAStringIII.reverseWords(string);
        System.out.println("reverseWords is" + stringa);
    }

    private static void distributeCandies() {
        DistributeCandies distributeCandies = new DistributeCandies();
        int[] candies = {1,1,2,2,3,3,4,5};
        int kinds = distributeCandies.distributeCandies(candies);
        System.out.println("kinds is " + kinds);
    }
}

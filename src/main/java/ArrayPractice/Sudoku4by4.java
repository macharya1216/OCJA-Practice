package ArrayPractice;

import java.util.Arrays;

public class Sudoku4by4 {

    static int[][] game;
    public static void main(String[] args){

        game = new int[4][4];
        game[3][3] = 6;
        System.out.println(Arrays.deepToString(game));
        Object [] object = game;
        System.out.println(Arrays.deepToString(object));

        char[][] ticTacToe = new char[3][3];
        ticTacToe[1][3] = 'X';
        ticTacToe[2][2] = 'X';
        ticTacToe[3][1] = 'X';
        System.out.println(ticTacToe.length+"in a row");

    }
}

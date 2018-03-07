package ArrayPractice;

import java.util.Arrays;

public class Sudoku {
    static int[][] game = new int[3][3];

    public static void main(String... args){
        char[][] ticTacToe = new char[3][3];
        ticTacToe[1][3]     = 'X';
        ticTacToe[2][2] = 'X';
        ticTacToe[3][1] = 'X';
        System.out.println(ticTacToe.length + " in a row!");

        game[2][2] = 6;
        Object[] obj = game;
        System.out.println(game.length);
        System.out.println(Arrays.deepToString(game));
        System.out.println(obj);

        int x = 0;
        for(int type =0; type < 10;)
            if(true)
            continue;
        int[] taxis ;


        return ;
    }

    public String returnStr(int i , int v,boolean val){
        return (val = true) ? "":"";
    }
}

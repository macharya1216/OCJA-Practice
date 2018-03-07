package ArrayPractice;

import java.util.Arrays;

/* */
/*** ***/
/***** ******/
/////////
public class Crossword {

    int[] arr = new int[]{};
    public static void main(String[] args) {
        int[] crossword[] = new int[10][20];
        for (int i = 0; i < crossword.length; i++)
            for(int j = 0; j < crossword.length; j++)
                crossword[i][j]='x';
        System.out.println(Arrays.deepToString(crossword));
    }
   public void main(){}
}

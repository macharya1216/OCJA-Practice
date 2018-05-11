package ocja.practice.arrays_and_lists;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayInitialization {


    /*Test demonstrates how the complier does not complain
            about initializing 0 as the size of the int,
    but throws an array index out of bound exception
    when you actually try to use it. */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSingleArrayInitialization(){
            int[] arrInt = new int[0];
            arrInt[0] = 1;
    }

    @Test
    public void testVariousMultiDimensionArrayInitializationScenarios(){


            int[] multiArrInt[] = new int[1][];

            multiArrInt[0] = new int[1];
            multiArrInt[0][0] = 1;
            assertEquals(Arrays.deepToString(multiArrInt),"[[1]]");

            int[] multiArrInt1[] = new int[1][0];
            multiArrInt[0][0] = 1;
            assertEquals(Arrays.deepToString(multiArrInt),"[[1]]");

            int[] multiArrInt2[] = {{1}};
            assertTrue(multiArrInt2[0][0] == 1);

    }
    static int[][] game;
    @Test
    public void testBasicSudokuWithMultiDimension(){
        try {
            game[3][3] = 6;
        }catch(Exception e){
            System.out.println("Exception "+e);
        }

    }

}

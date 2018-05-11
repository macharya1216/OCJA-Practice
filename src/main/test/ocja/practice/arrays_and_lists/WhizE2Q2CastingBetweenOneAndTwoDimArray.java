package ocja.practice.arrays_and_lists;

import java.util.Arrays;

public class WhizE2Q2CastingBetweenOneAndTwoDimArray {

    public static void main(String[] args){
        long[][] l2d;
        long[] l1d = {1,2,3};
        Object o = l1d;
        l2d = new long[3][3];
       // l2d[0][0] = (long[])o; !! Compile error as we are trying to store a long[] into an array field that requires just long

        long[][] ltwod = new long[3][3];
        System.out.println(Arrays.deepToString(ltwod));

        long[][][] l3d = new long[3][3][3];
        System.out.println(Arrays.deepToString(l3d));
        l3d[0][0] = l1d;
        System.out.println(Arrays.deepToString(l3d));

        int lthreeD[][][] = new int[1][2][3];
        System.out.println(Arrays.deepToString(lthreeD));

    }
}

package ArrayPractice;

import java.util.Arrays;

public class OrderedArray {

    //static int intArray[] = new int[3];
    //static int intArray[] = {};
    static int intArray[] = new int [] {1,2,3};
    /*{6,5,4,3,2,2,1}*/
    public static void main (String[] args){
        System.out.println(Arrays.toString(intArray));
        String[] strings = {"String"};
        Object[] object = strings;
        object[0] = new StringBuilder();
        //Arrays.toString(object);

    }
}

package ocja.practice.arrays_and_lists;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhizE1Q6ComparableArrayThrowsClassCast {

    @Test
    public void testArraysSortWithMultiDimensionArray(){
        String[][] strings = {{"A","Z"},{"C","D","S"},{"L"}};
        boolean classCastExceptionCaught = false;
        try {
           Arrays.sort(strings);
       }catch(ClassCastException e){

           /*   Array class has a few overloaded version of sort method, there is no method that takes a two dimensional array.
           so it only matches the version of an overlaoded method which takes Object[] as the argument. Here the
                   sorted method does not try to cast the whole sorted array to Comparable or to Comparable[] , it just
                   casts its element to Comparable. Inthis case those elements are of type String[] which is not Comparable
                   so it throws ClassCastException error*/
            classCastExceptionCaught = true;
       }
       assertTrue(classCastExceptionCaught);
        for(String [] str:strings){
            for(String s : str){
                System.out.print(s);
            }
        }
    }

    @Test
    public void testArraysEqualsWithArrays(){
        String[][] multiArray = {{"A","Z"},{"C","D","S"},{"L"}};
        String[] singleArray = {"A","B","C"};
        System.out.println(Arrays.equals(multiArray,singleArray));
        System.out.println(Arrays.deepEquals(multiArray,multiArray));
    }
}

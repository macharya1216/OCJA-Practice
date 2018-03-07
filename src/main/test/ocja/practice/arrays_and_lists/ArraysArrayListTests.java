package ocja.practice.arrays_and_lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ArraysArrayListTests {

  /*  Two array lists with the same content are equal
    while two arrays with same content are not .
    Array uses the reference equality while arraylist
    tests for equivalence*/

    @Test
    public void testArraysEqualsVsArrayListEqual() {

        // Two arrays with same content are not equal
        String[] stringArray = new String[]{"A", "B", "C"};
        String[] stringArrayCopy = new String[]{"A", "B", "C"};

        assertTrue(!stringArray.equals(stringArrayCopy));

        // Two ArrayLists with the same content are equal

        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");

        List<String> arrayListCopy = new ArrayList<>();
        arrayListCopy.add("A");
        arrayListCopy.add("B");

        assertTrue(arrayList.equals(arrayListCopy));

        // unordered array lists are not equal
        arrayListCopy.set(0,"B");
        arrayListCopy.set(1,"A");

        assertTrue(!arrayList.equals(arrayListCopy));

        // initial capacity of an arraylist is not the same as size

        List<Integer> arrList = new ArrayList<>(10);
        assertTrue(arrList.size()==0);

        // We can assign int values as the elements of char array and vice versa
        int []intArray = new int[2];
        intArray[0] = 'X';
        intArray[1] = 1;
        System.out.println(Arrays.toString(intArray));
        assertTrue(intArray.length ==2);
        boolean charXFound = false;
        for(int intr : intArray)
        {
            if(intr == 'X')
            {
                charXFound = true;
                break;
            }
        }
        assertTrue(charXFound);

        char []charArray = new char[2];
        charArray[0] = 1;
        charArray[1] = 'X';
        System.out.println(Arrays.toString(charArray));
        assertTrue(charArray.length ==2);
        boolean int1Found = false;
        for(int intr : charArray)
        {
            if(intr == 1)
            {
                int1Found = true;
                break;
            }
        }
        assertTrue(int1Found);



    }
/*
    Tests asserts that when we try to initialize an array without
    first creating then, java throws a null pointer . This test will
    test on a multidimensional array*/
    @Test(expected = NullPointerException.class)
    public void usingUninitializedArraysThrowsNullPointerException(){

        int array[][] = new int[2][];
        array[0][0] = 0;
        array[0][1] = 1;

    }

    /*
    Test shows how to initialize and then create a new array
    before adding elements to them*/
    @Test
    public void testHowToInitializeAndCreateArrayProperly(){

        int array[][] = new int[2][];
        array[0] = new int[2];
        array[0][0] = 0;
        array[0][1] = 1;
        assertTrue(array.length == 2);
        assertTrue(array[0].length == 2);

    }

    /*
  Test shows how to initialize and then create a new array
  before adding elements to them*/
    @Test
    public void testHowToInitializeAndCreateArrayAlternate(){

        int array[][] = new int[2][];
        array[0] = new int[]{0,1};
        assertTrue(array.length == 2);
        assertTrue(array[0].length == 2);

    }

    /*
 Test shows how to initialize and then create a new array
 before adding elements to them*/
    @Test
    public void testHowToInitializeAndCreateArrayAlternate1(){

        int array[][] = {{0,1},{}};
        //array[1] = {2,3};  // This throws a compiler error though, array initializer not allowed here.
        assertTrue(array.length == 2);
        assertTrue(array[0].length == 2);

    }

        /*
    Test shows that uninitialized arrays take default elements.
    We will be using int and String to demonstrate this*/
    @Test
    public void testNoninitializedArrayElementsTakeDefaultValue(){
        short x = 0XF;
        int []intArray = new int[x];
        String []stringArray = new String[3];
        assertTrue(intArray[2] == 0);
        assertTrue(stringArray[2] == null);

    }
}

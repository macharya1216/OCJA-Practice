package ocja.practice.arrays_and_lists;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
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
        String []stringArrayCopy = {"A", "B", "C"};

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
        int intArray      [] = new int[2];
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

        char []charArray ;
        charArray = new char[2];
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

    /*Method tests how to sort an array and how are elements stored in the order
    before sort

    Notice how symbols sort before numbers , except underscore which sorts after
    capital letters, and capital letters sort before small letters.

    */
    @Test
    public void testHowToOrderArray(){
        String str[];
        str = new String[] {"A","D","C","b","f","g","1","3","#","_","$","@"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        assertEquals(Arrays.toString(str),"[#, $, 1, 3, @, A, C, D, _, b, f, g]");
    }

    @Test
    public void testHowToBinarySearchArray(){

        char[] charArray = {'X','Y','X','1','*'};
        System.out.println(Arrays.binarySearch(charArray,'X'));
    }


/*
    Tests asserts that when we try to initialize an array without
    first creating then, java throws a null pointer . This test will
    test on a multidimensional array*/
    @Test(expected = NullPointerException.class)
    public void usingUninitializedArraysThrowsNullPointerException(){

        int array[][] = new int[2][];
        array[0][0] = 0;
        //array[0][1] = 1;

    }

    /*
    Test shows how to initialize and then create a new array
    before adding elements to them*/
    @Test
    public void testHowToInitializeAndCreateArrayProperly(){

        try {
            int array[][] = new int[2][2];
            Arrays.sort(array);
          //  array[0] = new int[2];
            array[0][0] = 0;
            array[0][1] = 1;
            array[1][0] = 2;
            System.out.println(Arrays.deepToString(array));
            assertTrue(array.length == 2);
            assertTrue(array[0].length == 2);
        }catch(Exception e){
            System.out.println("Exception caught "+e);
        }
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

    /*Method demonstrates that if you are using a
            raw list, you can pretty much add
            any object to it. Also the add method
            returns a boolean which is always true*/
    @Test
    public void testArrayListCapacity(){
        int val = 0;
        String nullString = null;
        List strList = new ArrayList<>();
        assertTrue(strList.add(new StringBuilder("boom")));
        assertTrue(strList.add(1.0f));
        strList.add(val);
        strList.add(new char[] {'A','B'});
        strList.add(Arrays.asList("ABC"));
        /* Notice you can insert null to a List and it will print just fine as long as you
        dont invoke any method on that null item in the for loop*/
        strList.add(nullString);

        for(Object obj : strList)
            System.out.println(obj);
        char [] charArray = (char[]) strList.remove(3);
        assertTrue(strList.size() == 5);
        strList.remove(null);
        assertTrue(strList.size() == 4);
    }



    /*Notice the initial capacity of an arraylist is set to 10,
    if you add an item with index greater than 10 on an empty list, Java
    will throw an IndexOutOfBoundException*/
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddWithInvalidIndexThrowsIndexOutOfBoundException(){
        List strList = new ArrayList<>();
        strList.add(1,"");

    }

    /*
    A list can accept null and in some scenaros also
    output the null, but in cases where autoboxing and
            unboxing takes place between primitives and object
    this might be an issue, notice in the example below,
    we are adding null to the list ages which is fine,
    but when we are iterating the list, the items in the list
    are automatically getting unboxed to primitive int which
            will cause null pointer exception */

    @Test(expected = NullPointerException.class)
    public void testAutoboxingAndNullItemList(){
        List<Integer> ages = new ArrayList<>();
        ages.add(0);
        ages.add(null);
        for(int in : ages)
            System.out.println(in);
    }

}

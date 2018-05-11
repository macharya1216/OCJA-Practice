package ocja.practice.operators_datatypes;

/*
This example shows the basic rules of java data types
*/

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BasicDataTypes {



    @Test
    public void testBasicDataTypes(){


        /*Demonstrates the order of preceedence of the operators
                and the change in the order of precendence based upon
                the parenthesis*/
        int x = 5;
        assertTrue((3 + 4 * (--x)) == 19);
        assertTrue(((3 + 4) * (--x)) == 21);

        /*Java will automatically promote one of the variable to the larger of
                the data type, here you see that the intiger 3 and 4
                are promoted to a double 19.0*/

        double d = 5f;
        assertTrue((3 + 4 * (--d)) == 19.0);
        /*
        If one value is integral and the other is floating point
                or double then Java automatically promotes the
                integral value to float, the result is then promoted to float*/
        assertTrue(Float.class.isInstance(20 + 20.f));
        assertTrue(Double.class.isInstance(20 + 20.0));

        byte b = 12;
        short s = 90;

        /*smaller data types mainly byte, short, char are first
                promoted to int any time they're used with a java
                binary arithmatic opertor*/
        assertTrue(Integer.class.isInstance( b+ s + 'X'+ 'x'));

        /*During equality operation, if the numeric values are
                of different data type, the values are automatically
                promoted to the larger datatypes. */
        assertTrue(Boolean.class.isInstance( 'X'==5.0));


        /*For wrapper types of primitives of float, double and long we need the letter (F,D,L) at the end of the number.*/
        float f = 1;
        //Float F = 1; //!! Compile error , found int
        Float F = new Float(1.0f);
        Float F2 = new Float(1);
        Float F1 = new Float ("1F");
        Float F3 = 1.0f;
        System.out.println(F +" "+F2+" "+F1);

        // Integer I = 'C'; !! Compile error
        int i = 'C';
        Integer I = new Integer('C');
        char c = 1;

    }

}

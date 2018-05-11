package ocja.practice.StringsAndStringBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StringConcatenation {

    /*Method demonstrantes how + is overloaded
    for Strings to concatenate strings.
    The concatenation happens from left to write
    and depending upon where the string is located
    the behaviour is difference , ex
    check out difference betweeen the concatenation
    in line 26 and 32.  */


    @Test
    public void testBasicStringConcatenation(){
        String s = "";
        /*String is added at the end which causes 1 2 and 3
                to be added as numbers*/

        assertEquals(1+2+3+s,"6"); //

        /*String is in the middle of concatenation, which
          makes 1 and 2 to be added as numbers
          and then the 3 at the end get' treated
          like a string*/

        assertEquals(1+2+s+3,"33");
        /*Notice the usage of parenthesis changed the
          order of evaluation in the expression
          from left to right to first the addition
          in the brackets then the left to right
          evaluation*/

        assertEquals(1+2+s+3+(1+2),"333");
        assertTrue(String.class.isInstance(1+2+3+s));


      /*  Usage of parenthesis changes the order of evaluation in the
                concat() method as well */

        String str = "3";
        str = str.concat((1+2)+"");
        assertEquals(str,"33");


    }

/*    Method demonstrates object equals vs equivalence
            in Strings
            For String literal that is the same sequenc
            of characters, Java tries to add them all
            to the same String pool which makes them
            essentially the same objects. Here fluffy and
            stringette are two different string reference
            variables but they are internally the same variable
            Any String thing is evaluated at runtime, with a
            method like concat() or trim() or created as a
            new Object will not share the same pool even
            if the sequence of character end up being the
            same in the end, they will however be equals in
            terms of equivalence
            */
    @Test
    public void testStringPoolVsHeap(){
        String fluffy = "Fluffy";
        String stringette = "Fluffy";
        String fluffyObj = new String("Fluffy");
        String concatenatedFluffy = "Flu".concat("ffy");
        String trimmedFulffy = "Fluffy ".trim();

        assertTrue(fluffy == "Fluffy");
        assertTrue(fluffy == stringette);
        assertTrue(fluffy != fluffyObj);
        assertTrue(fluffy != concatenatedFluffy);
        assertTrue(fluffy != trimmedFulffy);
        assertEquals(fluffy,fluffyObj);
        assertEquals(fluffy,concatenatedFluffy);
        assertEquals(fluffy,trimmedFulffy);
    }


}

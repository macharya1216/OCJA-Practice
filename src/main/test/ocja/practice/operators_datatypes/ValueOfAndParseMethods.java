package ocja.practice.operators_datatypes;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*Example demonstrates ways to convert string to
primititve or wrapper class  also demonstrates
which conversion could throw rumtime exceptions*/
public class ValueOfAndParseMethods {

    @Test
    public void testBooleanWrapperPrimConversions(){

        /*The parseBoolean method of the Boolean class can
        only except a String parameter*/
        assertTrue(Boolean.parseBoolean("true"));
        assertTrue(Boolean.class.isInstance(Boolean.parseBoolean("true")));

        /*Boolean constructor accepts string or a primitive poolean and creates a Boolean
                object based upon that*/
        assertTrue(new Boolean("TrUE"));

  /*      Notice Boolean constructor or the parseBoolean method does not throw an error if a non
                boolean type argument (i.e anything except the literals true and false) are passed*/
        assertFalse(new Boolean("NO"));

        assertTrue(Boolean.class.isInstance(new Boolean(true).booleanValue()));


        assertFalse(Boolean.valueOf("i dont know"));

    }

    @Test
    public void testByteShortCharWrapperPrimConversion(){

        /*
         Can throw number format exception if :
        The first argument is null or is a string of length zero.
                The radix is either smaller than Character.MIN_RADIX or larger than Character.MAX_RADIX.
                Any character of the string is not a digit of the specified radix, except that the first character may be a minus sign '-' ('\u002D') or plus sign '+' ('\u002B') provided that the string is longer than length 1.
        The value represented by the string is not a value of type byte.*/

        assertTrue(Byte.parseByte("-10",10) == -10.0f);
        byte b = 9;
        //  Byte.valueOf(9); // ! COMPILE ERROR , value of even though takes byte as a parameter, does not take a literal such as 9,10 as it probably converts that to int
        assertTrue(Byte.valueOf((byte)9) == 9);
        /* Note while using the constructor of the Byte object, you cant just use the literal number as the compiler things that the number is an int, you have to explicitly
        cast it to byte*/
        assertTrue(Byte.class.isInstance(new Byte((byte)9)));

        assertTrue(Short.parseShort("10",10) == 10L);

        // Notice since byte is smaller than short, you can use byte anywhere you can use short.
        assertTrue(Short.class.isInstance(new Short((short)9)));

        assertTrue(Short.valueOf((byte)1) == 1L);

        assertTrue(Short.class.isInstance(new Short("9")));


    }

    @Test(expected=NumberFormatException.class)
    public void testByteWrapperPrimConversionNegativeScenario(){
        Byte.parseByte("");
    }

    @Test
    public void testCharacterWrapperPrimConversion(){

       /*Character does not participate in parse and value of methods
       * But you should still be able to use a Character constructor
       * to create a new Character
       * */
       Character c = new Character('X');
       assertTrue(c instanceof Character);

       /*Character has a Valueof and Constructor that just takes a character and
        converts to Wrapper object*/
       Character.valueOf('X');

       //  Character c1 = new Character("X"); // Character does not have a Constructor that takes string
       // Also remember Character does not participate in valueOf or parseInt conversion
    }

    @Test
    public void testIntegerWrapperPrimitiveConversion(){
/*
       You can construct Integer using the constructor
                that takes either primitive int or String*/


        Integer bigInt = new Integer("9");
        assertTrue(bigInt == 9);

        /*Or it would work with a Char because you can
                use a character anyplace you can use an int*/
        bigInt = new Integer('X');

        bigInt = new Integer ((short)9 + (byte)1);

        int primitiveInt = Integer.parseInt("-10");
        assertTrue(Integer.class.isInstance(primitiveInt));

        bigInt = Integer.valueOf('Y');




    }

    /*Example shows how attempting to create integer
    using a String value of a Double or float causes
            Number format exception*/
    public void negativeIntegerCreationByConstrutor(){
/*
       You can construct Integer using the constructor
                that takes either primitive int or String*/
        try {
            Integer bigInt = new Integer("9L");
            throw new AssertionError("Exception should have been thrown");
        }catch(Exception e){
            assertTrue(e instanceof NumberFormatException);
            assertEquals("java.lang.NumberFormatException: For input string: \"9L\"",e.getMessage());
        }

        try {
            Integer bigInt = new Integer("9.0");
            throw new AssertionError("Exception should have been thrown");
        }catch(Exception e){
            assertTrue(e instanceof NumberFormatException);
            assertEquals("java.lang.NumberFormatException: For input string: \"9.0\"",e.getMessage());
        }

        try {
            Integer bigInt = new Integer("9f");
            throw new AssertionError("Exception should have been thrown");
        }catch(Exception e){
            assertTrue(e instanceof NumberFormatException);
            assertEquals("java.lang.NumberFormatException: For input string: \"9f\"",e.getMessage());
        }

        try {
            Integer bigInt = new Integer("X");
            throw new AssertionError("Exception should have been thrown");
        }catch(Exception e){
            assertTrue(e instanceof NumberFormatException);
            assertEquals("java.lang.NumberFormatException: For input string: \"X\"",e.getMessage());
        }
    }

    @Test
    public void testLongFloatDoubleWrapperPrimitiveConversion(){

        Double wrapperDouble = new Double("9f");
        assertTrue(wrapperDouble == 9.0);

        wrapperDouble = new Double("9");
        assertTrue(wrapperDouble == 9.0);

         try {
            wrapperDouble = new Double("9L");
            throw new AssertionError("Exception should have been thrown");
        }catch(Exception e){
            assertTrue(e instanceof NumberFormatException);
            assertEquals("For input string: \"9L\"",e.getMessage());
        }

        /*You can pass any smaller primitive i.e long , int , short , byte , char ?*/
       double primitiveDouble = Double.valueOf(9L);
        primitiveDouble = Double.valueOf('X');
        primitiveDouble = Double.valueOf((byte)1);
        assertTrue(primitiveDouble == 1.0);


        /*But passing the character X as a string literal and calling valueOf will fail.
        Basically if you are using a String to convert back to primitive, you need
                to make sure you do not get a number format exception by making
                sure you have a digit - or + signs are ok as long as the digit
                falls into the range. For double and float you can use . or f in the
                string literal*/
        try {
            primitiveDouble = Double.valueOf("X");
            throw new AssertionError("Exception should have been thrown");
        }catch(Exception e){
            assertTrue(e instanceof NumberFormatException);
            //assertEquals("For input string: \"9L\"",e.getMessage());
        }


    }

    @Test
    public void testShortCircuitWithPostUnaryOperator(){




      /*  The result evaluation is using a short
        circuite logical operator || (OR). For the
                result of OR to be false, both
                parties have to be false .
               here the first party (x >=6) is
               already true so the result is definately
               going to be true hence the second party
               i.e ++x <=7 does not even get called*/
        int x = 6;
      boolean result = (x>=6 || ++ x <=7);
        assertTrue(x == 6);

         result = (x>6 || ++ x <=7);
        assertTrue(x == 7);

    }

    public void testBooleanAssignmentVersusEquality(){
        assertEquals("up",runTest(false,true));
    }

    private String runTest(boolean spinner,boolean roller){
        if(spinner=roller) return "up";
        else return roller  ? "down": "middle";
    }


}

package ocja.practice.StringsAndStringBuilders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringBuilderBasics {

    /*Method tests how passing null to Stringbuilder throws null pointer exception*/

    @Test(expected = NullPointerException.class)
    public void testPassingNullToConstructorThrowsNullPointer(){
        StringBuilder strBuilder = new StringBuilder(null);
    }


    @Test
    public void testStringBuilderConstructors(){

        /*You can specify capacity by passing an int or a char to the
                StringBuilder constructor*/
        StringBuilder strBuilder = new StringBuilder('X');
        assertTrue(88 == strBuilder.capacity());

        /*When you initialize an empty StringBuffer, the capacity
                defaults to 16*/

        strBuilder = new StringBuilder();
        assertTrue(16 == strBuilder.capacity());

        /*When you initialize a StringBuffer with String, the capacity
                becomes 16 (starting capacity) + the length of the string*/

        strBuilder = new StringBuilder("animals");
        assertTrue(23 == strBuilder.capacity());

        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(35);
        assertTrue(35 == sb.capacity());

    }

   /* method tests creation of a string builder and appending
    a float into the string builder.
            Notice the capacity is still 16 even after we append
            the float in the empty string builder*/

   @Test
    public void testStringBuilderAppend(){

        float fl = 1.0f;
        StringBuilder strBuilderFloat = new StringBuilder().append(fl);
        assertEquals(strBuilderFloat.toString(),"1.0");
        assertTrue(strBuilderFloat.capacity() == 16);

        String str = null;
        StringBuilder strBuilder = new StringBuilder().append(str);


        char[] charArray = new char[]{'X','A','E'};
        strBuilder.append(charArray);

     }

     @Test
    public void testStringMethodsOnStringBuilder(){
        StringBuilder strb = new StringBuilder("animals");
        assertEquals(strb.charAt(1),'n');

        assertEquals(strb.lastIndexOf("",4),4);
     }

     @Test
    public void testStringBuilderInsert(){
        StringBuilder sb = new StringBuilder("animals");

        sb.insert(0,"str",0,1);
        sb.insert(0,new char[]{'B','U'},0,1);
        assertEquals(sb.toString(),"Bsanimals");
    }

    /*Method demonstrates how null append is not allowed
            for string buffer, but you can insert a null
    object or a string;*/
    @Test
    public void testNullAppendNotAllowed(){
        StringBuilder sb = new StringBuilder("animals");
        String nullStr = null;
        Object nullObj = null;
        sb.append(nullStr).append(nullObj);
       assertEquals(sb.toString(),"animalsnullnull");
       //  sb.append(null); Compile error
    }


    /*Replaces the characters in a substring of this sequence with characters in the specified String. The substring begins at the specified start
    and extends to the character at index end - 1 or to the end of the sequence if no such character exists. First the characters in the substring are
    removed and then the specified String is inserted at start. (This sequence will be lengthened to accommodate the specified String if necessary.)
    */
    @Test
    public void testGeneralStringReplace(){
        StringBuilder strb = new StringBuilder();
        strb.append("ABCDEFG");
        strb.replace(2,3,"boomer");
        assertTrue(strb.equals("ABboomerEFG"));

     }

    @Test
    public void testStringInsertMaxLength(){
        StringBuilder strb = new StringBuilder("radical").insert(7,"robots");
        System.out.println(strb);

    }

    @Test
    public void testStringBuilderSetLength(){
        StringBuilder sb = new StringBuilder("ABCDEFG");
        assertTrue(sb.length() == 7);
        sb.setLength(10);
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.setLength(3);
        System.out.println(sb);
    }


    @Test
    public void testStringBuilderDeleteCharAt(){
        StringBuilder sb = new StringBuilder();

        sb.insert(0,new float[]{1.0f,3.0f});
        sb.insert(1,new char[]{'X','Y'});
        sb.insert(2,"YABA");
        System.out.println(sb.toString());
        System.out.println(sb.length());
        sb.deleteCharAt(8);
        sb.deleteCharAt(9);

        System.out.println(sb.toString());
        System.out.println(sb.length());
        }

}

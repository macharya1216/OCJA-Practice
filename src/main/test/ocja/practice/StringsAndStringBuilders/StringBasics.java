package ocja.practice.StringsAndStringBuilders;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringBasics {



    /*Method tests how to create a String using a char array*/
    @Test
    public void testCreateStringUsingArray(){

        char [] charArray = {'A','b','C','D'};
        String str = new String(charArray,0,charArray.length-1);
        System.out.println(str);
    }

    /*Method tests the intern() method of string and how it affects
        the behaviour of == comparision*/
   @Test
   public void testStringEquality(){
       String str1 = "ban".concat("ana");
       String str2 =  new String("banana");
       String str3 = "banan".concat("a");

       assertTrue(str1.equals(str2));
       assertTrue(str1.equals(str3));
       assertTrue(str1.intern() == str2.intern());
       assertTrue(str1 != str2);
       assertTrue(str3.intern() == str2.intern());

   }
    /* Method demonstrates that the string indexes start from
            zero and when the charAt() method is passed an
        invalid index , it throws String index out of Bound. */
    @Test(expected=StringIndexOutOfBoundsException.class)
    public void testStringsCharAtThrowsStringIndexOOBException(){
        String str = "animals";
        str.charAt(str.length());

    }

    @Test
    public void testBasics(){
        String str = "bananas";

        assertTrue(str.indexOf('a') == 1); // Finds the first occurance of 'a'
        assertTrue(str.indexOf('A') == -1); // is case sensetive

        assertTrue(str.lastIndexOf('a') ==5);

        assertTrue(str.lastIndexOf('a',4) ==3);
        assertTrue(str.lastIndexOf('a',1) ==1);

        /*If you pass an empty String as a parameter in indexOf(),
                you do not get -1, instead if you are using index
                of or lastIndex of without the fromIndex, then you
                either get 0 or the length of the string as the if (index == null) {
            If you are using a fromIndex parameter, then you get the fromIndex as the
                    result*/

        assertTrue(str.indexOf("") == 0);
        assertTrue(str.indexOf("",4) == 4);


    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testStringSubstringThrowsIndexOOBException(){
        String str = "animals";
        str.substring(-1);  // or  str.substring(str.length() +1)

    }

    @Test
    public void testBasicStringSubstring(){

        String str = "animals";
        str = str.substring(0);
        assertEquals(str,"animals");

        str = "animals";
        String newSubstr = str.substring(0,1);
        assertEquals(newSubstr,"a");
    }

 /*  Method tests the basic of starts with,
    few important things to note
    1) Is case sensetive
    2) if string to compare is empty, returns true
    3) if string to compare contains the entire string compared
            then returns true.*/
    @Test
    public void testStartsWithEndsWith(){
        String str = "bananas";
        assertTrue(str.startsWith("b"));
        assertTrue(!str.startsWith("san"));
        assertTrue(!str.startsWith("BAN"));
        assertTrue(str.startsWith(""));
        assertTrue(str.startsWith("bananas"));
        assertTrue(str.startsWith("as",5));
        assertTrue(str.startsWith("",5));
        assertTrue(str.endsWith("as"));
        assertTrue(str.endsWith("bananas"));



    }

    @Test
    public void testStringReplace(){
        String str = "bananas";
        String replacedString = str.replace("boss","baby");
        /*Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence
                In this example, the substring to match is "an" and in our literal "bananas" we have "an" repeated twice, so the replace
                will replace both substring with the "su" replacement literal*/
        assertEquals(replacedString,"bananas");
        replacedString = str.replace("an","su");
        assertEquals(replacedString,"bsusuas");
        String newReplacedString = str.replace("ana","su");
        assertEquals(newReplacedString,"bsunas");

        str = "bananas";
        str = str.replace("na","86");
        str = str.replace((85+1)+"","81");
        assertEquals(str,"ba8181s");

    }

    @Test
    public void testStringContains(){

        String str = "animals";
        System.out.println(str.contains(new StringBuilder("a")));
        System.out.println(str.contains(""));

        StringBuilder sb = new StringBuilder();

    }

    @Test
    public void testStringConcat(){
        String a = "";
        String val = "";
        a += 2;
        a = a + 'c';
        a  =a + false;
        if(a == "2cfalse")
            val = "==";
        if(a.equals("2cfalse"))
            val = "equals";

        assertEquals(val,"equals");
    }



}

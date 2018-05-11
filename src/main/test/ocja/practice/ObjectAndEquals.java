package ocja.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ObjectAndEquals {

    /*This method tests various equals() scenarios with Object class*/

    @Test
    public void testStringEquals(){

        Comparable str = "abc";
        CharSequence str1 = "abc";
        assertTrue(str.equals(str1));
        assertTrue(str == str1);
        CharSequence strBuilder = new StringBuilder("abc");
        Appendable strBuider1 = new StringBuilder("abc");
        assertTrue(!strBuilder.equals(strBuider1));

        ArrayList list1 = new ArrayList<>(Arrays.asList("1","2","3"));
        ArrayList list2 = new ArrayList<>(Arrays.asList("1","2","3"));
        assertTrue(list1.equals(list2));
        Collection coll = list1;
        Iterable col2 = list2;
        assertTrue(coll.equals(col2));
    }
}

package ocja.practice.arrays_and_lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListFeaturesGeneral {

    /*Method demonstrates how to split a string to
            char array and convert it to list.
            Further more it demonstrates some of the core
            methods of the List class*/
    @Test
    public void testMutableListFeatuersWithChar(){
        List<Character> charArray= new ArrayList<>();
        List<Character> subArray= new ArrayList<>();

        charArray =  returnCharArray( "ABCDEFGHI");
        subArray = returnCharArray( "ACEGI");
        assertTrue(charArray.toString().equals("[A, B, C, D, E, F, G, H, I]"));
        assertTrue(subArray.toString().equals("[A, C, E, G, I]"));

        List<Character> retainedCharArray = new ArrayList<>(charArray);
        retainedCharArray.removeAll(subArray);
        assertTrue(retainedCharArray.toString().equals("[B, D, F, H]"));

        Character getCharacter = charArray.get(0);
        assertTrue(getCharacter =='A');
        int charArg = charArray.get(1);
        assertTrue((char)charArg == 'B');

        int charAdd = charArray.get(0) + charArray.get(1);
        assertTrue((char)charAdd == '\u0083');

      /*Notice how the parent list and the sublist are tied together when we create
                a new list using sublist, we added element in the parent i.e charArray,
                which reflected in the child i.e subListChar. We cleared the subListChar
                which caused items to be cleared from the parent list*/

        List<Character> subListChar = charArray.subList(4,7);
        assertTrue(subListChar.size() == 3);
        assertTrue(subListChar.toString().equals("[E, F, G]"));

        charArray.set(5,'T');
        assertTrue(subListChar.get(1).equals('T'));

        subListChar.clear();
        assertTrue(charArray.toString().equals("[A, B, C, D, H, I]"));

        List<Character> remSubListChar = charArray.subList(1,4);
        charArray.removeAll(remSubListChar);

        assertTrue(charArray.toString().equals("[A, H, I]"));

     }

    @Test(expected = UnsupportedOperationException.class)
    public void testImMutableListFeatuersWithChar(){
        List<Character> charArray= Arrays.asList('A','B','C','D','E');
        charArray.add('C');
    }

    /*Method tests the behaviour of the sublist method where if removeAll,
    method is executed on the superList with the sublist as the parameter
            then accessing the sublist after this removal throws a concurrent
            modification
    */
    @Test(expected = ConcurrentModificationException.class)
    public void accessingSublistAfterRemoveAllInParentListThrowsError(){
        List<Character> superList = returnCharArray("ABCDEFG");
        List<Character> subList = superList.subList(1,4);
        superList.removeAll(subList);
        System.out.println(subList.isEmpty());
    }

    @Test
    public void testContainsBehaviourOnAList(){
        List<Character> charList = returnCharArray("ABCDEFGH");
        List<Character> anotherCharList = returnCharArray("HGF");
        assertTrue(charList.containsAll(anotherCharList));
        assertTrue(charList.contains('E'));
        assertTrue(!charList.contains(null));
    }


    /*Method demonstrates the basics of toArray method of the list.
    The general idea is the backed up list is free from the
            array that is created , and a new array is returned
    if the size of the current array is smaller than the one
    that is being asked to create in the parameter of the toArray()*/

    @Test
    public void testToArrayGeneral(){
        Object[] objArray = new Object[3];
        for(int i = 0; i < objArray.length; i ++)
            objArray[i] = 'A';
        assertEquals(Arrays.toString(objArray),"[A, A, A]");
        List<Character> charList = returnCharArray("ABC");
        objArray = charList.toArray();
        assertEquals(Arrays.toString(objArray),"[A, B, C]");
        objArray[2] = 'X';
        assertTrue(charList.get(2).equals('C'));
    }



    private List<Character> returnCharArray(String str) {
        List<Character> charArray = new ArrayList<>();
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length ; i++) {
            charArray.add(charArr[i]);
        }
     return charArray;
    }





}

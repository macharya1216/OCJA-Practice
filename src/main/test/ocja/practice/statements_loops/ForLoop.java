package ocja.practice.statements_loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/*class tests all the various combinations of legal for loop declarations*/
public class ForLoop {


    /*Method deomonstrates the straight forward way of initializing a for loop*/
    @Test
    public void testForLoopSimpleScenario() {
     // the most common way
        String output = "";
        for(int x = 0;x < 10 ; x++)
            output += x;
        assertEquals(output,"0123456789");

        // for each loop
        output = "";
        for(int x : Arrays.asList(123456789))
            output +=x;
        assertEquals(output,"123456789");
    }

    /*Method demonstrates some wierd looking for loops ;;*/
    @Test
    public void testWierdLookingForLoop() {

       /*The initialization block, boolean expression and
       * update statements can include extra variables that may not reference
       * each other*/

        int count = 0;
        int x = 0;
        String output ="";
        for (doStuff(),System.out.println(); count < 10 && doStuff(); output += count,System.out.println(),x =21,count++,doStuff());
        assertEquals(output,"0123456789");

    }
    public boolean doStuff(){
        return true;
    }

    @Test
    public void testImportanceOfUpdateStatement(){

        /*This would generate an infinite loop because the expression inside the loop increments i but
                then assignes i to the old value 0. */
        /*  for(int i = 0;i < 10;)
            i = i++;*/
    }

}

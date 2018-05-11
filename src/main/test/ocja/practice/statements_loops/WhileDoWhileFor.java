package ocja.practice.statements_loops;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/*Example demonstrates Repetition control structures such as
While, doWhile, for and for each . */
public class WhileDoWhileFor {

    /*Remember, any loop can be converted to and from the do and while loop and vice versa*/

    @Test
    public  void testWhile(){
        int i = 10;
        String value = "";
        while(--i > 0) value +=i;
        assertEquals(value,"987654321");


        /*Watch out for doWhile or while loops that could have the following tricks
                while without brackets. Braches are only required if there are multiple
                statements. The variable that is used in the loop might be inititalized
                inside the do loop , or might not be initialized at all.
        */

        int j  = 10;
        value = "";
        do value +=j;
        while(--j > 0);
        assertEquals(value,"10987654321");


       /*This example shows how Continue and Break
                can be used with the while and do while
            loops . Notice that if the if(k>0) block was not
                in braces, then the value +=k statement would
                not compile */
        int k = 19;
        value = "";
        WHILE : while(k  > 0) {
            do {
                if(k > 0) {
                    k--;
                    continue WHILE;
                }
            } while (k != 19);
            value +=k;
        }
        assertEquals(value,"");
    }

/*    Method demonstrates how for loop just
            requires two semi colons to be a
    valid loop*/
    @Test
    public void testForLoops(){
        String value = "";
        boolean boolValue = true;
        if(boolValue = false) {
            for (; ; ) {
            }
        }else value ="passed";
        assertEquals("passed",value);
    }

   /*
    method demnostrates how usign assignment inside the
    boolean evauluation section of a while, if else or foor
            loop throws a copile error*/

    @Test
    public void testWhileAssignmentInsteadOfEqualsDoesNotCompile(){
        String tie = null;
        boolean val = false;
        //while (tie = "null") !! COMPILE error
            tie = "shoelace";
        // if(tie = null) !! COMPILE error
        //  for(int i=0 ; i = 0 ;i++) !! COMPILE ERROR

    }


/*    While it works with if, the while will throw an error
            if the condition is false to begin with. */
    @Test
    public void testWhileLoopWithFalseConditionComiplerComplains(){
        int i = 10;
        /*while(false){
            // i = 20;
            //System.out.println(i);  // !! Compiler error , complains for uncreachable code
        }*/
      //  while(1 != 1){
                                        // !! Compiler error , unreachable code.
        //}

        if(false){
            System.out.println("");
        }



    }

}

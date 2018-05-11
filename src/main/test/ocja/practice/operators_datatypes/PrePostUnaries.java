package ocja.practice.operators_datatypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrePostUnaries {

      /*Method shows how we can use the Ternary operator
    inside an if clause. Ternary operator in line 173
    will result with an int which we then use for comparison.
            Also note the use of the pre unary operator in -- luck
    vs post unary operator ++ luck. The result is different depending
    upon which one we use. */

    @Test
    public void testIfElseWithPreandPostUnaryOperator(){
        int luck = 10;
        String val = "";
        if((luck > 10 ? luck++:--luck) < 10){
            val +="Bear";
        }
        if(luck < 10)
            val+="Shark";
        assertEquals("BearShark",val);

        val = "";
        if((luck > 9 ? luck++:luck--) < 9){
            val +="Bear";
        }
        if(luck < 9)
            val+="Shark";
        assertEquals("Shark",val);


        luck = 10;
        int luckVal = luck-- + luck--;
        assertTrue(luckVal == 19);
        assertTrue(luck == 8);
        
    }

    /*Method demonstrates the basics of post unary operator, notice the value of x in line 44 does not incriment immidiately. it only
            increments in line 45 while being assigned to z.*/
    @Test
    public void testPreUnary(){
        int x = 4;
        int y = x * 4 - x++;
        int z = x *5;
        assertTrue(12==y);
        assertTrue(z == 25);
    }

  /*  method demonstrates a possible infinite loop if the count clause
    would not be present inside the for loop. the variable i++ is incrementing
            but because it's a post unary, the value of i is still the previous
    value which is 0; hence the condition i<10 is never satisfied leaving with an
    infinity loop. Now if instead of using a post unary operator, we were using
    pre unary operator the value of i would incriment in the same line i.e 62,
    in this case the i< 10 would eventually be satisfied. */
    @Test
    public void testForInfinityLoopWithPostUnaryOperator(){
        int count = 0;
        for(int i = 0; i < 10;){
            System.out.print(i);
            i = i++;
            count++;
            if (count > 10)break;
        }
        assertTrue(count == 11);
    }


   /*method demonstrates how preunary and postunary
            operators are evaluated at runtime.
            as you see since the order of precedence
            of the preunary and post unary operators are the same
            they execute from left to right so plan++ is executed
            which changes the value of plan to 2 but during execution
    of --plan this increment of plan has not taken place because this the
    same statememtn, hence --plan results to 0; */
    @Test
    public void testPreUnaryPostUnaryIfElse(){
        int plan = 1;
        String value = "";
        plan = plan++ - --plan;
        switch(plan){
            case 0:
                value +="plan0";
                break;
            default  :
                value += "default";
        }
        assertEquals(value,"plan0");
    }
}

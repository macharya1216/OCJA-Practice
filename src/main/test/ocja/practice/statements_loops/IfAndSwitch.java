package ocja.practice.statements_loops;

import org.junit.Ignore;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IfAndSwitch {

   /*method demonstrates a simple if else control flow statement*/
    @Test
    public void testIfControlflowStatement(){
        int x = 7;
        int y ;
        if(x < 6) y = 2;
        else y = 3;
        assertTrue(y == 3);

        /*For ternary operator it is important to know what is the return type and if the
                return value is being assigned to a variable or just used as in a print statement
                */
        System.out.println(true?21:"none");
        // int val = true?21:"none"; // CODE Does not compile
    }


    @Test
    public void testIfElseAssignmentvsEuivalence(){

        boolean f = true;
        String val = "";

        if (f = false){
            val +="false";
        }else if(f){
            val +="true";
        }

        assertEquals(val,"");

        f = false;
       val = "";

        if (f = true){
            val +="true";
        }else if(f){
            val +="false";
        }

        assertEquals(val,"true");

    }

    @Test
    public void testNestedIfElseWithoutBrackets(){

        String out = "0";
        int x = 6, y = 6;

        if (x <=6)
            if(y > 0)
                if(x > y)
                    out +="1";
                else out +="2";
            else out +="3";
        else out += "4";

        assertEquals(out,"02");
    }

    /*method demonstrates that while using
    if else within a method that returns a
            value, if we return the value
            only in the if clause, then the method
    will compile , i.e comment out line 28 and the code will not compile*/

    public int returnInteger(int x){
        if(x > 0) return 0;
        else return 1;
    }

    public int hourOfDay(String day){
        if("".equals(day))
            return 0;
        else if("".equals(day))
            return 1;
        else return 2;
        // else return 1; // !! COMPILE ERROR , cannot use an else after an else statmeent
        // but you can use multiple else if, after an if or else if statement
      }




    /*Test demonstrates some basic fundamental concepts
          of a switch statements. The datatype
          supported by switch are
    byte and Byte
    short and Short
    char and Character
    int and Integer
    String
          Enums*/

    /*method shows the consequence of not adding a break
    statement after a case or default, here there default
    block get's executed as there is no match for the value
    thisMonth, but the default does not have a break so all
            the case statements below the default block get
            executed*/
      @Test
      public void switchDecisionMakingStructureTestMonth(){
          Month thisMonth = LocalDate.now().getMonth();
          String value ="";
          switch(thisMonth){
              case  APRIL :
                  value = "March";
                  break;
              default :
                  value +="NoIdea";
              case AUGUST:
                  value +="August";
              case DECEMBER:
                  value +="December";
          }
          assertEquals(value,"NoIdeaAugustDecember");

          value ="";
           switch(thisMonth){
              default :
                  value +="NoIdea";
              case  APRIL :
                  value = "March";
                  break;
              case AUGUST:
                  value +="August";
              case MARCH:
                  value +="March";

          }
          assertEquals(value,"March");

          switch(thisMonth){
                /*Empty switch statement is ok but break or continue just by itself is not allowed;*/
              // break;
              // continue;
          }


      }


     /*Method demonstrates how only final variables , literals
    are allowed for the case variable. Even final variables
    which are initiatized in the constructor or static or instance
            blocks are not allowed , the final variable MUST be
    initialized in the same line of creation for it to work with a
    case statement. */

     @Ignore
     @Test
    public void switchDecisionMakingStructureTestDay(){

        final String switchClassCandidate  = "TUESDAY";
        final String switchInstanceCandidate = "WEDNESDAY";

        DayOfWeek thisDay = LocalDate.now().getDayOfWeek();
        String value ="";
        switch(thisDay.toString()){
            case  switchInstanceCandidate:
                value = "Wednesday";
                break;
            case switchClassCandidate:
                value +="Tuesday";
            case "THURSDAY":
                value +="Thursday";
        }
        assertEquals(value,"Wednesday");

   }

    /*Method shows how you can use char , byte short interchangably for
    any case statement that requires an int. Notice in line 152,
    that you can even do addition in the case statement*/

    @Test
    public void testSwitchDecisionMakingStructureIntCharByteShortTest(){

        int thisDayInNums = 3;
        String value ="";
        switch(thisDayInNums){
            case  'X':
                value = "Doomsday";
                break;
            case (byte)1:
                value +="Sunday";
            case (byte)1 + (short)2:
                value +="CorrectDay";
        }
        assertEquals(value,"CorrectDay");

    }
    /*
    Method demonstrates how case statement does not allow
            duplicate cases , see how line 217 does not compile*/
    @Test
    public void testSwitchDoesNotAllowDuplicates(){
        final int x =0;
        final int y = 2;
        int i = x;
        switch(i) {
            case 1:
            default :
            case y :
            // case i+1: // COMPILE error i is not final
            // case x +1: // COMPILE error Switch does not allow duplicates , here x +1 is equivalent to case 1:
        }
    }


    /*This is a tricky if else statement because
            at first this looks like multiple if else if
    statement but if you look closely, the first and
    second if statements are disjoint . */
    @Test
    public void multipleIfElse(){

        int flair = 15;
        String val = "";
        if(flair >= 15 && flair < 37){
            val+="Not Enough";
        }if(flair == 37){
            val +="Just right";
        }else {
            val += "TooMany";
        }
        assertEquals(val,"Not EnoughTooMany");

    }








}

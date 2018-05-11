package ocja.practice.exceptions;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneralExceptionHandling {

    @Test
    public void testGeneralExceptionScenario1(){
        assertTrue(methodThrowsException() == 1);
    }
    public int methodThrowsException(){
        int returnVal = 0;
        List<String> arrList = null;
        String nullString = null;
        try{
            throw new MalformedURLException();
        }catch(MalformedURLException e){

        }finally{
            if(arrList != null){
                System.out.println("ok");
            }
        }
        returnVal = 1;
        return returnVal;
    }


    /*Method shows that even though you should not
            catch error as they are fatal failures
            of the application or environment,
    the try and catch block allows this*/
    @Test
    public void testOkToCatchError(){
        try{

        }catch(Error e){
            System.out.println(e);
        }
    }

/*
    Method demonstrates various try and catch rules :
    following rules can be deduced from the method below :
            1)	Try needs to always have braces.
            2)	A try expects catch or finally block
            3)	A try can have multiple catch block
            4)	1 try can only have 1 finally block
            5)	A finally block can have a try, catch, finally block
            6)	A catch block always must come after a try, not finally
            7)	 If a variable is already caught in the exception i.e Exception e, and you have a nested try and catch again, you cannot redeclare the same exception in the nested blocks catch parameter.
*/

    @Test
    public void testTryAndCatchGeneralRules(){
       try{


        }finally {
         try{

         }catch(Exception e )
         {

         }finally{
             try{

             }finally{

             }
         }
        }
    }

   /* Method demonstrates how catch block executes
            and the hierarchy of the caught exceptions*/
    @Test
    public void testCatchMultipleWithOrder()

    {
        try {

        }catch(Exception e ){

        }/*catch(RuntimeException e){

        }catch(StringIndexOutOfBoundsException e){

        }*/


       /* try{

        }catch(Exception | RuntimeException | StringIndexOutOfBoundsException ex){

         }*/



        try{

        }catch(StringIndexOutOfBoundsException  ex){

        }catch( RuntimeException ex){

        }catch(Exception e){

        }



    }

    @Test
    public void testCaughtExceptionsGetOverriden(){
        String val = "";
        try{
            val += "try";
            System.out.println("try");
            throw new StringIndexOutOfBoundsException();
        }catch(StringIndexOutOfBoundsException e){
            val += "catch1";
            System.out.println("catch1");
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            val += "catch2";
            System.out.println("catch2");
        }finally{
            val += "finally";
            System.out.println("finally");
            throw new StringIndexOutOfBoundsException();
        }
      }

      private int returnInt(int someVal)throws Exception{
        if(someVal > 0) return 1;
        throw new Exception();
      }

      private void intClient() throws Exception{
        returnInt(0);
      }

    /*If an enclosing block is surrounded by a try and catch and the caught exception is a checked exception, then the block must throw a checked exception.*/

    public void checkedExceptionConstraint(){
        try{
            //throw new IOException();
            throw new Exception();
        }catch(IOException e){
        }catch(Exception e){
        }
      }

      public void testThrowable()  {
        try{

        }catch(Throwable t){

        }
      }
      /*Method demonstrates that you can return from inside a try block and
            the method compiles without any issue*/
      public int testReturnInsideTryAndCatch() {
        try {
            return 0 / 0;
        }catch(Exception e){
            throw new RuntimeException("Invalid division");
        }finally{
            System.out.println("You got that right");
        }
      }

      @Test
        public void testTryCatchFinallyExceptionOutput() {
          try {
              testReturnInsideTryAndCatch();
          }catch(Exception e){
              System.out.println('A');
              throw e;
          }
      }





}

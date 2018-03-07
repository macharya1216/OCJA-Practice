package exception;

import java.io.IOException;
import java.sql.SQLException;

class MyParentException extends Exception{}
class MyChildException extends MyParentException{}
public class MultipleCatch {

    public static void main(String[] args) throws IOException,SQLException,MyParentException{
     try{
       throwException();
        }
        catch (MyParentException|IOException| SQLException | RuntimeException ex) {
         System.out.println("In catch block");
         System.out.println(ex);
        throw ex;
    }
    }

    private static void throwException() throws IOException,SQLException,MyParentException,MyChildException{

        throw new RuntimeException();
    }
}

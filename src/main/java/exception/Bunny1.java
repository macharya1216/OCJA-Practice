package exception;

import java.sql.SQLException;

class NoMoreCarrotsException1 extends Exception{}

public class Bunny1 {
    public void bad() throws Exception{
        try{
            good();
        }catch(Exception e){
            throw e;
        }
    }

    public void good() throws NoMoreCarrotsException1{

    }
}

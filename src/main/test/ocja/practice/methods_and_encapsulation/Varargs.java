package ocja.practice.methods_and_encapsulation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Varargs {

   // int... var; !! NOT VALID
   @Test
   public void testVarArg(){

       assertEquals("varargs",varArgAcceptor("varargs","else"));
       assertEquals("varargs",varArgAcceptor());
       assertEquals("string",varArgAcceptor(""));
   }
    public String varArgAcceptor(String... str){
    return "varargs";
   }
     public String varArgAcceptor(String str){
        return "string";
    }
}

package ocja.practice.methods_and_encapsulation.Overloading;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
This example tests for method overloading with Integer

1) Overload method accepts wrapper Integer and we pass primitive integer
    - Wrapper Integer method is used. But if there is a overload method
    - that accepts primitive int, float,long or double then that is used

*/
public class IntegerFloatOverloading {



   public String overload(Integer wrapperInteger){
        return "wrapperInteger";
    }


     public String overload(float primitiveFloat){
        return "primitiveFloat";
    }

    @Test
    public void testIntegerOverloading(){
        assertEquals(new IntegerFloatOverloading().overload(1),"primitiveFloat");
    }




}

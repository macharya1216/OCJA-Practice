package ocja.practice.methods_and_encapsulation.Overloading;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneralOverloading {

    // PRIMITIVES



    public String overload(byte primitevebyte){
        return("primitevebyte");
    }

    public String overload(short primiteveshort){
        return("primiteveshort");
    }

    public String overload(int primitiveInt){
        return("primitiveInt");
    }
    public String overload(long primitevelong){
        return("primitevelong");
    }
    public String overload(float primitevefloat){
        return("primitevefloat");
    }

    public String overload(double primitevedouble){
        return("primitevedouble");
    }

    // PRIMITIVES

    public String overload(Character wrapperChar){
        return ("wrapperChar");
    }

    public String overload(Byte wrapperByte){
        return("wrapperByte");
    }

    public String overload(Short wrapperShort){
        return("wrapperShort");
    }

    public String overload(Integer wrapperInt){
        return("wrapperInt");
    }
    public String overload(Long wrapperlong){
        return("wrapperlong");
    }
    public String overload(Float wrapperfloat){
        return("wrapperfloat");
    }

    public String overload(Double wrapperDouble){
        return("wrapperDouble");
    }


    @Test
    public void testCharacterByteShortAndInt(){

        /* Test of Character */

        assertEquals(overload('X'),"primiteveChar");

       /* if the overloaded method for primitveChar is commented out, then
                Passing 'X' to the overload() will call the method with primitiveInt*/

        //assertEquals(overload('X'),"primitiveInt");

       /* if the overloaded method for primitveChar and primitiveInt is commented out, then
                Passing 'X' to the overload() will call the method with primitevelong*/

       // assertEquals(overload('X'),"primitiveInt"); // if line 11 - 13 and 69 are commented out
    }

}

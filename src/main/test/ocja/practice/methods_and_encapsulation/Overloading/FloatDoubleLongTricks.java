package ocja.practice.methods_and_encapsulation.Overloading;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*Example contains some trickier tests to test both
method overloading and whether if you understand
how to identify a float vs long and a integer vs double */
public class FloatDoubleLongTricks {

    public String overload(Object object){
        return "object";
    }
/*    public String overload(float primitiveFloat){
        return "primitiveFloat";
    }*/

    public String overload(double primitiveDouble){
        return "primitiveDouble";
    }
    public String overload(Float wrapperFloat){
        return "wrapperFloat";
    }

    @Test
    public void testTrueFloatIdetnfierTricks(){

        /*notice you cannot say Float.valueOf(9.0) . this will cause compile error . You always need a f at
                the end of a float. If you dont specify an f, then that literal becomes a Double.
                if you look at line 30, you want to think that the overloaded method of the float gets called
                but in reality the overloaded method which takes the Object gets called because 9.0 is a
                double and not a float.

          When you create a wrapper float and you pass that to the overloaded methods above, the method that
          takes the wrapper Float gets called, however if this method was commented out, then the overloaded method
          that takes the Object would be called.

           */

        assertEquals(new FloatDoubleLongTricks().overload(9.0),"primitiveDouble"); // BECAUSE 9.0 is not a Float
        assertEquals(new FloatDoubleLongTricks().overload(9.0f),"primitiveDouble"); // BECAUSE 9.0f is a Float
        assertEquals(new FloatDoubleLongTricks().overload(Float.valueOf("9.0")),"wrapperFloat"); // BECAUSE 9.0f is a Float




    }

}

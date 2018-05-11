package ocja.practice.operators_datatypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefaultValues {

    boolean bool; // true or false
    byte bite; // 8 bit integral value
    short sort; // 16 bit integral value
    char car ; // 16 bit Unicode value
    int inty; // 32 bit integral value
    float froat; // 32 bit floating point value // 123.f;
    long lawng; // 64 bit integral value // 123L or 123;
    double dobble; //64 bit floating point value;


    @Test
    public void testPrimitiveDefaultValues(){
        assertTrue(bool == false);
        assertTrue(bite == 0);
        assertTrue(sort == 0);
        assertEquals(car,  '\u0000');
        assertTrue(car==0);
        assertTrue(inty == 0);
        assertTrue(froat == 0.0);
        assertTrue(lawng == 0.0);
        assertTrue(dobble == 0);

        short hex = 0X444;
        System.out.println(hex);
        Double d1 = 0.0/0.0;
        System.out.println(d1);

     }


}

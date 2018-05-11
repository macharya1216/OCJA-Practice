package ocja.practice.primitives_wrappers;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PrimitivesWrappersBasic {

    @Test
    public void testWrapperPrimitiveBasic() {

        /* Unlike other Wrapper constructors, char does not have
                a constructor that takes String*/
        //   Character carr =new Character("String"); !! COMPILE ERROR

        boolean numberFormatExceptionCaughtInd = false;
        try {
            Double d = new Double("blablalb");
        }catch(NumberFormatException e){
            numberFormatExceptionCaughtInd = true;
            }
            assertTrue(numberFormatExceptionCaughtInd);



    }

}

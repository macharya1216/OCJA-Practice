package ocja.practice.StringsAndStringBuilders;

import java.util.Arrays.*;

import java.util.List;
import java.time.*;

/*This class demonstrates some of the basic concepts of imports in a
static and non static class*/
public class ImportsBasic {

    public void testBasicImports(){

        /*Notice there is no import for StringBasics,
          that is because the classes ImportsPasic
          and StringBasic are in the same package*/
        StringBasics basics = new StringBasics();


        /*Notice how there is no import for String class,
        that is because String belongs to java.lang,
                and this package is imported by default*/
        String str = new String();

        /*
       Here the class ImportsBasic has an asList() method
                and we are also importing Arrays.asList
                but the compiler takes the class version of
                as list instead of the Arrays.asList*/

        //List<String> strList = Arrays.asList("T");


    }

   /* public static <T> List<T> asList(T... a){
        return null;
    }*/


}

package ocja.practice.lambdas;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicLambdaIntegerTest {
   static int x = 0;
    @Test
    public void testBasicIntegerPredicate(){
        // valid declarations of a lambda


        for(int x = 0;x < 10;x++);
        System.out.println(x);
        assertFalse(test(integer -> integer ==5));

        assertTrue(test((i) ->i ==7));

        assertFalse(test((i) -> {return i == 5;}));
        Integer a = 0;
        // invalid declarations

       // assertTrue(test((int i) -> {return i == 5;}));  //  Autoboxing only works for collections not inferring predicates so the (int i) does not work here

        assertTrue(testGood(( c, b) -> {
            return true;}));

    }

    private static boolean test(Predicate<Integer> p){
        return p.test(7);
    }
    private static boolean testGood(AllGood good){
        return good.good(7,"");
    }
    interface AllGood {
        boolean good(Integer a, String b);
    }
}

package ocja.practice.lambdas;

import java.util.function.Predicate;

public class PredicateBasic {

    public void testPredicateBasicBehaviour(){
        Predicate<StringBuilder> p  = b -> true;
         Predicate<String> str = (s2) -> s2.isEmpty();

    }
}

package lamdas;

import java.util.function.Predicate;

public class Clear {
    public static void main(String[] args){
        Predicate<String> dash = c -> true;
        System.out.println(dash.test("clear"));
    }

}

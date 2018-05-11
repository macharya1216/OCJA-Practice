package ocja.practice;

import org.junit.Test;

public class StaticInstanceLocalVariables {

    /*Notice how you can reuse variables , same x is reused
    as a static and local variable.*/
    static int x = 10;
    @Test
    public void testDuplicateVariables(){
        int x = 11;
        System.out.println(x);
    }
}



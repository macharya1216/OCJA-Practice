package ocja.practice.lambdas;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

interface Climb{
    boolean isTooHigh(int height,int limit);
}
public class Climber {

    @Test
    public void testClimbPredicate(){
        assertEquals(check(5,(h,l) -> h >l),"ok");
    }
    private static String check(int height ,Climb climb){
        if(climb.isTooHigh(height,10))
            return "too high";
        else return "ok";
    }
}

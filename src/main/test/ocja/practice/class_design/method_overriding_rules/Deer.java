package ocja.practice.class_design.method_overriding_rules;

/*
Example demostrants private method hiding. There are two
classes Deer and Reindeer and deer has a hidden method ,
which is being accessed from the Deer class using a Deer
reference even though a new object of ReinDeer is being used.
Since the deer reference is being used from within the Deer class,
the hidden method of the Deer class is being used.
*/

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class Deer {

    Deer(){
    }
    Deer (int age){

    }

    private boolean hasHorns(){
        return false;
    }
    @Test
    public void testReindeerHasHorns(){
        assertTrue(new Reinddeer().hasHorns());
        Deer deer = new Reinddeer();
        assertFalse(deer.hasHorns());
    }

}

class Reinddeer extends Deer{
    public boolean hasHorns(){
        return true;
    }

    @Test
    public void testReindeerHasHorns(){
        assertTrue(new Reinddeer().hasHorns());
    }
}

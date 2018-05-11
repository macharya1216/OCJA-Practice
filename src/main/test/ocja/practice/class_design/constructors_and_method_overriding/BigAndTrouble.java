package ocja.practice.class_design.constructors_and_method_overriding;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
This class demonstrates the fundamentals of constructor chaining,
static and non static method overriding and how variables are
used between the parent and the child class. The Big class is
the parent class while the Trouble class is the child class which
extends the Big Class.
*/

class Big{

    boolean finalVerdict ;
    static boolean  classFinalVerdict;

    public Big(boolean stillIn){
        finalVerdict = stillIn;
        classFinalVerdict = stillIn;
    }

    boolean getFinalVerdict(){
        return finalVerdict;
    }

    static boolean getFinalClassVerdict(){
        return classFinalVerdict;
    }


}
//If the parent does not have a no-arg constructor, the compiler requires an explicit call to a parent constructor

    /* class Trouble extends Big{ // Throws compile error because Big class does not have a no-arg constructor
     }*/

class Trouble extends Big{
    // public Trouble(){}  // compile error , because the first call in the constructor must be to the parent Big, argument constructor

    boolean finalVerdict ;

    public Trouble(int deep){
        super(false);
        finalVerdict= true;
        // this();   // compile error, this() can only be the first call in the constructor
    }

        /*Notice that this constructor is valid, because even thout it does not explicitly call the Big class argument constructor,
        the constructor is internally calling the constructor on line 18 which is in turn calling the super constructor. */

    public Trouble(String now,int ...deep){
        this(3);
    }

      /*This constructor would throw a compile error because it is passing long in line 32 but actually what's required is an int*/

      /* public Trouble(long deep){
            this("check",deep);
        }*/

    final boolean getFinalVerdict(){
        return true;
    }

    static final boolean getFinalClassVerdict(){
        return true;
    }

}

public class BigAndTrouble {

    /*
    Method tests the basic of method overriding,
    NOtice even though the getFinalVerdict in parent returns false,
    the result in the Child method is true because at runtime
    the getFinalVerdict of the Child method is used even if the
    reference is of the parent class i.e Big */

    @Test
    public void testMethodOverridingBasic(){

        Trouble trouble = new Trouble("");
        assertTrue(trouble.getFinalVerdict());
        assertTrue(trouble.finalVerdict);

        assertTrue(trouble.getFinalClassVerdict());


        /*If you're referencing the variable from within the parent class, the variable defined in the parent class will be used*/
        Big biggie = new Trouble("");
        assertFalse(biggie.finalVerdict);

        /*Here, getFinalVerdict() method is overriden and is a non static override so even though Parent getFinalVerdict method returns false, the child method returns true*/
        assertTrue(biggie.getFinalVerdict());

        assertFalse(biggie.getFinalClassVerdict());


    }
}

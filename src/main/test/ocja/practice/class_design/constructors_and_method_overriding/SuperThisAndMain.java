package ocja.practice.class_design.constructors_and_method_overriding;

/*Private and protected classes are only allowed for inner classes*/

//private class MyPrivateClass{} // Throws compile error
//protected class MyProtectedClass{} // Throws compile error

/*You can have a java file without any public class*/

import org.junit.Test;

import static org.junit.Assert.*;

class BasicClassPrinciples {

    static String token;

    BasicClassPrinciples() {
        token ="super";
    }
}


public class SuperThisAndMain extends BasicClassPrinciples{

    /*The first statement within the constructor is a call to this() or a call to super()*/
    /*
    public SubBasicClassPrinciples() {
    System.out.println("Inside SubBasicClassPrinciples");
    super(); // throws compile error
    this();   // Throws Compile error
    }*/
   public SuperThisAndMain() {
        token +="this";
    }
    private String returnID(){
        return token +="main";
    }

   /*This method tests how super gets called and then this and then the method */

   @Test
    public void justTest(){
        SuperThisAndMain scp = new SuperThisAndMain();
        assertEquals(scp.returnID(),"superthismain");
    }

}

package ocja.practice.class_design.inteface;


import java.io.IOException;

/*In general younever use private , protected and final on a method of the interface*/
interface BasicRules{



         // private OR PROTECTED static final String MY_STRING = ""; ! COMPILE ERROR , no private or PROTECTED variable declaration

         // private void getRules(); ! COMPILE ERROR , no private methods allowed

        //protected void getRules(); ! COMPILE ERROR , no protected methods allowed

        // final void getRules(); ! COMPILE ERROR , no final methods allowed

        String variable ="myVariable";

        abstract void getRules(); // default is OK

        default void getDefaultRules(){ } // Default is OK , but default with private , protected and final throws compile error

        //abstract OR static default void getDefaultRules(){} // ! COMPILE error, cannot mark a default method as static , private, final or abstract

        //default void getDefaultRules1(); // !COMPILE ERROR, a default method needs to have a body i.e open and end curly braces

        static void getStaticDefaultRules(){
           // variable = "anotherVariable"; ! Does not compile because all variables of an interface are public static and final and reassignment of final variable after initialization cannot happen
        }
}
public class BasicInterfaceImplRules implements BasicRules{

    /* void getRules(){} // Does not compile with the error "attempting to assign a weaker access privilege
     the getRules() method in the BasicRules interface is public by default hence it would require the implemented method to have public modifier only.*/
    public void getRules() {
        System.out.println(BasicInterfaceImplRules.variable); // You can refer to the BasicRule variable using the Implemented Class directly.

    }

}

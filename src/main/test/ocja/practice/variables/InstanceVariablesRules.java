package ocja.practice.variables;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/*The class will try to demonstrate the following rules
* 	Instance variables have a default value associated to them even without declaration, i.e they do not have to be initialized.
	In terms of access to the instance variable from an instance block: The instance block cannot pass the instance variables in a method if the instance variables are declared after the instance block.
 The instance block can assign the instance variable some value, but cannot pass them to a method or use their reference.
	The constructor and non-static methods can access the instance variables even if the variables are defined after the constructor and methods.
	Instance variables cannot be accessed by static block or methods
	A final instance variable can be instantiated in one of three places
•	At the point of declaration like: final int val = 0;
•	In the instance block
•	In the constructor BUT if the final variable is already instantiated in the instance block, the compiler throws an error
•	If the class has multiple constructors, the final variable needs to be instantiated in each of the constructor or else the compiler throws an error
*/
public class InstanceVariablesRules {

    //The constructor and non-static methods can access the instance variables even if the variables are defined after the constructor and methods.
    // CONSTRUCTOR

    InstanceVariablesRules() {
        System.out.println(x);

        // initialization of final variable would work in constructor ONLY if it is NOT initialized already in the instance block
        y = 0;
    }

    // If the class has multiple constructors, the final variable needs to be instantiated in each of the constructor or else the compiler throws an error

    InstanceVariablesRules(String str) {
        // Without the initialization of the final instance variable in this second constructor, the declaration would throw a compile error saying the variable might not have been initialized
        y = 10;
    }


    // NON STATIC METHOD
    private void method() {
        System.out.println(x);

        // You can redeclare variables inside a try, catch, finally , if else or any other loops or iteration control blocks
        try{
            int x = 9;
        }catch(Exception e){
            int x = 10;
        }finally {
            int x = 3;
        }
        int x = 0;
    }

    // INSTANCE BLOCK
    {

        // System.out.println(x);  The instance block cannot pass the instance variables in a method if the instance variables are declared after the instance block
        //The instance block can assign the instance variable some value, but cannot pass them to a method or use their reference
        x = 5;





    }

    //Instance variables have a default value associated to them even without declaration, i.e they do not have to be initialized.
    private int x;


    /*A final instance variable can be instantiated in one of three places
•	At the point of declaration like: final int val = 0;
•	In the instance block
•	In the constructor BUT if the final variable is already instantiated in the instance block, the compiler throws an error*/

    private final int y;

    // INSTANCE BLOCK
    {
        //Since the instance block comes after the declaration of the instance variable, it's ok to pass it to a method or use its reference
        System.out.println(x);
        //The instance block can assign the instance variable some value, but cannot pass them to a method or use their reference
        x = 5;

        if(x == 5){
             int y = 0;
        }
    }

    // STATIC BLOCK
    static {
        //Instance variables cannot be accessed by static block or methods
        // System.out.println(x);
    }

    @Test
    public void testInstanceVariableRules() {
        assertTrue(x == 0);
    }
}

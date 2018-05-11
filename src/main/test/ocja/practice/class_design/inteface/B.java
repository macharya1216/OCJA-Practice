package ocja.practice.class_design.inteface;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*Example shows the fundamentals of variables in interface
interface variables are public, static and final by default.
Here you can see how class B implements A and has acces to the
variable s and staticS by default. Also the variable s
and staticS can be accessed statically i.e using class name
or just like any other reference variable in the class*/

interface A {
    String s = "myVariable";
    static String staticS = "myStaticVariable";
}
public class B implements A{

    @Test
    public void testInterfaceClassVariableSharing(){
        assertEquals(s,"myVariable");
        assertEquals(staticS,"myStaticVariable");
        assertEquals(A.s,"myVariable");
    }

}

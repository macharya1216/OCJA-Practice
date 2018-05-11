package ocja.practice.class_design.method_overriding_rules;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

class A {

    static String method() {
        return ("AB");
    }
}
class B extends A {
     static String method() {
        return ("CD");
    }
}

public class WhizlabE1Q42MethodOverriding{
   @Test
   public  void testStaticMethodOverriding(){
        A a = new B();
        assertEquals("AB",a.method());

    }
}


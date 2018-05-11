package ocja.practice.variables;

import java.util.Arrays;

public class StaticAndLocalVariableRules {

    // static final variable can't be initialized in the constructor
  //


    {
        // 	Constructors, instance methods and static methods can however access static variables even if they are declared afterwards
        System.out.println(x);
        int x = 1;

        // 	If the static block where the final variable is initialized comes after the instance block, the instance block cannot use this static final variable.

        // System.out.println(y);
    }


    StaticAndLocalVariableRules(){
       // y = 0;
    }


    static int x ;

    static {

        y = 1;
       /* Order of initialization matters for static instance blocks and static variables, i.e you can’t reference a static variable or
        pass it to a method if the static variable appears after the static block*/

        // System.out.println(x);
        // but you can assign it a variable
        x = 1;
        int x = 1;
    }

    static final int y ;

    private static void method(int param){

       // Local variables cannot share the same name if there is a parameter with that same name in the method that the local variable is being used
      //   int param;

        int param1 ;
        // 	Local variables must be initialized before they get used.
        //System.out.println(param1);



        // 	Order of the variables matter, you can’t pass the variables to a method or reference them before initializing them.
        // while(z < 10){  }
        int z = 0;
        while (z < 10){

        }
    }

}

package ocja.practice.StringsAndStringBuilders;


/*This class demonstrates the basic concept of
the different types of reference variables*/

public class VariablesBasic {


    ////////************************************************** INSTANCE VARIABLES***************************************************/////////////////////////

  /*  Code below shows how order of initialization matters for instance variables
            variables a and b are initialized at the end of this code. Hence
            in the initialization block, we are not allowed to pass a or b
            in a method.

            Note that assigning a or b to a value is ok or using the Constructor
            to pass a or b in a method is OK. */

    // OK for the constructor to access instance variables which are initialized afterwards

    VariablesBasic (){
       // staticFinalVariable = 0; !! COMPILER ERROR , You cant instantiate a static variable in the constructor
        nonStaticfinalVariable =0;
        int a,b;   // These are like local variables, you can initialize a and b again even if you have initialized them as instance variables

        System.out.println(this.a);
        this.a = 1;
        A(this.b);

        a = staticFinalVariable ; // OK to assign a to the value of the staticFinalVariable
    }
    private void B(int val){ }

    // OK for local methods to access instance variables which are initialized afterwards

    private void A(int val){
        System.out.println(b);
        B(a);

    }


     {
        // a = staticFinalVariable ; Compiler error , because the staticFinalVariable is only initialized after the instance block
         //  nonStaticfinalVariable = 0; // If a final non static variable has not been initialized during declaration, you can use the instance initializer to instantiate it
        a = 1;
        b = 2;
        //    System.out.println(a); !! COMPILE ERROR , illegal forward reference
        // A(a); !! COMPILE ERROR , illegal forward reference
    }

    int a,b;

    ////////************************************************** INSTANCE VARIABLES***************************************************/////////////////////////


    ////////************************************************** STATIC VARIABLES***************************************************/////////////////////////


    /*Similiar to instance variables, the order of initialization of static variables matters as well; */

    VariablesBasic (int a){
       // If you comment out this line , then the declaration of this final variable will throw a compile error
        // staticFinalVariable = 0; !! COMPILER ERROR , You cant instantiate a static variable in the constructor
        nonStaticfinalVariable =0;
        System.out.println(c);
        this.c = 1;
        A(d);
    }
    private static void C(int val){
        System.out.println(c);
    }
    static {

        staticFinalVariable = 0;
        int a,b; // Notice you can redeclare the instance variables again in the static block;
        c = 1;
        d = 1;
         //C(c); !!COMPILE ERROR , illegal forward reference
    }

    static int c,d;

    ////////************************************************** LOCAL VARIABLES***************************************************/////////////////////////


    private static void localMethod(final int val){

        // a = 1; // YOu cant even access the local variables before they are initialized in a local method
        // public a = 1; // You cant use any access modifiers or static and

        /* a =1;
        System.out.println(a);*/
        final int e ; // But you can use a final keyword
        e = 1;

        int a,b,c,d;  // Notice you can redeclare the static and instance variablees again as local variables
       a = staticFinalVariable;

    }

    /*  a final variable can be initialized in a constructor, but if a class has multiple constructor, the variable needs to be initialized in all of constructors.
  If a final variable is already initialized in an instance block, it cannot be initialized in the constructor; */
    final int nonStaticfinalVariable ;

    // For a static final variable, you can only initialize it where you declare it or in a static initializer block.
    static final int staticFinalVariable ;



    ////////************************************************** LOCAL VARIABLES***************************************************/////////////////////////

}

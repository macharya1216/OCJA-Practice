package ocja.practice.operators_datatypes;

public class WhizlabQ {

    private double d = 1234.5d; // You can have a D or d for double

    private float f = 123F; // You can have F or F for double

   //   private float f1 = 1.2; // COMPILE ERROR , if you have a decimal and you declare it as float you need the "f" in the end


    // private float f1 = 1234_F; You cannot have the Underscore before the Number

    // Some more examples of non compliant code
    // private double d = 123.4_D;
    // private long l = 123_L;



    public void testDuplicateVariable(){
        double d ;                          // NOTICE YOU CAN HAVE DUPLICATE names for method and class members "d" is defined in both method and class

        short s = 1;
        // s = s +1 ; // !! Compile error because anytime you add a short to an integer or any other primitive, it will promote that value to integer


    }


}

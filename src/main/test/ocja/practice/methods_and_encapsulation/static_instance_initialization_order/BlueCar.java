package ocja.practice.methods_and_encapsulation.static_instance_initialization_order;


/*This example shows simple static
and instance block and constructor
initialization.

The output of the following block is : 14325 ,
But if you remove the static from line 26
Then the output is 13245 . */

abstract class Car{
    static {
        System.out.print("1");
    }
    public Car (String name){
        super();
        System.out.print("2");
    }
    {
        System.out.print("3");
    }
}
public class BlueCar extends Car {

    static{
        System.out.print("4");
    }
    public BlueCar(){
        super("blue");
        System.out.print("5");

    }

    public static void main(String[] gears){
        new BlueCar();
    }

}

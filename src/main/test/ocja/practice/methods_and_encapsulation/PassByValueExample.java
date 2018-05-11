package ocja.practice.methods_and_encapsulation;

import org.junit.Test;


/*
Method demonstrates how pass by reference works
in java, even though the method parameters are copied
when a method is called, the reference to the object
is what get's manipulated.
*/

import static org.junit.Assert.assertEquals;

public class PassByValueExample {

    private int size;
    public PassByValueExample(int size){
        this.size = size;
    }

    public static void sendHome(PassByValueExample p , int newSize){
        p = new PassByValueExample(newSize);
        p.size = 4;
    }

    public static void sendHome1(PassByValueExample p , int newSize){
        p.size = 4;
    }


    public static void main(String... args){
        final PassByValueExample p = new PassByValueExample(3);
       /*The send home method creates a new PassByValueExample object
                and modifies that object, hence the p passed in the
                method sendHome does not get modified*/
        sendHome(p,7);
        assertEquals(p.size,3);

        final PassByValueExample p1 = new PassByValueExample(3);
        /*In sendHome1 the p1 passed in the method get's modified*/
        sendHome1(p1,7);
        assertEquals(p1.size,4);
    }
}

package staticpractice;

import java.util.Arrays;

import static java.util.Arrays.*;

import static java.util.Arrays.asList;

public class Rope {

    private int ropeLength = 0;
    Rope(int ropeLength){
        this.ropeLength = ropeLength;
    }




    public static void swing(){

        System.out.println("swing");
    }

    public void climb(){
        System.out.println("climb");
    }

    public static void play(){
        swing();
    }

    public static void main(String[] args){
        Arrays.asList("one");
        Rope rope = new Rope(1);
        rope.play();
        Rope rope2 = null;
        rope2.play();
    }
}

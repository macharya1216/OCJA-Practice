package ocja.practice;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Basics {
     Date date;
    int i=9,j,k,l,m;
     int n = 0,o = 1,p = 8;
     int q ; int r;

     // int s , int t; !! COMPILE ERROR
    String color = "red";

    static {
        int i =11;
    }
    @Test
    public void testBasicLocalVariables(){
        int i=10,j,k,l,m;
        Basics basics = new Basics();
        assertTrue(basics.i == 9);
        assertTrue(i == 10);


    }

    @Test
    public void testBasicColor(){
        assertEquals(new Basics().printColor("blue"),"purple");
    }
    private String printColor(String color){
        color = "purple";
        return color;
    }
}

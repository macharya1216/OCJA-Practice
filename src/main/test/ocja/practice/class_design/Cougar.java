package ocja.practice.class_design;
/*
This class tests the basic of interface implementation,
abstract class implementation and concrete class instantiation*/
interface HasTail {int getTailLength();}
abstract class Puma implements HasTail{

    /*protected int getTailLength(){
        return 4;
    }*/
}
public class Cougar extends Puma {

    public int getTailLength(){return 0;}
    /*public static void main(String[] args){
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length){
        return 2;
    }*/
}

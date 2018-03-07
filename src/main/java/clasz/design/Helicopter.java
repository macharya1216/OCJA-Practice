package clasz.design;

abstract class Rotorcraft{
    protected final int height = 5;
    abstract int fly();
}
public class Helicopter extends Rotorcraft{

    private int height = 10;
    protected int fly(){
        return super.height;
    }

    public static void main(String[] args){

        Helicopter h = new Helicopter();
        System.out.println(h.fly());
    }
}

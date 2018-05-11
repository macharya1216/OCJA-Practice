package ocja.practice.class_design;

abstract class BallModified{
    protected  final int size = 5;

    protected int getSum(){
        return this.size;
    }

    /*public BallModified(int size){
        this.size = 5;
    }*/
}

interface EquipmentModified{}

public class SoccerBallModified extends BallModified implements EquipmentModified {
    protected  final int size = 100;

    protected int getSum(){
        return this.size;
    }
   /* public SoccerBallModified(){
        super(5);
    }*/
    public BallModified get(){
        return this;
    }
    public static void main(String[] pass){
        EquipmentModified equip = (EquipmentModified)new SoccerBallModified().get();
        System.out.println(((BallModified)equip).getSum());
    }



}

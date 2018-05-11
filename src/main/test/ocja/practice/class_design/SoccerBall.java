package ocja.practice.class_design;

abstract class Ball{
    protected final int size;
    public Ball(int size){
        this.size = 5;
    }
}

interface Equipment{}
public class SoccerBall extends Ball implements Equipment {

    public SoccerBall(){
        super(5);
    }
    public Ball get(){
        return this;
    }
    public static void main(String[] pass){
        Equipment equip = (Equipment)new SoccerBall().get();
        System.out.println(((SoccerBall)equip).size);
    }



}

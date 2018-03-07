package clasz.design;

public class Bear {

    public  void eat(){
        System.out.println("Bear is eating");
    }
}
class Panda extends Bear{
    public  void eat(){
        System.out.println("panda bear is chewing");
    }

    public static void main(String[] args){
        Panda p = new Panda();
        p.eat();
        p.eat();
        Bear bear = new Panda();
        bear.eat();
        //super.eat();
    }
}

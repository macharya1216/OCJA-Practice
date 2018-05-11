package ocja.practice.class_design.ConstructorChains;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/*
This class explains the fundamental of constructor initialization,
1) When a class extends another class, upon intitialization of the
child class, the very first thing that happens is a call to the
constructor of the Super class.
2) Private methods in Super class are not overriden for example
line 30 here prints false because even though Reindeer hasHorns() would
return true, the hasHorns() method is actually not overloaded from the
Super class because that method is a private method.
*/


public class Deer {
    public Deer(){System.out.print("Deer");}
    public Deer(int age){
        System.out.println("DeerAge");
    }

    public boolean hasHorns(){
        return false;
    }


    public static void main(String[] arg){
        Deer deer = new Reindeer(5);
        System.out.print(","+deer.hasHorns());
    }
}

class Reindeer extends Deer {

    public Reindeer(int age){
        System.out.print("Reindeer");
    }
    public boolean hasHorns(){
        return true;
    }






}


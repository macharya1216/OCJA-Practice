package ocja.practice.class_design.method_overriding_rules;


/*Line 33 is a trick question because the
method fly() is actually in the Bird class
and even though a new Bird() is instantiated,
the reference that is being used is Animal,
so the fly() method needs to be in the Animal
class if it needs to be accessed using b.fly(); */
class Bird extends Animal {

    public void print() {
        System.out.print("Bird");

    }
    void fly() {
        System.out.print("Bird flies");
    }
}

class Animal {
      public void print() {
        System.out.print("Animal");
    }
}

public class WhizLabsQ1{

    public static void main(String[] args){

        Animal b = new Bird();
        b.print();
        // b.fly(); // !! DOES NOT COMPILE
    }

}
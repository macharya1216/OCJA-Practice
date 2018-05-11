package ocja.practice.class_design.inteface;

/**
 * This example shows that when two interface have the same
 * default method with same return type and the abstract class
 * implements this method either using a abstract method or
 * a concrete method, then there is no compile error
 */

public interface Animal {
    String name = "HENRY";
     default String getName() {
         boolean b= false ^ true;
         return null;
    }
    static String getStaticName(){
         return null;
    }

    ;
}

interface Mammal {
    public default String getName() {
        return null;
    }
}

abstract class Otter implements Mammal, Animal {
    public abstract String getName();

}

abstract class Otter1 implements Mammal, Animal {
    public abstract String getName();
}

class OtterImpl extends Otter {
    public String getName() {
        return null;
    }

    public static void main(String[] args) {
        Animal.getStaticName();
    }
}
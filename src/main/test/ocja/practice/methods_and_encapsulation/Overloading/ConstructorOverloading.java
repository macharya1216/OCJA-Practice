package ocja.practice.methods_and_encapsulation.Overloading;

public class ConstructorOverloading {

    Character c;

    ConstructorOverloading(Character c){
        this.c = 'X';
    }
    ConstructorOverloading(double c){
        this.c = 'x';
    }

    @Override
    public String toString() {
        return "ConstructorOverloading{" +
                "c=" + c +
                '}';
    }

    public static void main(String[] str){
        System.out.println(new ConstructorOverloading('X').c);
    }

}

package clasz.design;

public class Animal {

    private int age;
    private String name;

    public Animal(int age,String name){
        this.age = age;
        this.name = name;

    }
    public Animal(int age){
        this.age = age;
        this.name = name;
    }



}

class Gorilla extends Animal{

    public Gorilla(int age){
        super(age,"Gorilla");

    }
    public Gorilla(){
        super(5);
    }
}

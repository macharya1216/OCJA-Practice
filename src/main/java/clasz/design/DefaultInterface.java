package clasz.design;


public interface DefaultInterface {
void someMethod();
default void someDefaultMethod(){
    System.out.println("Doing something in Default  Interface");
}
}
class InterfaceImplementer implements DefaultInterface{
    public void someMethod(){

    }
    public void someDefaultMethod(){
        System.out.println("Doing something in InterfaceImplementer");
    }
    public static void main(String[] args){
        InterfaceImplementer implementer = new InterfaceImplementer();
        implementer.someDefaultMethod();
    }
}

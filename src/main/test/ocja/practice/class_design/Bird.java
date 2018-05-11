package ocja.practice.class_design;

/*This example demonstrates two things
1) Access modifier default access : Notice in
line 11, Bird class has access to Pelican,
that's because Pelican is in the same package
as Bird and Pelican has default access. Also
The output is "Pelican is flying" because
the fly() method in Bird is private and thus
hidden*/
public abstract class Bird {
    private void fly(){
        System.out.println("Bird is flying");
    }
    public static void main(String[] args){
        Pelican bird = new Pelican();
        bird.fly();
    }
}
 class Pelican extends Bird{
    protected void fly(){
        System.out.println("Pelican is flying");
    }
}
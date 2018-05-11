package ocja.practice.access_modifiers.fambam.family;

public class Child extends Father{

    public static void main(String[] str){

        /*Here the method getWealthStatus() can be accessed
                using a father reference because getWealthStatus()
                has a default access and Child and Father are in the
                same package*/

        Father father = new Child();
        father.getWealthStatus();
        //father.name;
        //father.getProfession();
    }
}

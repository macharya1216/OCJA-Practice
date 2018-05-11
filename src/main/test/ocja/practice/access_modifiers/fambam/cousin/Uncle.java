package ocja.practice.access_modifiers.fambam.cousin;

import ocja.practice.access_modifiers.fambam.ancestor.Grandfather;
import ocja.practice.access_modifiers.fambam.family.Child;
import ocja.practice.access_modifiers.fambam.family.Father;


public class Uncle extends Father{

    public static void main(String [] args){

  /*
In this class Uncle extends Father so Uncle has access to
the getProfession() method which is protected and was
inherited from GrandFather class. Notice that
getProfession is only accessible using an Uncle reference
because Uncle extends Father.
*/
        Uncle uncle = new Uncle();
        uncle.getProfession();

        /*
Now if we use a Father reference then that reference
will not have access to the getProfession() reference
because the Father reference is used inside an Uncle class
which is not in the same package as the Father class.
*/


        /*Father father = new Uncle();
        father.getProfession();*/   // !! DOES NOT COMPILE

    }
}

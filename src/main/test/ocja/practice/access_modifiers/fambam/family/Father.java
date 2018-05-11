package ocja.practice.access_modifiers.fambam.family;

import ocja.practice.access_modifiers.fambam.ancestor.Grandfather;

public class Father extends Grandfather {



    void getWealthStatus(){
        System.out.print("Daddy was a ");
        getProfession();
        System.out.print(" But i'm rich");
    }

    public static void main(String[] args){
        /*It's not possible to access the protected members of Grandfather
                using a Grandfather reference variable because grandfather
                is in a different package than Father; */

        //Grandfather grandfather = new Father(); OR new Grandfather()
        //grandfather.name;
        //grandfather.getProfession();

        /*But father reference is able to access all the class
            members of Grandfather because it extends Grandfather
                        and grandfather has its class members
            as protected*/

        Father father = new Father();
        System.out.println(father.name);
        father.getWealthStatus();
        father.getProfession();

    }
}

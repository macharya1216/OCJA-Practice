package pets;

import java.util.ArrayList;

public class Pets {

    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet[] createArray(){
        return creator.createArray();
    }
    public static ArrayList<Pet> arrayList(){
        return creator.arrayList();
    }
}

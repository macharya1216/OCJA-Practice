package pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {


    public abstract List<Class<? extends Pet>> types();

    public Pet[] createArray(){
        Pet[] result = new Pet[types().size()];
        for(int i =0; i< types().size();i++) {
           try{
            result[i] = types().get(i).newInstance();
           }catch(InstantiationException e){
               throw new RuntimeException(e);
           }catch(IllegalAccessException e){
               throw new RuntimeException(e);
           }
        }
        return result;
    }
    public ArrayList<Pet> arrayList(){
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result,createArray());
        return result;
    }

}

package protectedaccess.pond.foreignland;

import protectedaccess.pond.shore.Bird;
import protectedaccess.pond.swan.Swan;

public class ForeignSpecies extends Bird {

    private static int counter = 0;
    private final int id = counter++;
    public void doThings(){
        Swan swan = new Swan();
        counter++;

    }

    private static void main (String ...args){
      //  System.out.println("ID for this system is"+id);
    }
}

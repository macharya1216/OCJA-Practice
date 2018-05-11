package ocja.practice.arrays_and_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*This class demonstrates when an array can throw
index out of bound exception. As you can see, the
vulnerable code is in line 36. if line 29 - 30 are
commented out and replaced with line 31, then
line 38 will throw an index out of bound exception because the list is empty. */

class Chicken{
    String name;
    Chicken(String name){this.name =name; }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface HenHouse {List<Chicken> getChickens();}
class ChickenFactory implements HenHouse{
    public List<Chicken> getChickens(){
        Chicken chick1 = new Chicken("LittleJerry");
        return Arrays.asList(chick1);
     // return new ArrayList<>();
    }
}
public class ArrayIndexOutOfBoundOnEmptyArrayList {

    public static void main(String[] args) {
        HenHouse house = new ChickenFactory();
        Chicken chicken = house.getChickens().get(0);
        for(int i = 0; i < house.getChickens().size(); i++) {
            chicken = house.getChickens().get(i);
            System.out.println(chicken);
        }
    }

}

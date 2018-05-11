package ocja.practice.arrays_and_lists;

import org.junit.Test;
import pets.*;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class ListFeaturesPets {

    @Test
    public void testListFeatures(){

        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList();
        System.out.println("PETS 1: "+pets);

        assertTrue(pets.size() == 8);
        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("PETS 2: "+pets);

        assertTrue(pets.size() == 9);
        assertTrue(pets.contains(h));
        assertTrue(pets.remove(h));
        System.out.println("PETS 3: "+pets);

        Pet p = pets.get(2);
        assertTrue(p instanceof EgyptianMau);
        Pet cymric = new Cymric();
        assertTrue(pets.indexOf(cymric) == -1);
        assertTrue(!pets.remove(cymric));
        assertTrue(pets.remove(p));
        pets.add(3,new Mouse());
        System.out.println("PETS 4: "+pets);

        assertTrue(pets.size() == 8);
        List<Pet> sub = pets.subList(1,4);
        assertTrue(pets.containsAll(sub));
        System.out.println("SUB 1:"+sub);

        // Collections.sort(pets);
        Collections.shuffle(sub,rand);
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1),pets.get(4));
        System.out.println("SUB 2:"+sub);
        copy.retainAll(sub);
        System.out.println("COPY1: "+copy);

        copy = new ArrayList<Pet>(pets);
        System.out.println("COPY2: "+copy);
        copy.remove(2);
        System.out.println("COPY3: "+copy);
        assertTrue(copy.removeAll(sub));
        System.out.println("COPY4: "+copy);
        copy.set(1,new Mouse());
        System.out.println("COPY5: "+copy);
        copy.addAll(2,sub);
        System.out.println("COPY6: "+copy);

        assertTrue(!pets.isEmpty());
        pets.clear();
        assertTrue(pets.isEmpty());
        pets.addAll(Pets.arrayList());
        Object[] o = pets.toArray();
        System.out.println(o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println(pa[3]);
    }

    /*Method demonstrates Null contains check when null element
    is inserted on a list*/
    @Test
    public void testNulLContainsCheck(){
        List<String> strList = new ArrayList<>();
        strList.add(null);
        assertTrue(strList.contains(null));
        // List<String> strList = new ArrayList<>(null); !! COMPILE ERROR ,instantiating a list with null throws a null pointer error
    }


    /*method demonstrates how AddAll can be used for an arrayList,
    Notice how addAll does not work for a list that is created
    using Arrays.asList(..) method as this is a fixed sized list
    created from an array*/

    @Test
    public void testAddAllCapaibilty(){

     List<Object> pets = new ArrayList<>();
        pets.add(new Cat("Diago"));
        pets.add(new Mouse("Minnie"));
        pets.add(new Pet("Pappy"));
         List<Object> hamsters = Arrays.asList(new Hamster());
        //List<Object> hamsters = new ArrayList<>();
       // hamsters.add(new Hamster("Chinkie"));
        pets.addAll(1,hamsters);
        for(Object pet : pets){
            System.out.println(((Pet)pet).name);
        }
        boolean exceptionCaught = false;
        try{
            hamsters.add(pets);
        }catch(UnsupportedOperationException e){
            exceptionCaught = true;
        }
        assertTrue(exceptionCaught);
    }



}

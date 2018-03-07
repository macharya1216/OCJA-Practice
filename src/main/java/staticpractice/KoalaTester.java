package staticpractice;

import java.util.ArrayList;
import java.util.List;

public class KoalaTester {



    public static final List<String> values = new ArrayList<>();
    public static final Koala kBear = new Koala();
    public static void main(String[] args){
        values.add("changed");
        values.add("notchanged");
        values.remove(0);
        System.out.println(values);

        List<String> strList = new ArrayList<>();
        strList = values;
       // values = strList;
        kBear.setWeight("10");
        System.out.println(kBear);
      //  kBear = new Koala();


    }
}

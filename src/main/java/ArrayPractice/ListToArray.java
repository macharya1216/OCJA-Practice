package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

    public static void main (String[] args){
        List<String> strArray = new ArrayList<>();
        strArray.add("A");
        strArray.add("B");
        strArray.add("C");
        String[] arrayString = new String[20];
        arrayString = strArray.toArray(arrayString);
        for(String s : arrayString) System.out.println(s);

    }
}

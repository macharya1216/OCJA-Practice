package CoreApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args){
        String[] array = {"1","2","3"};
        List<String> strList = Arrays.asList(array);
        ArrayList list = new ArrayList();
        list.add(Boolean.valueOf(true));
        list.add(new char[]{'a'});
        list.add(new Object());
        list.add(new StringBuilder("dada"));
        list.add('a');
        System.out.println(list.toString());
        list.remove(new Character('a'));
        list.add(4,new int[]{1});

        System.out.println(list.toString());
        System.out.println(list.contains(new char[] {'a'}));
    }

}

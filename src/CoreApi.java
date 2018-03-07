import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract public class CoreApi

{


public static void main (String[] args){
    String string = "java";
    System.out.println("java" == string);
    String str = "jav";
    str += "a";
    ArrayList list = new ArrayList();
    List ballons = new ArrayList<String>();
    StringBuilder sb = new StringBuilder();

    /*System.out.println(str == string);
    System.out.println("java" == str);*/

    int [] intarray = {55,44,67};
    int [] intarray2 = {55,44,67};

    List<Integer> intArrayList = Arrays.asList(1,2);

    List<Integer> intArrayList2 = Arrays.asList(1,2,3);
   /* System.out.println(intarray == intarray2);
    System.out.println(intarray.equals(intarray2));
    System.out.println(intArrayList.equals(intArrayList2));*/

    /*System.out.println(intArrayList.toString());
   intArrayList.add(0,1);
    System.out.println(intArrayList.toString());
    intArrayList.remove(Integer.valueOf(1));
    System.out.println(intArrayList.toString());
*/
        walk(1);
        walk(1,2);
        walk(1,2,3);
        walk(1,new int [] {1,3});

}

    public static void walk(int start, int ...nums){

        System.out.println(nums.length);
    }

        public abstract void walk();
}

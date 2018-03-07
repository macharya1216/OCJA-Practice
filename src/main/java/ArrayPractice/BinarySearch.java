package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args){
        System.out.println("Raw args "+Arrays.toString(args));
        Arrays.sort(args);
        System.out.println("Sorted args "+Arrays.toString(args));
        int index = Arrays.binarySearch(args,"mary"); // -2
        int index1 = Arrays.binarySearch(args,"abel"); // -1
        int index3 = Arrays.binarySearch(args,"Zacob"); // -3

        System.out.println(index+" "+index1 +" "+index3);

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        System.out.println("Array equals on two array with same value"+array1.equals(array2));
        System.out.println("Arrays  equals on two array with same value"+Arrays.equals(array1,array2));
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);

        System.out.println("ArrayList equals on two array with same value"+array1.equals(array2));
    }
}

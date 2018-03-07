package CoreApi;

public class StringEquals {

    public static void main (String[] args){
        String str1 = new String("Hello World!");
        String str2 = "Hello World!";

        System.out.println("Two different string one on heap one on string pool with object reference equals "+(str1 == str2));
        System.out.println("Two different string one on heap one on string pool with value equivalence "+str1.equals(str2));

        Object obj1 = str1;
        Object obj2 = str2;

        System.out.println("Two different string one on heap one on string pool both converted to Object reference with object reference equals "+(obj1 == obj2));
        System.out.println("Two different string one on heap one on string pool both converted to Object reference  with value equivalence "+obj1.equals(obj2));

        System.out.println("String comparing to the Ojbect "+(str2.equals(obj2)));

        String str3 = "Hello World! ".trim();
        String str4 = "Hello World!";

        System.out.println("Two different string both on String pool but one uses trim object reference equals "+(str3 == str4));
        System.out.println("Two different string both on String pool but one uses trim with value equivalence "+str3.equals(str4));
    }
}

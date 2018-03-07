package CoreApi;

public class StringBuilderTest {

    public static void main (String[] args){



       StringBuilder sb = new StringBuilder(5);

       System.out.println("Capacity "+sb.capacity());
       sb.append("animals");
       System.out.println("Capacity "+sb.capacity());

        StringBuilder strBuilder = new StringBuilder("Hello World!").append(" It's a beautiful day");

        System.out.println("Insert test- -------------------------");
        // System.out.println("String Builder inserting null: "+strBuilder.insert(strBuilder.length(),null)); Code does not compile if we are inserting null
       // System.out.println("String Builder inserting null: "+strBuilder.insert(strBuilder.length()+100,"Beautiful indeed")); // throws Index out of Bound
        System.out.println("String Builder inserting word after the second last word: "+strBuilder.insert(strBuilder.length()," Beautiful indeed"));
        System.out.println("String Builder deleting after the second word: "+strBuilder.delete(2,1000000));

        System.out.println("Object Equality- -------------------------");
        StringBuilder str = new StringBuilder("Hello World!");
        StringBuilder str1 = new StringBuilder("Hello World!");
        System.out.println("String Builder simple Equivalence compare "+str.equals(str1)); // false

        Object obj1 = str;
        Object obj2 = str1;
        System.out.println("String Builder converted to Object simple Equivalence compare "+obj1.equals(obj2)); // false


    }
}

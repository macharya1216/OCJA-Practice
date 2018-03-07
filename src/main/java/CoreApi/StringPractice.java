package CoreApi;

public class StringPractice {

    public static void main(String... args) {

        String myString = "Hello World!";
        System.out.println("Length " + myString.length());
        System.out.println("Substring from e to the rest of the words "+myString.substring(1,myString.length()));
        System.out.println("Index of "+myString.indexOf("or")); //7
        System.out.println("Index of starting right from the index where the word is "+myString.indexOf('o',4)); // 4
        System.out.println("Index of "+myString.indexOf('o',5)); //7
        System.out.println("StartsWith and Index Of comparision------------------------------------------");
        System.out.println("StartsWith He "+myString.startsWith("He")); // true
        System.out.println("StartsWith He case sensetive"+myString.startsWith("he")); // false
        System.out.println("EndsWith d! "+myString.endsWith("d!")); // true
        System.out.println("Index Of compared to Startswith "+(myString.indexOf("He") == 0)); // true
        System.out.println("Index Of compared to Startswith case sensetive"+(myString.indexOf("he") == 0)); // false
        System.out.println("Index Of compared to Endswith case sensetive"+(myString.indexOf("d!") == myString.length()-2)); // true
        System.out.println("String contains --------------------------");
        System.out.println("My String contains the whole word "+myString.contains("Hello World!")); // true
        System.out.println("My String contains one letter "+myString.contains("!")); // true
        System.out.println("My String contains one letter "+myString.contains(new StringBuilder("or"))); // true
        System.out.println("String replace --------------------------");
        String str = myString.replace('w','Z');
        System.out.println("My String replace small w with Z (testing to check if replace is case sensetive or not"+str); // Hello World!
        String str1 = myString.replace('W','Z');
        System.out.println("My String replace small w with Z (testing to check if replace is case sensetive or not"+str1); // Hello World!


    }
    }

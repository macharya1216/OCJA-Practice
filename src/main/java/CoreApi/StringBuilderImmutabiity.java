package CoreApi;

public class StringBuilderImmutabiity {

    public static void main(String[] main ){
        StringBuilder sb = new StringBuilder("start ");

        sb.append("middle ");
        StringBuilder same = new StringBuilder("twah ");
        same = sb.append("end ");
        System.out.println(sb + " "+ same);
        System.out.println(sb==same);
        System.out.println(sb.equals(same));
        String str = "startmiddleend";
        System.out.println(str);
        System.out.println(sb.equals(str));
        System.out.println(str.equals(sb));
        Object o = new Object();
        same.insert(15,"-");
        System.out.println(same);



    }
}

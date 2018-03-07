import java.util.Arrays;

public class OCAGeneralPractice {

    public static void main(String args[]){

        StringBuilder sbr = new StringBuilder();
        sbr.append("happy");
        System.out.println(sbr);
        String[] strArr  = new String[]{"ABC","DEF","GHI"};
        strArr[1].concat("JKL");
        System.out.println(Arrays.toString(strArr));
        strArr[1] = strArr[1].concat("JKL");
        System.out.println(Arrays.toString(strArr));

        /* int integral = 1;
        long floater = 1;
        Object val = 1 + floater;
        System.out.print(val.getClass());

        short s1 = 1,s2 = 2;
        val = s1+s2;
        System.out.print(val.getClass());
        val = s1/s2;
        System.out.print(val.getClass());
        byte b = 126;
        val = b/s1;
        System.out.print(val.getClass());
        char c = 'c';
        val = b/s1 * c;
        System.out.print(val.getClass());

        short x = 14;
        float y = 13;
        double z = 30;

        double result = x * y /z;
        System.out.println(result);

        short result1 = (short) (x + s1);*/


    }

}

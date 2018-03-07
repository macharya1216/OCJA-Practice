package order.of.initialization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderInitialization {


    static{
    }

    private static final int nval=4;

    public OrderInitialization(){

    }


  public static void main (String ...str1){

        StringBuilder name = new StringBuilder("duniya");
        name.append(new char[]{'0','1','2'},0,3);
        name.append("str",1,3);
        System.out.println(name); //duniya012tr

      name = new StringBuilder("duniya");
      name.insert(1,new char[]{'0','1','2'},0,3); //d012uniya
      name.insert(2,"str",1,3);//d0tr13uniya
      System.out.println(name);

        char[] charArray = {'b','A','d','c'};
        Arrays.sort(charArray,0,2);
        System.out.println(Arrays.toString(charArray));

      List<String> strList =  Arrays.asList("B","A");
      List<String> strList1 =  new ArrayList<>(strList);
      System.out.println(strList.equals(strList1));

      LocalDate.now().plus(Period.ofDays(1));

      /*  String stringette = "queen shristi";
         System.out.println(stringette.replace('i','u'));
      System.out.println("Hello".equals(" Hello ".trim()));
*/
       // speak(name);

      /*int dayOfWeek=5;

      switch(dayOfWeek){

          case 0: System.out.println("Sunday");
          case nval: System.out.println("Sunday");
      }
*/

      }

      public static void speak(int num, int ...num1){
          System.out.println("Calling  int and vararg method");
      System.out.println(num);
      System.out.println(Arrays.toString(num1));
      }

    public void speak(int num){

          System.out.println("Calling only int method");
          System.out.println(num);
        //System.out.println(Arrays.toString(num1));
    }
}

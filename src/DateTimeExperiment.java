import java.lang.reflect.Array;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;


public class DateTimeExperiment {



    public static void main(String[] args) {
        String str = new String(new StringBuilder("123"));

        LocalDate date= LocalDate.of(2015,12,12);

        LocalDate start = LocalDate.of(2015,Month.JANUARY,1);

      LocalDate end = LocalDate.of(2015,Month.MARCH,30);
      Period period = Period.ofMonths(1);
      StringBuilder sbr = new StringBuilder("jerry");
      performAnimalEncrichment(start,end,period,sbr);
      System.out.println("Value of StartDate in main "+start);
        System.out.println("StringBuilder in main "+sbr);



   /* LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime = LocalDateTime.of(date, time);

        *//* DEFAULT DATE_TIME_FORMATTER BEHAVIOUR *//*
        System.out.println(" Date formatted as just local date"+date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        //System.out.println("Date formatted as local time"+date.format(DateTimeFormatter.ISO_LOCAL_TIME));
        //System.out.println("Date formatted as local date and time"+date.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(" Time formatted as just local time"+time.format(DateTimeFormatter.ISO_LOCAL_TIME));
       // System.out.println(" Time formatted as  local date"+time.format(DateTimeFormatter.ISO_LOCAL_DATE));
       // System.out.println("time formatted as local date and time"+time.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("Datetime formatted as local date "+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Datetime formatted as local time "+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("Datetime formatted as local datetime "+dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

     *//*   *//**//* DATE_TIME_FORMATTER BEHAVIOUR for ofLocalizedDate()*//*
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(shortDateTime.format(dateTime));

      //  System.out.println(date.format(shortDateTime));
       // System.out.println(time.format(shortDateTime));
       // System.out.println(" Date formatted as ofLocalizedDate "+shortDateTime.format(date));
       // System.out.println(" Time formatted as ofLocalizedDate "+shortDateTime.format(time));
       // System.out.println(" Date Time formatted as ofLocalizedDate "+shortDateTime.format(dateTime));


         *//* DATE_TIME_FORMATTER BEHAVIOUR for ofLocalizedDateTime()*//**//*
        DateTimeFormatter shortDateTime1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
       // System.out.println(" Date formatted as ofLocalizedDateTime "+shortDateTime1.format(date));
        //System.out.println(" Time formatted as ofLocalizedDateTime "+shortDateTime1.format(time));
        System.out.println(" Date Time formatted as ofLocalizedDateTime "+shortDateTime1.format(dateTime));

        DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern(",hh:mm");


        System.out.println(" Date Time formatted with ofPattern only Date pattern "+patternFormatter.format(dateTime));
*/


    }

    private static void performAnimalEncrichment(LocalDate start,LocalDate end,Period period,StringBuilder sbr){
       // LocalDate upTo= start;
       List list= new ArrayList<>(1);
        while(start.isBefore(end)){
            System.out.println("give new toy: "+start);
            sbr = new StringBuilder("cola");
            start= start.plus(period);
            String str = "";

        }
    }


}

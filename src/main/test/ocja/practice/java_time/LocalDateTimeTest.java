package ocja.practice.java_time;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertTrue;

public class LocalDateTimeTest {
/*
    Testing the general static and
    non static methods of the LocalDateTime api*/
    @Test
    public void testGeneralLocalDateTimeApi(){

       // During the compare to , if the date is same and time is different, then the compare to of the
        // local time method will be used

        System.out.println(LocalDateTime.now()); // 2018-04-25T06:48:02.258
        LocalDateTime localDateTime = LocalDateTime.of(2018,03,04,2,29);
        LocalDateTime localDateTimeFuture = LocalDateTime.of(2018,03,04,7,33);
        assertTrue(localDateTime.compareTo(localDateTimeFuture)==-1);

/*
       During the compare to, if the date is different then the compare to of the local date will be used
*/

        localDateTime = LocalDateTime.of(2018,03,07,2,29);
        assertTrue(localDateTime.compareTo(localDateTimeFuture)==3);

        /*For LocalDateTime and Local Date, the getMonth will output the Month.ENUM value
        of the month while the getMonthValue will output the int value of the month
        */

        assertTrue(localDateTime.getMonth().equals(Month.MARCH));
        assertTrue(localDateTime.getMonthValue() == 3);

        /*Testing the parse method in LocalDateTime, the simplest way
                possible*/
        LocalDateTime ldt = LocalDateTime.parse("2018-03-04T02:15");
        assertTrue(ldt.getMonth().equals(Month.MARCH));

        assertTrue("2018-03-04T02:03".equals(LocalDateTime.of(2018,03,04,02,03).toString()));

    }

    @Test(expected = DateTimeException.class)
    public void testLocalDateTimeThrowsExceptionWhenFromMethodOnlyHasTime(){

        // The static from method, when provided only local Time, would
        //print the date and time together
        LocalDateTime fromLocalDateTime = LocalDateTime.from(LocalTime.of(02,03));

    }

    @Test(expected = DateTimeException.class)
    public void testLocalDateTimeThrowsExceptionWhenFromMethodOnlyHasDate(){

        // The static from method, when provided only local Time, would
        //print the date and time together
        LocalDateTime fromLocalDateTime = LocalDateTime.from(LocalDate.of(2018,03,03));

    }

    @Test(expected = DateTimeException.class)
    public void testLocalDateTimeParseMethodWithoutTimeThrowsException(){

        /*The parse method in Local Date requires both Date and Time
                to be passed . In this method we are only sending Date
                which throws a DateTimeException*/
        LocalDateTime ldt = LocalDateTime.parse("2018-03-04");

    }

    @Test(expected = DateTimeException.class)
    public void testLocalDateTimeParseMethodWithoutDateThrowsException(){

        /*The parse method in Local Date requires both Date and Time
                to be passed . In this method we are only sending Time
                which throws a DateTimeException*/
        LocalDateTime ldt = LocalDateTime.parse("02:15");

    }


    /*
    This method demonstrates the flexibility of the format(..) method
    of the LocalDateTime class. Notice that as the parameter for the
    LocalDateTime.format(..) method, you can pass a DateTimeFormatter.LOCAL_DATE
    or DateTimeFormatter.LOCAL_TIME, and this would still work displaying only the
    Date or Time portion of the time.

    This method tests the format(..) method of the LocalDateTime class.
    It checks the behaviour of the LocalDateTime object when a format
    just for the Date or Time part is passed*/
    @Test
    public void testLocalDateTimeFormat(){

        LocalDateTime ldt = LocalDateTime.now();
        boolean exceptionCaught = false;
        String format = null;
        try {
            format = ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            System.out.println("Date and Time : "+format);
        }catch(Exception e){
            exceptionCaught = true;

        }

        assertTrue(!exceptionCaught);

        try {
            format = ldt.format(DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println("Date : "+format);
        }catch(Exception e){
            exceptionCaught = true;

        }
        assertTrue(!exceptionCaught);
        exceptionCaught = false;

        try {
            format = ldt.format(DateTimeFormatter.ISO_LOCAL_TIME);
            System.out.println("Time : "+format);
        }catch(Exception e){
            exceptionCaught = true;

        }
        assertTrue(!exceptionCaught);

    }

    /*This method tests how the get(..) method can be used with the LocalDateTime object
        */

    @Test
    public void testLocalDateGet(){


        LocalDateTime ldt = LocalDateTime.now();
        // Note how LocalDateTime would print the entire dateTime until the Nano Seconds
        System.out.println(ldt);  // PRINTS : 2018-04-24T07:17:32.511

        /* if you use the get(ChronoField.NANO_OF_DAY) , you will get a runtime exception because the value
        would be too large to fit in an Integer. */
        long nanoSeconds = ldt.getLong(ChronoField.NANO_OF_DAY);

        long milis = ldt.getLong(ChronoField.MILLI_OF_SECOND);
        System.out.println(milis);
    }


}

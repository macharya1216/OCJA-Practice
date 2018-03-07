package ocja.practice.java_time;

import org.junit.Test;

import java.time.*;
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


}

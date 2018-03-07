package ocja.practice.java_time;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.temporal.*;

import static org.junit.Assert.assertTrue;

public class LocalDateTest {

    @Test
    public void testGeneralLocalDateApi(){
        LocalDate localDate = LocalDate.now();
        assertTrue(localDate.equals(LocalDate.now()));
        assertTrue(localDate != LocalDate.now());


        // Asserts adding days to the localDate object does not
        // alter the localDate object itself.
        localDate = LocalDate.of(2017,01,31);

        LocalDate newLocalDate = localDate.plus(31, ChronoUnit.DAYS);
        assertTrue(localDate.equals(LocalDate.of(2017,01,31)));
        assertTrue(newLocalDate.equals(LocalDate.of(2017,03,03)));

        // Assert that netagive amount can also be added to plus method

        LocalDate backLocalDate = localDate.plus(-31, ChronoUnit.DAYS);
        assertTrue(backLocalDate.equals(LocalDate.of(2016,12,31)));

        //Plus using Temporal Period
        LocalDate temporalAddedDays = localDate.plus(Period.ofWeeks(-5));
        assertTrue(temporalAddedDays.equals(LocalDate.of(2016,12,27)));

        // checking the isBefore and isAfter methods
        assertTrue(localDate.isBefore(newLocalDate));
        assertTrue(localDate.isAfter(backLocalDate));

       // Checking the AT Time method  which Combines this date with a time to create a LocalDateTime.
        LocalDateTime localDateTime = localDate.atTime(03,31);
        assertTrue(localDateTime.toString().equals("2017-01-31T03:31"));

        // Checking the Compare To method

        assertTrue(localDate.compareTo(newLocalDate) == -2);
        assertTrue(localDate.compareTo(backLocalDate) == 1);
        assertTrue(localDate.compareTo(localDate) == 0);

        LocalDate a = LocalDate.of(2017, 05, 31);
        LocalDate b = LocalDate.of(2017, 05, 03);
        assertTrue(a.compareTo(b) == 28);
        assertTrue(b.compareTo(a) == -28);

        // Checking the start of the day method
        LocalDateTime startOfTheDateTime = localDate.atStartOfDay();
        assertTrue(startOfTheDateTime.toString().equals("2017-01-31T00:00"));

        LocalDate fromLocalDateTime = localDate.from(LocalDateTime.now());
        assertTrue(fromLocalDateTime.toString().equals("2018-03-02"));

        // Testing the parse method
        LocalDate parsedLocalDate = localDate.parse("2007-12-03");
        assertTrue(parsedLocalDate.toString().equals("2007-12-03"));

    }
  /*  Trying to use the parse method of the LocalDate on a
    character sequence (String, StringBuilder, StringBuffer)
        containing the Time , throws DateTimeParseException*/
    @Test(expected  = DateTimeParseException.class)
    public void testLocalDateParseOnCharSeqWithTimeThrowsDateTimeParseExcep(){
        LocalDate parsedLocalDate = LocalDate.parse("2017-01-31T03:31");
    }

    /*  Using Duration (used on DateTime on Local Date plus method
    * throws an Unsupported Temporal Type exception*/
    @Test(expected  = UnsupportedTemporalTypeException.class)
    public void testLocalDateThrowsUnsupTempExcepWhenUsingDurationOnPlusMethod(){
        LocalDate ld = LocalDate.now().plus(Duration.ofDays(8));

    }

    /*  Using Duration (used on DateTime on Local Date plus method
    * throws an Unsupported Temporal Type exception*/
    @Test(expected  = UnsupportedTemporalTypeException.class)
    public void testgeneral(){
        LocalDate backLocalDate = LocalDate.now().plus(31, ChronoUnit.HOURS);
        System.out.println(backLocalDate);
    }

    /*
    We know february has 28 days but if you provide 31 as the day for
    february in the of method, the method throws DateTimeException*/
    @Test(expected  = DateTimeException.class)
    public void testOfMethodWithInvalidDayForFebruaryThrowsDateTimeExcep(){
        LocalDate localDate = LocalDate.of(2017,02,31);
        System.out.println(localDate);
    }


}

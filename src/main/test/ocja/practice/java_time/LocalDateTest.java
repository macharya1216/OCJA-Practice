package ocja.practice.java_time;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LocalDateTest {

    @Test
    public void testGeneralLocalDateApi(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //2018-04-02


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

        /*Example below demonstrates the from(TemporalAccessor) method which returns the LocalDate version of the
                TemporalAccessor passed to the parameter of the from method*/
        LocalDate fromLocalDateTime = localDate.from(LocalDateTime.of(2017,01,01,01,01));
        assertTrue(fromLocalDateTime.toString().equals("2017-01-01"));



        // Testing the parse method
        LocalDate parsedLocalDate = localDate.parse("2007-12-03");
        assertTrue(parsedLocalDate.toString().equals("2007-12-03"));


        parsedLocalDate = localDate.parse("2007-12-03+01:00",DateTimeFormatter.ISO_DATE);
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

    @Test
    public void testLocalDateGeneral(){
        LocalDate fromLocalDateTime = LocalDate.from(LocalDateTime.now());
        System.out.println(fromLocalDateTime);
        // CANNOT PARSE a local date with LOCAL_DATE_TIME formatter because it looks for the TIME format
        try {
            LocalDate parsedLocalDate = LocalDate.parse("2018-03-31", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        }catch(DateTimeParseException e){
         assertEquals(e.getMessage(),"Text '2018-03-31' could not be parsed at index 10");
        }

        // HOWEVER in the characterSequence if you have the Timestamp specified , you can use the local date time formatter
        LocalDate ld = LocalDate.parse("2018-03-31T00:00:00",DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(ld);



     }

    @Test
    public void testLocalDateGeneralGets(){

        LocalDate fromLocalDateTime = LocalDate.parse("2018-03-31");
        int generalLong = fromLocalDateTime.get(ChronoField.MONTH_OF_YEAR);
        assertTrue(generalLong == 3);
        int generalDay = fromLocalDateTime.get(ChronoField.DAY_OF_MONTH);
        assertTrue(generalDay == 31);
        Month month = fromLocalDateTime.getMonth();
        assertTrue(month == Month.MARCH);
        DayOfWeek dayOfWeek = fromLocalDateTime.getDayOfWeek();
        assertTrue(dayOfWeek == DayOfWeek.SATURDAY);
        long nanos = 0;
        boolean exceptionCaught = false;
        try{
            nanos = fromLocalDateTime.getLong(ChronoField.NANO_OF_SECOND);
        }catch(Exception e){
            System.out.println(e);
            exceptionCaught = true;
        }
        assertTrue(exceptionCaught);

    }

    @Test
    public void testLocalDateGeneralPlus(){

        LocalDate fromLocalDateTime = LocalDate.parse("2018-03-31");
        LocalDate plusLocalDate = fromLocalDateTime.plus(Period.of(1,1,1));
        assertEquals(plusLocalDate.toString(),"2019-05-01");

        fromLocalDateTime = LocalDate.parse("2018-01-31");
        plusLocalDate = fromLocalDateTime.plus(1,ChronoUnit.MONTHS);
        assertEquals(plusLocalDate.toString(),"2018-02-28");

    }

    @Test
    public void testLocalDateFormatGeneral(){
        LocalDate fromLocalDateTime = LocalDate.parse("2018-03-31");

        //DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
        assertEquals((fromLocalDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))).toString(),"Saturday, March 31, 2018");
        //LONG
        assertEquals((fromLocalDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))).toString(),"March 31, 2018");

        //MEDIUM
        assertEquals((fromLocalDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))).toString(),"Mar 31, 2018");

        //SHORT
        assertEquals((fromLocalDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))).toString(),"3/31/18");

        // USING DATE TIME or TIME would not work with the DateTimeFormatter.of* methods
        try {
            assertEquals((fromLocalDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))).toString(), "3/31/18");
        }catch(UnsupportedTemporalTypeException e){
            assertEquals(e.getMessage(),"Unsupported field: ClockHourOfAmPm");
        }

        assertEquals((fromLocalDateTime.format(DateTimeFormatter.ofPattern("M/dd/YY"))).toString(),"3/31/18");


    }


   /*Method demonstrates that the static from(..) method only can accept LocalDateTime
        and not LocalTime as the date part is not available in LocalTime*/
    @Test
    public void testLocalDateFromMethodTakesLocalTimeAndLocalDateTime(){
        boolean exceptionCaught = false;
        try {
            LocalDate ld = LocalDate.from(LocalTime.of(01,1));
        }catch(Exception e){
            exceptionCaught = true;
        }
        assertTrue(exceptionCaught);
        exceptionCaught = false;
        try {
            LocalDate ld = LocalDate.from(LocalDateTime.of(2017,Month.MARCH,01,01,1));
        }catch(Exception e){
            exceptionCaught = true;
        }
        assertTrue(!exceptionCaught);
    }



}

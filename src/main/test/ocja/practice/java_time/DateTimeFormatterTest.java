package ocja.practice.java_time;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.FieldAccessor_Short;
import org.junit.Test;

import java.text.Format;
import java.text.ParsePosition;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DateTimeFormatterTest {
/*
    Testing the general static and
    non static methods of the DateTimeFormatter api*/
    @Test
    public void testGeneralDateTimeFormatterApi(){

   /*   Testing basic format method of DateTimeFormatter
        some of the basic date formats are BASIC ISO DATE (yyyymmdd)
                ISO_DATE (yyyy-mm-dd), ISO_DATE_TIME (yyyy-mm-ddThh:mm:ss)
        ISO_LOCAL_DATE_TIME, ISO_LOCA_DATE*/

        LocalDate ld = LocalDate.of(2018,03,04);
        String formattedDate = DateTimeFormatter.BASIC_ISO_DATE.format(ld);
        assertTrue(("20180304").equals(formattedDate));

        LocalDateTime ldt = LocalDateTime.of(2018,03,04,2,03);
        formattedDate = DateTimeFormatter.ISO_DATE_TIME.format(ldt); // ISO_LOCAL_DATE_TIME works the same
        assertTrue(("2018-03-04T02:03:00").equals(formattedDate));

        LocalTime lt = LocalTime.of(02,03);
        formattedDate = DateTimeFormatter.ISO_LOCAL_TIME.format(lt);
        assertTrue(("02:03:00").equals(formattedDate));

        // Testing the parse methods of LocalDate , LocalTime and LocalDateTime with each DateTimeFormatter

        assertTrue("2018-03-04".equals(LocalDate.parse("20180304",DateTimeFormatter.BASIC_ISO_DATE).toString()));

        assertTrue("2018-03-04T02:03".equals(LocalDateTime.parse("2018-03-04T02:03:00",DateTimeFormatter.ISO_LOCAL_DATE_TIME).toString())); // ISO_DATE_TIME works the same

        assertTrue("02:03".equals(LocalTime.parse("02:03",DateTimeFormatter.ISO_TIME).toString()));


       /* Testing the formatTo method in which we can pass an Appendable (StringBuilder,FileWriter etc),
                this method is a void which will write to that Appendable in the format specified*/

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        StringBuilder builder = new StringBuilder("BasicFormat :");
        dateTimeFormatter.formatTo(LocalDate.of(2018,03,04),builder);
        assertTrue("BasicFormat :20180304".equals(builder.toString()));


        /*Testing the LONG SHORT MEDIUM FULL FormatStyle of the DateTimeFormatter with each of the Temporal Accessors*/

        "March 4,2018".equals(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(LocalDate.of(2018,03,04)));
        // notice LocalDateTime instance is used but the DateTimeFormatter is using the ofLocalizedDate method. This means ofLocalizedDate or ofLocalizedTime both can accept LocalDate to format.
        "2018-03-04".equals(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(LocalDateTime.of(2018,03,04,05,06)));
        "Mar 4, 2018".equals(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(LocalDate.of(2018,03,04)));
        "Sunday, March 4, 2018".equals(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.of(2018,03,04)));


        "March 4, 2018 2:03:02 AM".equals(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM).format(LocalDateTime.of(2018,03,04,02,03,02,00)));
        "Mar 4, 2018 2:03:02 AM".equals(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.of(2018,03,04,02,03,02,00)));
        "3/4/18 2:03 AM".equals(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT).format(LocalDateTime.of(2018,03,04,02,03,02,00)));

        // notice LocalDateTime instance is used but the DateTimeFormatter is using the ofLocalizedTime method. This means ofLocalizedDate or ofLocalizedTime both can accept LocalDate to format.
        "2:03:04 AM".equals(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalDateTime.of(2018,03,04,02,03,04)));
        "2:03 AM".equals(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(LocalTime.of(02,03,04)));


        /*
        Testing of pattern methdod
         */

        assertTrue(("2018/03/05").equals(LocalDate.of(2018,03,05).format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))));
        // IS SAME AS
        assertTrue(("2018/03/05").equals(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDate.of(2018,03,05)).toString()));

        assertTrue(("2018 March Monday").equals(LocalDate.of(2018,03,05).format(DateTimeFormatter.ofPattern("YYYY MMMM EEEE")))); ;
        // IS SAME AS
        assertTrue(("2018 March Monday").equals(DateTimeFormatter.ofPattern("YYYY MMMM EEEE").format(LocalDate.of(2018,03,05)))); ;

        assertTrue("2018 March Monday 02:03:00 AM".equals(DateTimeFormatter.ofPattern("YYYY MMMM EEEE hh:mm:ss a").format(LocalDateTime.of(2018,03,05,02,03))));
        //IS SAME AS
        assertTrue("2018 March Monday".equals(LocalDateTime.of(2018,03,05,02,03).format(DateTimeFormatter.ofPattern("YYYY MMMM EEEE"))));



    }

/*
    Using the parse method of LocalTime, if we send a
    String pattern including the Date, this will throw
    a Date Parse Exception*/
    @Test(expected = DateTimeParseException.class)
    public void testLocalTimeParseMethodThrowsExcepWhenStringHasDate(){

        LocalTime lt = LocalTime.parse("2018-03-06T06:22");
    }


    /*
    Using the parse method of LocalTime, if we send a
    String pattern including the Date, this will throw
    a Date Parse Exception*/
    @Test(expected = DateTimeParseException.class)
    //@Test
    public void testLocalTimeParseMethodThrowsExcepWhenStringHasDate1(){

        //LocalTime lt = LocalTime.parse("2018-03-06T06:22",DateTimeFormatter.ISO_TIME);
        DateTimeFormatter dtf = DateTimeFormatter.ISO_TIME;
        TemporalAccessor lt  =   dtf.parse("2018-03-06T06:22", new ParsePosition(11));
        LocalTime localTime = (LocalTime)lt;
        System.out.println(localTime.toString());
    }

    /*Parse method of LocalDateTime requires the time string as well*/
    @Test(expected = DateTimeParseException.class)
    public void testLocalDateParseMethodThrowsExcepWhenStringHasDateOnly(){
        LocalDateTime ldt = LocalDateTime.parse("2018-03-06");

    }
    /*
    Of localized Date and Time method of DateTimeFormatter requires both
            Date and Time, if one is not present it throws exception*/
    @Test(expected = UnsupportedTemporalTypeException.class)
    public void testOfLocalizedDateTimeThrowsExceptionIfOnlyLocalDateorLocalTimeObjectIsPassed(){

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        dtf.format(LocalDate.now());

    }
    /*Of Pattern of DateTimeFormatter if has string that represents both
    date and time, and in the format method, you just send the time, this
    throws exception*/
    @Test(expected = IllegalArgumentException.class)
    public void testOfPatterWithBothDateAndTimeThrowsExcepWhenFormatIsPassedTimeOnly(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-ddThh:mm");
        dtf.format(LocalTime.now());

    }


    @Test
    public void testFormatBasicDateUsingLocalDateTime(){


        /*When a BASIC_ISO_DATE is used on a LocalDateTime , it works*/

        LocalDateTime ldt = LocalDateTime.of(2018,Month.MAY,01,01,01);
        String formattedDate = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);

        assertEquals("20180501",formattedDate);

        formattedDate = DateTimeFormatter.ISO_TIME.format(ldt);
        assertEquals("01:01:00",formattedDate);



    }



}

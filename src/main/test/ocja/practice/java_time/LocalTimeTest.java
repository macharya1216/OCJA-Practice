package ocja.practice.java_time;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

import static org.junit.Assert.assertTrue;

public class LocalTimeTest {
/*
    Testing the general static and
    non static methods of the LocalTime api*/
    @Test
    public void testGeneralLocalTimeApi(){
        LocalTime localTime = LocalTime.now();
        assertTrue(!localTime.equals(LocalTime.now()));

        LocalTime ofLocalTime = LocalTime.of(23,59);
        assertTrue(ofLocalTime.toString().equals("23:59"));

        LocalTime ofNanoOfDayLocalTime = LocalTime.now().ofSecondOfDay('&');
        assertTrue(ofNanoOfDayLocalTime.toString().equals("00:00:38"));

        LocalTime lt = LocalTime.parse(new StringBuilder("06:09:01.0001"));
        assertTrue(lt.toString().equals("06:09:01.000100"));

        // No matter how long you chain the static method, the last method that is chained gets used
        LocalTime mixedLt = LocalTime.now().ofSecondOfDay('&').parse(new StringBuilder("06:09:01.0001"));
        assertTrue(mixedLt.toString().equals("06:09:01.000100"));

        LocalTime plusLt = ofLocalTime.plus(Duration.ofMinutes(3));
        assertTrue(plusLt.toString().equals("00:02"));

        // if the original Local Time does not have seconds , milliseconds or nanoseconds
        // and we use a plus method on that instance, the new Local Time will include the added
        //second, millisecond or nanoseconds

        LocalTime plusNewNanoSecond = ofLocalTime.plus(9,ChronoUnit.NANOS);
        assertTrue(plusNewNanoSecond.toString().equals("23:59:00.000000009"));

        //LocalTime also has a non static atDate method which returns a LocalDateTime

        LocalDateTime ldt = LocalTime.of(02,00).atDate(LocalDate.of(2018,03,04));
        assertTrue(ldt.toString().equals("2018-03-04T02:00"));

        LocalTime compareTime1 = LocalTime.of(02,01);
        LocalTime compareTime2 = LocalTime.of(05,05);
        System.out.println(compareTime1.compareTo(compareTime2));


    }

}

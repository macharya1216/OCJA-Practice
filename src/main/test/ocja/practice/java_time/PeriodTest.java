package ocja.practice.java_time;

import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PeriodTest {

    @Test
    public void testGeneralPeriodMethods(){
/*
        Testing the addTo method of Period. It accepts
                any Temporal object i.e LocalDate, LocalDateTime and Local Time
                and returns a Temporal object back added to the Period*/
        Period period = Period.of(2018,03,06);
        assertEquals("P2018Y3M6D",period.toString());
        Temporal ld = period.addTo(LocalDateTime.of(2018,03,06,05,05));
        LocalDateTime ld1 = (LocalDateTime)ld;
        assertEquals("4036-06-12T05:05",ld1.toString());

       /*Testing the static between method of Period*/
        Period betweenPeriod = Period.between(LocalDate.of(2018,03,06),ld1.toLocalDate());
        assertEquals(2018,betweenPeriod.get(ChronoUnit.YEARS));
        assertFalse(betweenPeriod.isNegative());

        /*Testig the non static negated and normalized method of Period*/
        Period negatedPeriod = betweenPeriod.negated();
        assertEquals("P-2018Y-3M-6D",negatedPeriod.toString());

        Period unNormalizedPeriod = Period.of(2018,25,49);
        assertEquals("P2020Y1M49D",unNormalizedPeriod.normalized().toString());

        Period unNormalizedPeriod1 = Period.of(1,-25,49);
        assertEquals("P-1Y-1M49D",unNormalizedPeriod1.normalized().toString());

        // Testing the ofDays, ofMonths, ofWeeks, ofYears method in Period

        Period ofDaysPeriod = Period.ofMonths(51);
        System.out.println(ofDaysPeriod.normalized());


    }
}

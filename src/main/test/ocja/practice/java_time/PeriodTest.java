package ocja.practice.java_time;

import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
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
        assertEquals("P2018Y3M6D",betweenPeriod.toString());
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
        assertEquals("P4Y3M",ofDaysPeriod.normalized().toString());

        LocalDate ld0 = LocalDate.of(2018,Month.MAY,01);
        LocalDate ld01 = LocalDate.of(2018,Month.MAY,02);
        assertEquals("P1D",Period.between(ld0,ld01).toString());
    }


    /*Period class has an addTo(..) method that
            accpets any object that implements
    Temporal interface. This object will then
            be added to whatever period the Period
    object represents*/
    @Test
    public void testPeriodAddToMethod(){

        Period period = Period.of(2018,03,06);
        LocalDate localDate = LocalDate.of(2018, Month.JANUARY, 01);
        localDate = (LocalDate) period.addTo(localDate);
        assertEquals("4036-04-07" ,localDate.toString());

        LocalDateTime ldt = LocalDateTime.of(2016,Month.MAY,02,01,00);
        ldt = (LocalDateTime)period.addTo(ldt);
        assertEquals("4034-08-08T01:00" ,ldt.toString());
        assertEquals(period.get(ChronoUnit.DAYS),6);

        List<TemporalUnit> units = period.getUnits();
        System.out.println(units);

    }

    /*Method shows how chaining of Period takes the last chained method and
            gives the result*/
    @Test
    public void testPeriodOfMethods(){
        Period period = Period.of(2018,03,06).ofDays(1).ofMonths(3);
        assertEquals(period.toString(),"P3M");
    }


}




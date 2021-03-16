import com.kodilla.jacoco.Year;
import org.junit.Test;

import static org.junit.Assert.*;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfNotDivisibleBy400(){
        //given
        Year year = new Year(1234);

        //when
        boolean isLeapYear= year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeALeapYearIfDivisbleByFour(){
        //given
        Year year = new Year(2024);

        //when
        boolean isLeapYear= year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldBeNotALeapYearIfDivisbleByFHundred(){
        //given
        Year year = new Year(1000);

        //when
        boolean isLeapYear= year.isLeap();

        //then
        assertFalse(isLeapYear);
    }



}

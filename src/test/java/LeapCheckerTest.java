import no.denniso.InteliJ.LeapChecker;
import no.denniso.InteliJ.TooNegativeYear;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LeapCheckerTest {
    LeapChecker check;

    @BeforeEach
    public void setup() {
       check = new LeapChecker();
    }

    @ParameterizedTest
    @ValueSource(ints= {0, -1, -2, -1000})
    public void testThrowsTooNegativeYearOnZeroAndLess(int n){

        assertThrows(TooNegativeYear.class, () -> {check.isLeapYear(n);});
    }

    @Test
    public void testDividesByFourNotDIvidesByHundredResultsIn_True() {

        assertTrue(check.isLeapYear(2004));
        assertTrue(check.isLeapYear(1804));


    }

    @Test
    public void testDividesBy400ResultsIn_True() {

        assertTrue(check.isLeapYear(400));
        assertTrue(check.isLeapYear(800));

    }
    @Test
    public void testNotDividesByFourResultsIn_False() {

        assertFalse(check.isLeapYear(500));
        assertFalse(check.isLeapYear(9));
    }

    @Test
    public void testDividesBy100NotDividesBy400ResultsIn_False() {

        assertFalse(check.isLeapYear(300));
        assertFalse(check.isLeapYear(1100));

    }

    @ParameterizedTest                                                      //// PARAMETERIZED TEST
    @ValueSource(ints = {1860,1864,1868,1872, 2020, 2024, 2028})
    public void testAagainstRealLeapYEarValues(int n) {

        assertTrue(check.isLeapYear(n));

    }




}

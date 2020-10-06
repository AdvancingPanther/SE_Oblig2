import no.denniso.InteliJ.LeapChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapCheckerTest {

    @Test
    public void testDividesByFourNotDIvidesByHundredResultsIn_True() {
        LeapChecker check = new LeapChecker();

        assertTrue(check.isLeapYear(2004));
        assertTrue(check.isLeapYear(1804));


    }

    @Test
    public void testDividesBy400ResultsIn_True() {
        LeapChecker check = new LeapChecker();

        assertTrue(check.isLeapYear(400));
        assertTrue(check.isLeapYear(800));

    }
    @Test
    public void testNotDividesByFourResultsIn_False() {
        LeapChecker check = new LeapChecker();

        assertFalse(check.isLeapYear(500));
        assertFalse(check.isLeapYear(9));
    }

    @Test
    public void testDividesBy100NotDividesBy400ResultsIn_False() {
        LeapChecker check = new LeapChecker();

        assertFalse(check.isLeapYear(300));
        assertFalse(check.isLeapYear(1100));

    }




}

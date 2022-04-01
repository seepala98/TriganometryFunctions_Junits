package taylor_trigo_junits;

import static org.junit.Assert.*;

import org.junit.Test;

import taylor_trigo_junits.TaylorSeriesTrigoFunctions;

public class TaylorSeriesTrioFunctionTest {

	 // initialize variable PI
    public static final double PI = 3.14159265358979323846;

    public static TaylorSeriesTrigoFunctions taylorseries = new TaylorSeriesTrigoFunctions();
    @Test
    // method to test degToRad method
    public void testDegToRad() {
        double expected = 0.7853981633974483;
        double actual = taylorseries.degToRad(45);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    // method to test normalizeRad method
    public void testNormalizeRad() {
        double expected = 0.7853981633974483;
        double actual = taylorseries.normalizeRad(0.7853981633974483);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    // method to test factorial method
    public void testFactorial() {
        double expected = 120;
        double actual = taylorseries.factorial(5);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    // method to test exception handling for factorial method
    public void testFactorialException() {
        try {
        	taylorseries.factorial(0);
        } catch (Exception e) {
            assertEquals("n must be greater than 0", e.getMessage());
        }
    }

    @Test
    // method to test power method
    public void testPower() {
        double expected = 8;
        double actual = taylorseries.power(2, 3);
        assertEquals(expected, actual, 0.001);
    }
}

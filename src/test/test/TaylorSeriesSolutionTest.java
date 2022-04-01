package test;

import TaylorSeriesSolution.TaylorSeriesFunction;

import static org.junit.Assert.assertEquals;

public class TaylorSeriesSolutionTest {

    // initialize variable PI
    static final double PI = 3.14159265358979323846;

    // method to test degToRad method
    public static void testDegToRad() {
        double expected = 0.7853981633974483;
        double actual = TaylorSeriesFunction.degToRad(45);
        assertEquals(expected, actual, 0.001);
    }

    // method to test normalizeRad method
    public static void testNormalizeRad() {
        double expected = 0.7853981633974483;
        double actual = TaylorSeriesFunction.normalizeRad(0.7853981633974483);
        assertEquals(expected, actual, 0.001);
    }

    // method to test factorial method
    public static void testFactorial() {
        double expected = 120;
        double actual = TaylorSeriesFunction.factorial(5);
        assertEquals(expected, actual, 0.001);
    }

    // method to test exception handling for factorial method
    public static void testFactorialException() {
        try {
            TaylorSeriesFunction.factorial(0);
        } catch (Exception e) {
            assertEquals("n must be greater than 0", e.getMessage());
        }
    }

    // method to test power method
    public static void testPower() {
        double expected = 8;
        double actual = TaylorSeriesFunction.power(2, 3);
        assertEquals(expected, actual, 0.001);
    }

    // method to test sin method with Math.sin(x)
    public static void testSin() {
        double expected = Math.sin(2);
        double actual = TaylorSeriesFunction.sin(2);
        assertEquals(expected, actual, 0.001);
    }

    // method to test cos method with Math.cos(x)
    public static void testCos() {
        double expected = Math.cos(5);
        double actual = TaylorSeriesFunction.cos(5);
        assertEquals(expected, actual, 0.001);
    }

    // method to test tan method with Math.tan(x)
    public static void testTan() {
        double expected = Math.tan(0.7853981633974483);
        double actual = TaylorSeriesFunction.tan(0.7853981633974483);
        assertEquals(expected, actual, 0.001);
    }

    // method to test sin method for edge cases with Math.sin(x)
    public static void testSinEdge() {
        double expected = Math.sin(0);
        double actual = TaylorSeriesFunction.sin(0);
        assertEquals(expected, actual, 0.001);
    }

    // method to test cos method for edge cases with Math.cos(x)
    public static void testCosEdge() {
        double expected = Math.cos(0);
        double actual = TaylorSeriesFunction.cos(0);
        assertEquals(expected, actual, 0.001);
    }

    // method to test tan method for edge cases with Math.tan(x)
    public static void testTanEdge() {
        double expected = Math.tan(0);
        double actual = TaylorSeriesFunction.tan(0);
        assertEquals(expected, actual, 0.001);
    }

    // method to test sin method for egde case with degree as 90
    public static void testSinEdge90() {
        double expected = Math.sin(0.5 * PI);
        double actual = TaylorSeriesFunction.sin(TaylorSeriesFunction.degToRad(90));
        assertEquals(expected, actual, 0.001);
    }

    // method to test cos method for egde case with degree as 90
    public static void testCosEdge90() {
        double expected = Math.cos(0.5 * PI);
        double actual = TaylorSeriesFunction.cos(TaylorSeriesFunction.degToRad(90));
        assertEquals(expected, actual, 0.001);
    }

    //method to test tan method for egde case with degree as 90 exception handling
    public static void testTanEdge90Exception() {
        try {
            TaylorSeriesFunction.tan(TaylorSeriesFunction.degToRad(90));
        } catch (Exception e) {
            assertEquals("tan(x) is not defined for x = 90, 270", e.getMessage());
        }
    }

    public static void main(String[] args) {
        testDegToRad();
        testNormalizeRad();
        testFactorial();
        testFactorialException();
        testPower();
        testSin();
        testCos();
        testTan();
        testSinEdge();
        testCosEdge();
        testTanEdge();
        testSinEdge90();
        testCosEdge90();
        testTanEdge90Exception();
    }
}

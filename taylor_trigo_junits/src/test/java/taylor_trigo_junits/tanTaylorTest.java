package taylor_trigo_junits;

import static org.junit.Assert.*;

import org.junit.Test;

public class tanTaylorTest {

	public static TaylorSeriesTrigoFunctions taylorseries = new TaylorSeriesTrigoFunctions();
	public static tanTaylor tanTaylor = new tanTaylor();
	
    @Test
    // method to test tan method with Math.tan(x)
    public void testTan() {
        double expected = Math.tan(0.7853981633974483);
        double actual = tanTaylor.tan(0.7853981633974483);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    // method to test tan method for edge cases with Math.tan(x)
    public void testTanEdge() {
        double expected = Math.tan(0);
        double actual = tanTaylor.tan(0);
        assertEquals(expected, actual, 0.001);
    }


    @Test
    //method to test tan method for egde case with degree as 90 exception handling
    public void testTanEdge90Exception() {
        try {
        	tanTaylor.tan(taylorseries.degToRad(90));
        } catch (Exception e) {
            assertEquals("tan(x) is not defined for x = 90, 270", e.getMessage());
        }
    }
}

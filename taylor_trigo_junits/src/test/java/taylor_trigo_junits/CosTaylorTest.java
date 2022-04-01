package taylor_trigo_junits;

import static org.junit.Assert.*;

import org.junit.Test;

public class CosTaylorTest {

	public static TaylorSeriesTrigoFunctions taylorseries = new TaylorSeriesTrigoFunctions();
	public static sinTaylor sintaylor = new sinTaylor();
	public static cosTaylor costaylor = new cosTaylor();
    @Test
    // method to test cos method with Math.cos(x)
    public void testCos() {
        double expected = Math.cos(5);
        double actual = costaylor.cos(5);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    // method to test cos method for edge cases with Math.cos(x)
    public void testCosEdge() {
        double expected = Math.cos(0);
        double actual = costaylor.cos(0);
        assertEquals(expected, actual, 0.001);
    }

    
    @Test
    // method to test cos method for egde case with degree as 90
    public void testCosEdge90() {
        double expected = Math.cos(0.5 * taylorseries.PI);
        double actual = costaylor.cos(taylorseries.degToRad(90));
        assertEquals(expected, actual, 0.001);
    }
    
}

package taylor_trigo_junits;

import static org.junit.Assert.*;

import org.junit.Test;

public class sinTaylorTest {

    public static TaylorSeriesTrigoFunctions taylorseries = new TaylorSeriesTrigoFunctions();
    public static sinTaylor sinTaylor = new sinTaylor();
    @Test
    // method to test sin method with Math.sin(x)
    public void testSin() {
        double expected = Math.sin(2);
        double actual = sinTaylor.sin(2);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    // method to test sin method for edge cases with Math.sin(x)
    public void testSinEdge() {
        double expected = Math.sin(0);
        double actual = sinTaylor.sin(0);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    // method to test sin method for egde case with degree as 90
    public void testSinEdge90() {
        double expected = Math.sin(0.5 * taylorseries.PI);
        double actual = sinTaylor.sin(taylorseries.degToRad(90));
        assertEquals(expected, actual, 0.001);
    }
    
}

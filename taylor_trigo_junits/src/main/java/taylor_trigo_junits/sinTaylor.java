package taylor_trigo_junits;

public class sinTaylor {

	public static TaylorSeriesTrigoFunctions tstf = new TaylorSeriesTrigoFunctions();
	
    // method to calculate sin(x) using Taylor series
    // @param x
    // @return sin(x)
    public static double sin(double x) {
        double rad_normalized = tstf.normalizeRad(x);
        double sin = 0;
        for (int i = 0; i < 10; i++) {
            sin += tstf.power(-1, i) * tstf.power(rad_normalized, 2 * i + 1) / tstf.factorial(2 * i + 1);
        }
        return sin;
    }
}

package taylor_trigo_junits;

public class cosTaylor {

	public static TaylorSeriesTrigoFunctions tstf = new TaylorSeriesTrigoFunctions();

    // method to calculate cos(x) using Taylor series
    // @param x
    // @return cos(x)
    public static double cos(double x) {
        double rad_normalized = tstf.normalizeRad(x);
        double cos = 0;
        for (int i = 0; i < 10; i++) {
            cos += tstf.power(-1, i) * tstf.power(rad_normalized, 2 * i) / tstf.factorial(2 * i);
        }
        return cos;
    }
}

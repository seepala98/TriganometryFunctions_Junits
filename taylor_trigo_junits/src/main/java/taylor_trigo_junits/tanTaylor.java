package taylor_trigo_junits;

public class tanTaylor {

	public static TaylorSeriesTrigoFunctions tstf = new TaylorSeriesTrigoFunctions();
	public static sinTaylor sintaylor = new sinTaylor();
	public static cosTaylor costaylor = new cosTaylor();
	
    // method to calculate tan(x) using Taylor series
    // @param x
    // @return tan(x)
    public static double tan(double x) {
        if (x == tstf.PI / 2 || x == -tstf.PI / 2) {
            throw new IllegalArgumentException("tan(x) is not defined for x = 90, 270");
        }
        return sintaylor.sin(x) / costaylor.cos(x);
    }
}
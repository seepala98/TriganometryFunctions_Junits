package taylor_trigo_junits;

public class TaylorSeriesTrigoFunctions {

	public static final double PI = 3.14159265358979323846;
    public static final double CIRCLEANGLE = 360;

    // method to calculate degree to radian
    // @param degree
    // @return radian value of x
    public static double degToRad(double degree) {
        return 2 * degree * PI / (CIRCLEANGLE);
    }

    // method to normalize radian between 0 and PI
    // @param radian
    // @return normalized radian value
    public static double normalizeRad(double radian) {
        return radian % (2 * PI);
    }

    // method to calculate factorial of x
    // @param x
    // @return factorial of x
    public static double factorial(double x) {
        double fact = 1;
        if (x >= 0) {
            for (int i = 1; i <= x; i++) {
                fact *= i;
            }
        } else {
            throw new IllegalArgumentException("Factorial of negative number is not defined");
        }
        return fact;
    }

    // method to calculate power of x
    public static double power(double x, int n) {
        double sum = 1;

        if (n == 0) {
            return 1;
        }

        if ( n < 0 ) {
            throw new IllegalArgumentException("Power of negative number is not defined");
        }
        
        for (int i = 0; i < n; i++) {
            sum *= x;
        }

        return sum;
    }

    public static void main(String[] args) {
    	
    	sinTaylor sinTaylor = new sinTaylor();
    	cosTaylor cosTaylor = new cosTaylor();
    	tanTaylor tanTaylor = new tanTaylor();
    	
        System.out.println("sin(0) = " + sinTaylor.sin(degToRad(0)));
        System.out.println("sin(90) = " + sinTaylor.sin(degToRad(90)));
        System.out.println("sin(270) = " + sinTaylor.sin(degToRad(270)));
        System.out.println("cos(0) = " + cosTaylor.cos(degToRad(0)));
        System.out.println("cos(90) = " + cosTaylor.cos(degToRad(90)));
        System.out.println("cos(270) = " + cosTaylor.cos(degToRad(270)));
        System.out.println("tan(0) = " + tanTaylor.tan(degToRad(0)));
        System.out.println("tan(45) = " + tanTaylor.tan(degToRad(45)));
    }
}

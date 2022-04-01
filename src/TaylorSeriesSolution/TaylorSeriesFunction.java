package TaylorSeriesSolution;

public class TaylorSeriesFunction {

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

    // method to calculate sin(x) using Taylor series
    // @param x
    // @return sin(x)
    public static double sin(double x) {
        double rad_normalized = normalizeRad(x);
        double sin = 0;
        for (int i = 0; i < 10; i++) {
            sin += power(-1, i) * power(rad_normalized, 2 * i + 1) / factorial(2 * i + 1);
        }
        return sin;
    }

    // method to calculate cos(x) using Taylor series
    // @param x
    // @return cos(x)
    public static double cos(double x) {
        double rad_normalized = normalizeRad(x);
        double cos = 0;
        for (int i = 0; i < 10; i++) {
            cos += power(-1, i) * power(rad_normalized, 2 * i) / factorial(2 * i);
        }
        return cos;
    }

    // method to calculate tan(x) using Taylor series
    // @param x
    // @return tan(x)
    public static double tan(double x) {
        if (x == PI / 2 || x == -PI / 2) {
            throw new IllegalArgumentException("tan(x) is not defined for x = 90, 270");
        }
        return sin(x) / cos(x);
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
        System.out.println("sin(0) = " + sin(degToRad(0)));
        System.out.println("sin(90) = " + sin(degToRad(90)));
        System.out.println("sin(270) = " + sin(degToRad(270)));
        System.out.println("cos(0) = " + cos(degToRad(0)));
        System.out.println("cos(90) = " + cos(degToRad(90)));
        System.out.println("cos(270) = " + cos(degToRad(270)));
        System.out.println("tan(0) = " + tan(degToRad(0)));
        System.out.println("tan(90) = " + tan(degToRad(90)));
        System.out.println("tan(270) = " + tan(degToRad(270)));
    }
}
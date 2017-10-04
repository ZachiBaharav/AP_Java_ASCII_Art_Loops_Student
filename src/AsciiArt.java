
/**
 *
 * @author Dr. Baharav
 */
public class AsciiArt {

    /**
     *
     * @param n side of square
     * @return String to be printed
     *
     * Example: square(3)
     *
     * Printing square, n=3 ** ** **
     *
     */
    public static String square(int n) {

        String str = "";

        str += "Printing square, n=" + n + "\n";

        for (int rr = 1; rr <= n; ++rr) {
            for (int cc = 1; cc <= n; ++cc) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    /**
     *
     * @param n number of rows in triangle
     * @return String to be printed
     *
     * Example: lowerLeftTriangle(5) Printing lowerleft triangle, n=5
     *
     **
     ***
     ****
     *****
     */
    public static String lowerLeftTriangle(int n) {

        String str = "";

        str += "Printing lowerleft triangle, n=" + n + "\n";

        for (int rr = 1; rr <= n; ++rr) {
            for (int cc = 1; cc <= rr; ++cc) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    /**
     *
     * @param n number of rows in triangle
     * @return String to be printed
     *
     * Example: upperLeftTriangle(5) Printing upperleft triangle, n=5 **** ***
     * ** *
     *
     */
    public static String upperLeftTriangle(int n) {

        String str = "";

        str += "Printing upperleft triangle, n=" + n + "\n";

        for (int rr = 1; rr <= n; ++rr) {
            for (int cc = 1; cc <= n - rr + 1; ++cc) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    /**
     *
     * @param n number of rows in triangle
     * @return String to be printed
     *
     * Example: lowerRightTriangle(5) Printing lowerright triangle, n=5
     *
     **
     ***
     ****
     *****
     */
    public static String lowerRightTriangle(int n) {

        String str = "";

        str += "Printing lowerright triangle, n=" + n + "\n";

        for (int rr = 1; rr <= n; ++rr) {
            for (int cc = 1; cc <= n - rr; ++cc) {
                str += " ";
            }
            for (int cc = n - rr + 1; cc <= n; ++cc) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    /**
     *
     * @param n number of rows in triangle
     * @return String to be printed
     *
     * Example: upperRightTriangle(5) Printing upperright triangle, n=5 **** ***
     * ** *
     *
     */
    public static String upperRightTriangle(int n) {

        String str = "";

        str += "Printing upperright triangle, n=" + n + "\n";

        for (int rr = 1; rr <= n; ++rr) {
            for (int cc = 1; cc <= rr - 1; ++cc) {
                str += " ";
            }
            for (int cc = rr; cc <= n; ++cc) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    /**
     *
     * @param n number of rows in triangle
     * @return String to be printed
     *
     * Example: pyramid(5)
     *
     * Printing pyramid, n=5
     *
     ***
     *****
     *******
     *********
     */
    public static String pyramid(int n) {

        String str = "";

        str += "Printing pyramid, n=" + n + "\n";

        for (int rr = 1; rr <= n; ++rr) {
            for (int cc = 1; cc <= n - rr; ++cc) {
                str += " ";
            }
            for (int cc = 1; cc <= 2 * rr - 1; ++cc) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    /**
     *
     * @param strIn input string to be used
     * @return String to be printed
     *
     *
     * Example: upperLeftTriangle("Hello!")
     *
     * Printing String upperleft triangle, String=Hello!
     *
     * Hello! Hello Hell Hel He H
     */
    public static String upperLeftTriangle(String strIn) {

        String str = "";
        int l = strIn.length();

        str += "Printing String upperleft triangle, String=" + strIn + "\n\n";

        for (int rr = 1; rr <= l; ++rr) {
            str += strIn.substring(0, l - rr + 1);
            str += "\n";
        }
        return str;
    }

}

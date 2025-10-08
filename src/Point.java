public class Point {
    private static double x;
    private static double y;

    /**
     * Description.
     */

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Description.
     */

    public static double getPointX() {
        return x;
    }

    /**
     * Description.
     */

    public static double getPointY() {
        return y;
    }

    /**
     * Description.
     */

    public String toString() {
        return "Point[" + "x=" + x + ", y=" + y + ']';
    }
}
public abstract class Shape {
    protected static Point centerPoint;
    private static int count = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    /**
     * Description.
     */

    public static Point getPoint() {
        return centerPoint;
    }

    /**
     * Description.
     */

    public static Point getCenterPoint() {
        return centerPoint;
    }

    /**
     * Description.
     */

    public static int getShapeCount() {
        return count;
    }

    /**
     * Description.
     */

    public abstract String getInfo();
}

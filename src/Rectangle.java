public class Rectangle extends Shape {
    private double width;
    private double length;

    /**
     * Description.
     */

    public Rectangle() {
        super(centerPoint);
    }

    /**
     * Description.
     */

    public Rectangle(Point center, double width, double length) {
        super(center);
        this.width = width;
        this.length = length;
    }

    /**
     * Description.
     */

    @Override
    public String getInfo() {
        return "Rectangle - Center: " + centerPoint +
                ", Width: " + width + ", Height: " + length;
    }
}
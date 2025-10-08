class Circle extends Shape {
    private double radius;

    /**
     * Description.
     */

    public Circle() {
        super(centerPoint);
    }

    /**
     * Description.
     */

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    /**
     * Description.
     */

    @Override
    public String getInfo() {
        return "Circle - Center: " + centerPoint +
                ", Radius: " + radius;
    }
}

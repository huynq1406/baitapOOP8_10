class Square extends Shape {
    private double side;

    /**
     * Description.
     */

    public Square() {
        super(centerPoint);
    }

    /**
     * Description.
     */

    public Square(Point center, double side) {
        super(center);
        this.side = side;
    }

    /**
     * Description.
     */

    @Override
    public String getInfo() {
        return "Square - Center: " + centerPoint +
                ", Side: " + side;
    }
}

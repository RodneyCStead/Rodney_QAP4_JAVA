package Problem1;

class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    // Constructor
    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }


    // Getters and Setters
    public double getMajorAxis() {
        return this.majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return this.minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    // Calculations

    // Area of an ellipse
    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }

    // Perimeter of an ellipse
    @Override
    public double perimeter() {
        // Approximation
        return 2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2);
    }

    @Override
    public String toString() {
        return "Ellipse with major axis: " + majorAxis + " and minor axis: " + minorAxis;
    }
}

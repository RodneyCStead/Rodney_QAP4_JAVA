package Problem1;

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters and Setters
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculations

    // Area of a circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Perimeter of a circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // String representation of a circle
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}
package Problem1;

class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters and Setters
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Calculations 

    // Area of a triangle
    @Override
    public double area() {
        return (base * height) / 2;
    }

    // Perimeter of a triangle
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // String mehtod for triangle
    @Override
    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3 + " and base: " + base + " and height: " + height;
    }
}
package Problem1;


abstract public  class Shape {
    // Define abstract methods that all shapes must implement for area and perimeter
    public abstract double area();
    public abstract double perimeter();

    // Override the toString method to provide a string representation of the shape
    @Override
    public abstract String toString();
}
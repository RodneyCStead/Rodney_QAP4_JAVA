package Problem2;

// Super class shape
abstract public  class Shape {
    
    public abstract double area();
    public abstract double perimeter();

    // to string method
    @Override
    public abstract String toString();
}
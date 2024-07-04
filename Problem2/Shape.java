package Problem2;


abstract public class Shape implements Scalable {
    public abstract double area();
    public abstract double perimeter();
   
    @Override
    public abstract String toString();
}
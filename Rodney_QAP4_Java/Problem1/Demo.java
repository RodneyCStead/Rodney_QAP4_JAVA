package Problem1;

public class Demo {
    
    public static void main(String[] args) {
        // Create an instance of the Ellipse class
        Ellipse ellipse = new Ellipse(5, 3);

        System.out.println("");
        System.out.println("Testing Ellipse class:");
        System.out.println(ellipse);
        
        // Print the area of the ellipse and permiter of the ellipse
        System.out.println("Area of the ellipse: " + ellipse.area());
        System.out.println("Perimeter of the ellipse: " + ellipse.perimeter());

        // Testing setters and getters
        System.out.println("Setting and getting new values for the ellipse.");
        ellipse.setMajorAxis(10);
        System.out.println("New major axis: " + ellipse.getMajorAxis());
        ellipse.setMinorAxis(6);
        System.out.println("New minor axis: " + ellipse.getMinorAxis());
        System.out.println("Area of the new ellipse: " + ellipse.area());
        System.out.println("Perimeter of the new ellipse: " + ellipse.perimeter());

        // Create an instance of the Circle class
        Circle circle = new Circle(5);

        System.out.println("");
        System.out.println("Testing Circle class:");
        System.out.println(circle);

        // Print the area of the circle and permiter of the circle
        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Perimeter of the circle: " + circle.perimeter());

        // Testing setters and getters
        System.out.println("Setting and getting new values for the circle.");
        circle.setRadius(10);
        System.out.println("New radius: " + circle.getRadius());
        System.out.println("Area of the new circle: " + circle.area());
        System.out.println("Perimeter of the new circle: " + circle.perimeter());

        // Create an instance of the Triangle class
        Triangle triangle = new Triangle(3, 4, 5, 6, 8);

        System.out.println("");
        System.out.println("Testing Triangle class:");
        System.out.println(triangle);

        // Print the area of the triangle and permiter of the triangle
        System.out.println("Area of the triangle: " + triangle.area());
        System.out.println("Perimeter of the triangle: " + triangle.perimeter());

        // Testing setters and getters
        System.out.println("Setting and getting new values for the triangle.");
        triangle.setSide1(6);
        System.out.println("New side 1: " + triangle.getSide1());
        triangle.setSide2(8);
        System.out.println("New side 2: " + triangle.getSide2());
        triangle.setSide3(10);
        System.out.println("New side 3: " + triangle.getSide3());
        System.out.println("Area of the new triangle: " + triangle.area());
        System.out.println("Perimeter of the new triangle: " + triangle.perimeter());

        // Create an instance of the EquilateralTriangle class





        
    }
}

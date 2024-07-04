package Problem2;

public class Demo {

    public static void main(String[] args) {
        // Create instances of scalable shapes
        Circle circle = new Circle(5); 
        Ellipse ellipse = new Ellipse(3, 5); 
        Triangle triangle = new Triangle(3, 4, 5, 6, 7);
        EquilateralTriangle equalTriangle= new EquilateralTriangle(4); 

        // Display original 
        System.out.println("");
        System.out.println("Showing original shapes:");
        System.out.println("Original Circle measurements: " + circle);
        System.out.println("Original Ellipse measurements: " + ellipse);
        System.out.println("Original Triangle measurements: " + triangle);
        System.out.println("Original Equilateral Triangle measurements: " + equalTriangle);

        // Display original area and perimeter
        System.out.println("");
        System.out.println("Showing original areas:");
        System.out.println("Original Circle area: " + circle.area());
        System.out.println("Original Ellipse area: " + ellipse.area());
        System.out.println("Original Triangle area: " + triangle.area());
        System.out.println("Original Equilateral Triangle area: " + equalTriangle.area());

        System.out.println("");
        System.out.println("Showing original perimeters:");
        System.out.println("Original Circle perimeter: " + circle.perimeter());
        System.out.println("Original Ellipse perimeter: " + ellipse.perimeter());
        System.out.println("Original Triangle perimeter: " + triangle.perimeter());
        System.out.println("Original Equilateral Triangle perimeter: " + equalTriangle.perimeter());
        
        // Scale shapes by 2x
        double scaleFactor = 2.0;

        System.out.println("");
        System.out.println("Scaling shapes by factor of 2: ");

        // Scaled shapes
        circle.scale(scaleFactor);
        System.out.println("Scaled Circle measurements: " + circle); 
        ellipse.scale(scaleFactor);
        System.out.println("Scaled Ellipse measurements: " + ellipse);
        triangle.scale(scaleFactor);
        System.out.println("Scaled Triangle measurments: " + triangle);
        equalTriangle.scale(scaleFactor);
        System.out.println("Scaled Equilateral Triangle measurements: " + equalTriangle);
     
        // Display new dimensions
        System.out.println("");
        System.out.println("Showing new scaled shapes area: ");
        System.out.println("Scaled Circle area: " + circle.area());
        System.out.println("Scaled Ellipse area: " + ellipse.area());
        System.out.println("Scaled Triangle area: " + triangle.area());
        System.out.println("Scaled Equilateral area: " + equalTriangle.area());

        System.out.println("");
        System.out.println("Showing new scaled shapes perimeter: ");
        System.out.println("Scaled Circle perimeter: " + circle.perimeter());
        System.out.println("Scaled Ellipse perimeter: " + ellipse.perimeter());
        System.out.println("Scaled Triangle perimeter: " + triangle.perimeter());
        System.out.println("Scaled Equilateral perimeter: " + equalTriangle.perimeter());

        // end of test
        System.out.println("");
        System.out.println("End of test");
        System.out.println("");



    }
}

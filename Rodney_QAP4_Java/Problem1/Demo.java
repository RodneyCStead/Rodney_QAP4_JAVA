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



        
    }
}

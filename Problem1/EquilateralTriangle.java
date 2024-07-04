package Problem1;

class EquilateralTriangle extends Triangle {

    // Constructor for an equilateral triangle, takes sides set by triangle constructor
    public EquilateralTriangle(double side) {
        super(side, Math.sqrt(3) / 2 * side, side, side, side);
    }


    @Override
    public String toString() {
        return "EquilateralTriangle with side: " + getBase();
    }
}

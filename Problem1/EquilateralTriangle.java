package Problem1;

class EquilateralTriangle extends Triangle {

    // Constructor for an equilateral triangle, takes sides set by triangle constructor
    public EquilateralTriangle(double side) {
        super(side, Math.sqrt(3) / 2 * side, side, side, side);
    }

    // Getters and Setters
    public double getSide() {
        return getBase();
    }

    public void setSide(double side) {
        setBase(side);
        setHeight(Math.sqrt(3) / 2 * side);
        setSide1(side);
        setSide2(side);
        setSide3(side);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle with side: " + getBase();
    }
}
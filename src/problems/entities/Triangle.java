package problems.entities;

public class Triangle {
    private double sideX;
    private double sideY;
    private double sideZ;

    private double semiPerimeter;

    public Triangle(double sideX, double sideY, double sideZ) {
        this.sideX = sideX;
        this.sideY = sideY;
        this.sideZ = sideZ;
        this.semiPerimeter = (this.sideX + this.sideY + this.sideZ) / 2.0;
    }

    public double area() {
        double aux = semiPerimeter * (semiPerimeter - sideX) * (semiPerimeter - sideY) * (semiPerimeter - sideZ);
        return Math.sqrt(aux);
    }
}

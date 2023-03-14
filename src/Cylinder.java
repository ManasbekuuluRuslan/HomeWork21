import static java.lang.Math.PI;

public class Cylinder {
  private double radius;
  private double height;

    Cylinder(double radius, double height) throws Exception {
        if (radius < 0 || height < 0) {
            throw new Exception("Терс маанилерге жол берилбейт");
        }
        this.radius = radius;
        this.height = height;
    }

    double getArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

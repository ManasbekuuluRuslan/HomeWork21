public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    Parallelepiped(double length, double width, double height) throws Exception {
        if (length < 0 || width < 0 || height < 0) {
            throw new Exception("Терс маанилерге жол берилбейт");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    double getVolume() {
        return length * width * height;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

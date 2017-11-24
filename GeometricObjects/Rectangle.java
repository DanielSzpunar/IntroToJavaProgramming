public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight() {
        this.height = height;
    }
    public double getArea() {
        return this.height * this.width;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

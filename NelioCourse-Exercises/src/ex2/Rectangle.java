package ex2;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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

    public double rectangleArea() {
        return this.getHeight() * this.getWidth();
    }

    public double rectanglePerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    public double rectangleDiagonal() {
        return Math.sqrt((this.getHeight() * this.getHeight()) + (this.getWidth() * this.getWidth()));
    }
}

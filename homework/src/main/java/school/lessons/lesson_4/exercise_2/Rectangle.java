package school.lessons.lesson_4.exercise_2;

public class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void setColor(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public void printInfo() {
        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + fillColor);
        System.out.println("Border color: " + borderColor);
    }
}

package ex1;

public class Rectangle {

    //attributes
    private double l1;
    private double l2;

    //constructor
    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public static void stampTwoRectangles(Rectangle rectangle1, Rectangle rectangle2) {
        double sumPerimeter = rectangle1.calculatePerimeter() + rectangle2.calculatePerimeter();
        double sumArea = rectangle1.calculateArea() + rectangle2.calculateArea();
        System.out.println("The sum of the perimeters is: " + sumPerimeter);
        System.out.println("the sum of the areas is: " + sumArea);
    }

    //methods
    public double calculatePerimeter() {
        return (l1 + l2) * 2;
    }

    public double calculateArea() {
        return l1 * l2;
    }

    public void stampRectangle() {
        System.out.println("The rectangle perimeter is: " + calculatePerimeter() + ", the area is " + calculateArea());
    }

    //encapsulation
    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }
}

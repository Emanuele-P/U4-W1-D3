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

    //methods
    public double calculatePerimeter() {
        return (l1 + l2) * 2;
    }

    public double calculateArea() {
        return l1 * l2;
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

package ex1;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 10);

        System.out.println("1.1 Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Area " + rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle(6, 12);

        System.out.println("1.2 Perimeter: " + rectangle2.calculatePerimeter());
        System.out.println("Area " + rectangle2.calculateArea());
    }
}
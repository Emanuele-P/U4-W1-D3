package ex1;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 10);
        rectangle1.stampRectangle();

        Rectangle rectangle2 = new Rectangle(6, 12);
        rectangle2.stampRectangle();

        Rectangle.stampTwoRectangles(rectangle1, rectangle2);
    }
}
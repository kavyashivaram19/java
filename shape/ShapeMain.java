import java.util.Scanner;
abstract class Shape {
    int dim1, dim2;
    Shape(int d1, int d2) {
        dim1 = d1;
        dim2 = d2;
    }
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    Circle(int radius) {
        super(radius, radius);
    }
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        r.printArea();
        System.out.print("\nEnter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Triangle t = new Triangle(base, height);
        t.printArea();
        System.out.print("\nEnter radius of circle: ");
        int rad = sc.nextInt();
        Circle c = new Circle(rad);
        c.printArea();
    }
}

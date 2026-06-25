class Circle {

    double radius;

    // Default Constructor
    Circle() {
        this(1.0);
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class CircleDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        Circle c2 = new Circle(5);

        System.out.println("Area of Circle 1 = " + c1.area());

        System.out.println("Area of Circle 2 = " + c2.area());
    }
}
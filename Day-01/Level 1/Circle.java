import java.util.Scanner;
class Circle {
   private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        double area = calculateArea();
        double circumference = calculateCircumference();
        System.out.println("Circle with radius: " + radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.display();
      
    }
}

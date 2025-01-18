import java.util.Scanner;

public class Circle {
    private  double radius;
   //Default Constructor
    Circle() {
        // invoke parameterized Constructor using this and set default value
        this(2.0);
        System.out.println("Default Constructor Called");

    }
    //Parameterized Constructor
    Circle(double radius){
        System.out.println("Parametrized Constructor Called");
        this.radius=radius;
    }

    public static void main(String[] args) {
        Circle c1=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius= sc.nextInt();;
        Circle c2=new Circle(radius);
        }

    }


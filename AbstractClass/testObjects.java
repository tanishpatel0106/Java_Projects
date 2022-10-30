import java.util.Scanner;
public class testObjects {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CIRCLE");
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Enter the color of the circle: ");
        String color = input.next();
        System.out.println("Is the circle filled? (true/false): ");
        boolean filled = input.nextBoolean();
        circle c = new circle(radius, color, filled);
        System.out.println();
        System.out.println("RECTANGLE");
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = input.nextDouble();
        System.out.println("Enter the color of the rectangle: ");
        color = input.next();
        System.out.println("Is the rectangle filled? (true/false): ");
        filled = input.nextBoolean();
        rectangle r = new rectangle(width, height, color, filled);
        System.out.println();
        System.out.println("TRIANGLE");
        System.out.println("Enter the side 1 of triangle: ");
        double side1 = input.nextDouble();
        System.out.println("Enter the side 2 of triangle: ");
        double side2 = input.nextDouble();
        System.out.println("Enter the side 3 of triangle: ");
        double side3 = input.nextDouble();
        System.out.println("Enter the color of the triangle: ");
        color = input.next();
        System.out.println("Is the triangle filled? (true/false): ");
        filled = input.nextBoolean();
        triangle t = new triangle(side1, side2, side3, color, filled);
        System.out.println();
        System.out.println("Circle: ");
        c.disp();
        System.out.println();
        System.out.println("Rectangle: ");
        r.disp();
        System.out.println();
        System.out.println("Triangle: ");
        t.disp();
        System.out.println();
        input.close();
    }
}
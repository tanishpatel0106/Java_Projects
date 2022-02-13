import java.util.Scanner;
import java.lang.Math;

public class anglesfrompoints{
    public static void main(String args[]){
        double x1,y1,x2,y2,x3,y3,a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinate of point 1: ");
        x1 = input.nextDouble();
        System.out.print("Enter the y coordinate of point 1: ");
        y1 = input.nextDouble();
        System.out.print("Enter the x coordinate of point 2: ");
        x2 = input.nextDouble();
        System.out.print("Enter the y coordinate of point 2: ");
        y2 = input.nextDouble();
        System.out.print("Enter the x coordinate of point 3: ");
        x3 = input.nextDouble();
        System.out.print("Enter the y coordinate of point 3: ");
        y3 = input.nextDouble();
        double dist12 = Math.pow((Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)), 0.5);
        double dist23 = Math.pow((Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2)), 0.5);
        double dist13 = Math.pow((Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2)), 0.5);
        double a2 = Math.pow(dist23, 2);
        double b2 = Math.pow(dist13, 2);
        double c2 = Math.pow(dist12, 2);
        a = Math.acos((a2 - b2 - c2)/(-2*dist13*dist12));
        b = Math.acos((b2 - a2 - c2)/(-2*dist23*dist12));
        c = Math.acos((c2 - b2 - a2)/(-2*dist23*dist13));
        System.out.println("The angles of the triangle (in radians) are: " + a + " " + b + " " + c + " ");
        System.out.println("The angles of the triangle (in degrees) are: " + Math.toDegrees(a) + " " + Math.toDegrees(b) + " " + Math.toDegrees(c) + " ");
        input.close();
    }
}

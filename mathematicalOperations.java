import java.util.Scanner;

public class mathematicalOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        int a = in.nextInt();
        System.out.print("Enter a number B: ");
        int b = in.nextInt();
        int c;
        c = a+b;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("A + B = " + c);
        c = a-b;
        System.out.println("A - B = " + c);
        c = a*b;
        System.out.println("A * B = " + c);
        c = a/b;
        System.out.println("A / B = " + c);
        c = a%b;
        System.out.println("A % B = " + c);
        in.close();
    }
}

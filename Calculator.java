import java.lang.Math;
import java.util.Scanner;

public class Calculator {
    static void add(int a, int b) {
        System.out.println(a + b);
    }
    static void subtract(int a, int b) {
        System.out.println(a - b);
    }
    static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    static void divide(int a, int b) {
        System.out.println(a / b);
    }
    static void modulo(int a, int b) {
        System.out.println(a % b);
    }
    static void power(int a, int b) {
        System.out.println(Math.pow(a, b));
    }
    static void factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
    static void squareRoot(int a) {
        System.out.println(Math.sqrt(a));
    }
    static void cubeRoot(int a) {
        System.out.println(Math.cbrt(a));
    }
    static void log(int a) {
        System.out.println(Math.log(a));
    }
    static void log10(int a) {
        System.out.println(Math.log10(a));
    }
    static void sin(int a) {
        System.out.println(Math.sin(a));
    }
    static void cos(int a) {
        System.out.println(Math.cos(a));
    }
    static void tan(int a) {
        System.out.println(Math.tan(a));
    }
    static void asin(int a) {
        System.out.println(Math.asin(a));
    }
    static void acos(int a) {
        System.out.println(Math.acos(a));
    }
    static void atan(int a) {
        System.out.println(Math.atan(a));
    }
    static void sinh(int a) {
        System.out.println(Math.sinh(a));
    }
    static void cosh(int a) {
        System.out.println(Math.cosh(a));
    }
    static void tanh(int a) {
        System.out.println(Math.tanh(a));
    }
    static void exp(int a) {
        System.out.println(Math.exp(a));
    }
    static void ceil(int a) {
        System.out.println(Math.ceil(a));
    }
    static void floor(int a) {
        System.out.println(Math.floor(a));
    }
    static void round(int a) {
        System.out.println(Math.round(a));
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform: ");
        String operation = sc.next();
        switch (operation) {
            case "add":
                add(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
            case "modulo":
                modulo(a, b);
                break;
            case "power":
                power(a, b);
                break;
            case "factorial":
                factorial(a);
                break;
            case "squareRoot":
                squareRoot(a);
                break;
            case "cubeRoot":
                cubeRoot(a);
                break;
            case "log":
                log(a);
                break;
            case "log10":
                log10(a);
                break;
            case "sin":
                sin(a);
                break;
            case "cos":
                cos(a);
                break;
            case "tan":
                tan(a);
                break;
            case "asin":
                asin(a);
                break;
            case "acos":
                acos(a);
                break;
            case "atan":
                atan(a);
                break;
            case "sinh":
                sinh(a);
                break;
            case "cosh":
                cosh(a);
                break;
            case "tanh":
                tanh(a);
                break;
            case "exp":
                exp(a);
                break;
            case "ceil":
                ceil(a);
                break;
            case "floor":
                floor(a);
                break;
            case "round":
                round(a);
                break;
            default:
                System.out.println("Invalid operation");
        }
        sc.close();
    }
}

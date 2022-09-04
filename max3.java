import java.util.Scanner;

public class max3 {
    static int maxof3(int x, int y, int z){
        if(x>y && x>x){
            return x;
        }
        else if(y>x && y>z){
            return y;
        }
        else{
            return z;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();
        System.out.print("Enter number 3: ");
        int c = in.nextInt();
        System.out.println("The maximum of the three numbers is: " + maxof3(a,b,c));
        in.close();
    }
}

import java.util.Scanner;

public class greatestNumberTest {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int x = in.nextInt();
        System.out.print("Enter number 2: ");
        int y = in.nextInt();
        System.out.print("Enter number 3: ");
        int z = in.nextInt();
        if(x>y && x>z){
            System.out.println(x + " is the greatest number");
        }
        else if(y>x && y>z){
            System.out.println(y + " is the greatest number");            
        }
        else if(z>x && z>y){
            System.out.println(z + " is the greatest number");
        }
        in.close();
    }
}

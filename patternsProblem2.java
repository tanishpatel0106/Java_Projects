import java.util.Scanner;

public class patternsProblem2 {
    public static void main(String [] args) {
        String s1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s1 = in.nextLine();
        int l = s1.length();
        for(int i=1; i<=l; i++) {
            for(int j=1; j<=l-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print(s1.charAt(k-1));
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}

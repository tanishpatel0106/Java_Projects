import java.util.Scanner;
public class StarDesign {
public static void main(String args[]) {
    System.out.println("Enter the number :");
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i =1;i<=n;i++){
        int j;
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i =n-1;i>=1;i--){
        int j;
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
    }
}
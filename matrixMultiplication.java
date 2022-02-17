import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String [] args){
        Scanner matrixInput = new Scanner(System.in);
        System.out.println("SPECIFICATIONS FOR MATRIX A: ");
        System.out.print("Enter the number of rows you want in the matrix A: ");
        int r1 = matrixInput.nextInt();
        System.out.print("Enter the number of columns you want in the matrix A: ");
        int c1 = matrixInput.nextInt();
        System.out.println("SPECIFICATIONS FOR MATRIX B: ");
        System.out.print("Enter the number of rows you want in the matrix B: ");
        int r2 = matrixInput.nextInt();
        System.out.print("Enter the number of columns you want in the matrix B: ");
        int c2 = matrixInput.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        if(c1==r2){
            //Value entering for matrix one
            System.out.println("ENTER THE VALUES FOR MATRIX A: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print("Enter the element of: [" + (i+1) + "][" + (j+1) + "]: ");
                    a[i][j] = matrixInput.nextInt();
                }
            }
            //Value entering for matrix two
            System.out.println("ENTER THE VALUES FOR MATRIX B: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print("Enter the element of: [" + (i+1) + "][" + (j+1) + "]: ");
                    b[i][j] = matrixInput.nextInt();
                }
            }
            //Printing out Matrix One
            System.out.println("The Matrix A entered is: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            //Printing out Matrix Two
            System.out.println("The Matrix B entered is: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            //Multiplying the Matrices
            int sum = 0;
            int p[][] = new int[r1][c2];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<r2; k++){
                        sum = sum + a[i][k]*b[k][j];
                    }
                    p[i][j] = sum;
                    sum = 0;
                }
            }
            //Printing the multiplication Matrix
            System.out.println("The Product of the Matrices A & B in the order A*B is: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(p[i][j] + " ");
                }
                System.out.println();
            }
        }
        matrixInput.close();
    }
}

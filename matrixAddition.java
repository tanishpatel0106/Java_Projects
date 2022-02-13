import java.util.Scanner;
//MatrixAddition
public class matrixAddition{
    public static void main(String args []){
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
        if(r1==r2 && c1==c2){
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
            //Adding the matrices
            int sum[][] = new int[r1][c1];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    sum[i][j] = a[i][j]+b[i][j];
                }
            }
            //Subtracting the matrices (A-B)
            int diff1[][] = new int[r1][c1];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    diff1[i][j] = a[i][j]-b[i][j];
                }
            }
            //Subtracting the matrices (A-B)
            int diff2[][] = new int[r1][c1];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    diff2[i][j] = b[i][j]-a[i][j];
                }
            }
            //Printing the Sum Matrix
            System.out.println("Matrix A + Matrix B =");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
            //Printing the Difference Matrix 1
            System.out.println("Matrix A - Matrix B =");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(diff1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix B - Matrix A =");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    System.out.print(diff2[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            //Error if there is no two same order matrices
            System.out.println("Cannot add the matrices, check the dimensions of the matrix !!!");
        }
        matrixInput.close();
    }
}
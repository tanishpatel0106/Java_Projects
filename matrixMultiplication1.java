import java.util.Scanner;

class matrixMultiplication1 {
    public static void main(String [] args) {
        //A Program to multiply two matrices
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Rows of matrix A: ");
        int r1 = in.nextInt();
        System.out.print("Enter Columns of matrix A: ");
        int c1 = in.nextInt();
        System.out.print("Enter Rows of matrix B: ");
        int r2 = in.nextInt();
        System.out.print("Enter Columns of matrix B: ");
        int c2 = in.nextInt();
        if(r2 == c1){
            int [][] matrixA = new int[r1][c1];
            int [][] matrixB = new int[r2][c2];
            int i,j,k;
            for(i=0; i<r1; i++){
                for(j=0; j<c1; j++){
                    System.out.print("Enter element [" + i + "][" + j + "]");
                    matrixA[i][j] = in.nextInt();
                }
            }
            for(i=0; i<r2; i++){
                for(j=0; j<c2; j++){
                    System.out.print("Enter element [" + i + "][" + j + "]");
                    matrixB[i][j] = in.nextInt();
                }
            }
            System.out.println("The Matrix A is :");
            for(i=0; i<r1; i++){
                for(j=0; j<c1; j++){
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The Matrix B is :");
            for(i=0; i<r2; i++){
                for(j=0; j<c2; j++){
                    System.out.print(matrixB[i][j] + " ");
                }
                System.out.println();
            }
            int [][] matrixC = new int[r1][c2];
            for(i=0; i<r1; i++){
                for(j=0; j<c2; j++){
                    matrixC[i][j] = 0;
                    for(k=0;k<c1;k++){
                        matrixC[i][j] = matrixC[i][j] + (matrixA[i][k] + matrixB[k][j]);
                    }
                }
            }
            System.out.println("The Multiplied Matrix is :");
            for(i=0; i<r1; i++){
                for(j=0; j<c2; j++){
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Multiplication Invalid!! Columns of Matrix A does not equal Rows of Matrix B");
        }
        in.close();
    }
}
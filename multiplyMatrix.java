import java.util.Scanner;

public class multiplyMatrix {
    public static void main(String[] args){
        //A Program to multiply two matrices
        Scanner in = new Scanner(System.in);   
        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter element A["+i+"]["+j+"]: ");
                matrixA[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter element B["+i+"]["+j+"]: ");
                matrixB[i][j] = in.nextInt();
            }
        }
        int[][] matrixC = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrixC[i][j] = (matrixA[i][1] * matrixB[1][j]) + (matrixA[i][2] * matrixB[2][j]) + (matrixA[i][0] * matrixB[0][j]);
            }
        }
        System.out.println("The product of the two matrices is: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

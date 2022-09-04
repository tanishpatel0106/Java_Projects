import java.util.Scanner;

public class markovMatrixTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] matrixA = new int[3][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print("Enter element A["+i+"]["+j+"]: ");
                matrixA[i][j] = in.nextInt();
            }
        }
        int flag = 0;
        for(int i=0; i<2; i++){
            if(matrixA[i][0] + matrixA[i][1] + matrixA[i][2] == 1){
                flag++;
            }
        }
        if(flag == 3){
            System.out.println("The matrix is a Markov matrix");
        }
        else{
            System.out.println("The matrix is not a Markov matrix");
        }
        in.close();
    }
}

import java.util.Scanner;
public class percentageCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxmarks,per;
        System.out.print("Enter maximum marks possible: ");
        maxmarks = in.nextInt();
        int marks[] = new int[6];
        for(int i=0; i<6; i++){
            System.out.print("Enter Subject " + (i+1) + " marks: ");
            marks[i] = in.nextInt();    
        }
        per = 0;
        for(int j=0; j<6; j++){
            per = per + marks[j];
        }
        double per_f = ((double)per/(6*(double)maxmarks))*100;
        System.out.println("The percentage is: " + per_f + "%");
        in.close();
    }
}

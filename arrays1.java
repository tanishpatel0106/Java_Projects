import java.util.*;

public class arrays1 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int i, n;
            System.out.print("Enter value of n: ");
            n = in.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter " + n + " elements into the the array: ");
            for(i=0; i<n; i++){
                arr[i] = in.nextInt();
            }
            System.out.println(n + " elements of the array: ");
            for(i=0; i<n; i++){
                System.out.println(arr[i]);
            }
            in.close();
        }
    }
}

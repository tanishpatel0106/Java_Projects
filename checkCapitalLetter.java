// Checking Capital letter in string
import java.util.*;
public class checkCapitalLetter {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a string");
            String a, inp;
            String str[];
            char c;
            int count = 0, i;
            inp = sc.nextLine();
            str = inp.split(" ");
            for (i = 0; i < str.length; i++){
                a = str[i];
                c = a.charAt(0);
                if (Character.isUpperCase(c)){
                    count++;
                }
            }
            System.out.println(count);
            sc.close();
        }
    }
}

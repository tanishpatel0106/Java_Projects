import java.util.*;
public class CheckVowelUntilAsked {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int i, vow = 0, cons = 0;
        char x;
        while (true) {
            String str;
            System.out.println("Enter String :");
            str = sc.nextLine();
            if (str.equals("quit")) {
                break;
            } 
            else {
                for (i = 0; i < str.length(); i++) {
                    x = str.charAt(i);
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
                    vow++;
                else
                    cons++;
                }
                System.out.println("number of vowels : " + vow);
                System.out.println("number of consonant : " + cons);
                vow=0;
                cons=0;
            }
        }
        sc.close();
    }
}
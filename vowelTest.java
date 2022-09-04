import java.util.Scanner;

public class vowelTest {
    public static void main(String[] args) {
        int v=0, con=0;
        char x;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            x = s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                v++;
            }
            else{
                con++;
            }
        }
        System.out.println("Total vowels: " + v);
        System.out.println("Total consonants: " + con);
        in.close();
    }
}

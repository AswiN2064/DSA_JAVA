package Strings;
import java.util.*;
// Logic :
// Ascii("E" - "A" + "a") = Ascii("e")


public class convertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        upperToLower(str);
    }

    public static void upperToLower(String str) {
        char[] charr = str.toCharArray();

        for(int i = 0; i < charr.length; i++){
            char ch = charr[i];
            if(ch>='A' && ch <='Z') {
                char ansch = (char)(ch - 'A' + 'a');
                charr[i] = ansch;
            }
        }

        for(int i = 0; i < charr.length; i++){
            System.out.print(charr[i]);
        }
    }
}

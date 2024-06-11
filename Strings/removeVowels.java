package Strings;
import java.util.*;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Word: ");
        String str = sc.nextLine();

        remove_vowel(str.toLowerCase());
    }

    public static void remove_vowel(String str){
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }else{
                System.out.print(ch);
            }
        }
    }
}

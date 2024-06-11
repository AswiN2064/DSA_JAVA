package Strings;
import java.util.*;

public class reverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        reverse_vowels(str.toLowerCase());
    }

    public static void reverse_vowels(String str){
        char[] s = str.toCharArray();

        int i = 0;
        int j = s.length-1;
        while(i < j){
            while(isVowel(s[i]) == false){
                i++;
            }
            while(isVowel(s[j]) == false){
                j--;
            }

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        
        for(char ch:s){
            System.out.print(ch);
        }
    }

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }else{
            return false;
        }
    }
}

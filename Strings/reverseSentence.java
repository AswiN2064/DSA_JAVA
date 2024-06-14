package Strings;

public class reverseSentence {
    public static void main(String[] args) {
        String str = "My name is Nagaharipriyan";
        System.out.println(reverseSen(str));
    }

    public static String reverseSen(String str){
        String c = "";
        String out = "";
        // int counter = 0;
        for(int pointer = str.length()-1; pointer >= 0; pointer--){
            char ch = str.charAt(pointer);
            if(ch == ' '){
                out += reverseWord(c);
                out += ' ';
                c = "";
            } else {
                c += str.charAt(pointer);
            }
            if(pointer == 0){
                out += reverseWord(c);
            }
        }
        return out;
    }

    public static String reverseWord(String str){
        String out = "";
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            out = out + ch;
        }
        return out;
    }
}

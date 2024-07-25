package Stack;

import java.util.*;

public class sumString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inString = sc.nextLine();
        System.out.println(calculate_sum(inString));
    }

    public static int calculate_sum(String inputString){
        int sum = 0;
        boolean foundDecimal = false;
        boolean hasDigits = false;

        for (char ch : inputString.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (foundDecimal) {
                    continue;
                }
                sum += Character.getNumericValue(ch);
                hasDigits = true;
            } else if (ch == '.') {
                foundDecimal = true;
            }
        }

        if (!hasDigits || (foundDecimal && sum == 0)) {
            return -1;
        }
        
        return sum;
    }
}

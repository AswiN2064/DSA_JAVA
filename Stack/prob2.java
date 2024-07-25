package Stack;

import java.util.Scanner;

public class prob2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings and integer
        System.out.print("Enter the first string (instr1): ");
        String instr1 = scanner.nextLine();
        System.out.print("Enter the second string (instr2): ");
        String instr2 = scanner.nextLine();
        System.out.print("Enter the integer (innum): ");
        int innum = scanner.nextInt();

        StringBuilder outstr = new StringBuilder();
        int i = 0, j = 0;

        // Process innum characters from each string until one runs out
        while (i < instr1.length() && j < instr2.length()) {
            for (int k = 0; k < innum && i < instr1.length(); k++, i++) {
                outstr.append(instr1.charAt(i));
            }
            for (int k = 0; k < innum && j < instr2.length(); k++, j++) {
                outstr.append(instr2.charAt(j));
            }
        }

        // Add remaining characters from instr1
        while (i < instr1.length()) {
            outstr.append(instr1.charAt(i++));
        }

        // Add remaining characters from instr2
        while (j < instr2.length()) {
            outstr.append(instr2.charAt(j++));
        }

        // Print the output string
        System.out.println("Output string (outstr): " + outstr.toString());
    }
}

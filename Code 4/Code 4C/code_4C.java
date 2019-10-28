/**
 * @author nishant
 */

// String reverse, concat, equality, change case and other operations.

import java.util.*;

public class code_4C {
    public static void main(String[] args) {
        String m = "ron";
        String n = "weasley";
        String X = "ron_weasley";
        String Y = "";
        System.out.println("m = \"ron\"\nn = \"weasley\"\nX = \"ron_weasley\"\nY = \"\"");
        System.out.println("Concat: " + m.concat(n));
        System.out.println("Equals: " + m.equals(n));
        System.out.println("ToLowerCase: " + m.toLowerCase());
        System.out.println("ToUpperCase: " + m.toUpperCase());
        System.out.println("Split: " + Arrays.asList(X.split("\\_")));
        System.out.println("Length: " + X.length());
        for (int i = 0; i < X.length(); i++) {
            Y = Y + X.charAt(X.length() - i - 1);
        }
        System.out.println("Reverse: " + Y);
    }
}
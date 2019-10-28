/**
 * @author nishant
 */

// Use try, catch & throw

import java.util.*;

public class code_3A {
    public static void main(String[] args) {
        System.out.println("----Arithmetic Exception will be caught in catch block----");
        Scanner st = new Scanner(System.in);
        int m = 10;
        System.out.print("m/n: n = ");
        int n = st.nextInt();
        try {
            System.out.println("m/n = " + (m / n));
        } catch (ArithmeticException ex) {
            System.out.println("\nException: " + ex + "\ngetLocalizedMessage(): " + ex.getLocalizedMessage()
                    + "\ngetMessage(): " + ex.getMessage() + "\ntoString(): " + ex.toString());
        } catch (Exception ex) {
            System.out.println("\nException: " + ex);
        }
        st.close();
    }
}
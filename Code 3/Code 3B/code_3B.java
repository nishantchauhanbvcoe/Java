/**
 * @author nishant
 */

// create exception class

import java.util.*;

class myEx extends Exception {
    // If you do not specify JVM will do it for you.
    private static final long serialVersionUID = 1L;

    myEx(String ex) {
        super(ex);
        System.out.println(ex);
    }
}

public class code_3B {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("18+ content ahead! Your age: ");
        int n = st.nextInt();
        try {
            if (n < 18) {
                throw new myEx("\nWait for " + (18 - n) + " years!");
            } else
                System.out.println("lol");
        } catch (myEx ex) {
            System.out.println("**Access denied**");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            st.close();
        }
    }
}
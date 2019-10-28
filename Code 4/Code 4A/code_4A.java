/**
 * @author nishant
 */

// Abstract methods and Abstract Classes

import java.util.*;

// can have both abstract and non abstract methods, can extend interfaces and class
abstract class ron {
    ron() {
        System.out.println("Who is ron?");
    }

    abstract void lastname();

    void sister() {
        System.out.println("Ron Weasley has a sister Ginny weasley.");
    }
}

public class code_4A extends ron {
    void lastname() {
        System.out.println("Ron is a weasley.");
    }

    public static void main(String[] args) {
        code_4A ron = new code_4A();
        ron.lastname();
        ron.sister();
    }
}
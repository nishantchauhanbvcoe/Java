/**
 * @author nishant
 */

// Interfaces

import java.util.*;

// implements, can only extend interface
// 100% abstraction, only abstract methods, IS-A relationship,multiple inheritance
interface ron {
    int byear = 1980; // will be converted to public static final by compiler

    void lastname();
}

interface weasley {
    void sister();
}

interface ron_weasley extends ron, weasley {
    void birth();
}

public class code_4B implements ron_weasley {
    public void lastname() {
        System.out.println("Ron is a weasley.");
    }

    public void sister() {
        System.out.println("Ron Weasley has a sister Ginny weasley.");
    }

    public void birth() {
        System.out.println("Ron was born in " + byear);
    }

    public static void main(String[] args) {
        code_4B ron = new code_4B();
        ron.lastname();
        ron.sister();
        ron.birth();
    }
}
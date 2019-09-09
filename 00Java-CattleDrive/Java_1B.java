// Formatting is not necessary, but modify Java-1a so words are never split up. Assume that the console is 80 characters wide.

public class Java_1B {
    public static void main(String[] args) {
        // Specify length of line here
        int lineLen = 80;

        String printer = " ";
        if (args[0] != null)
            printer = args[0] + " ";
        else
            printer = "lol\t";

        int printerLen = printer.length();
        int lengthSync = printerLen;

        for (int i = 0; i++ < 100;) {
            if (lengthSync <= lineLen) {
                System.out.print(printer);
                lengthSync += printerLen;
            }
            else
            {
                System.out.print("\n" + printer);
                lengthSync = printerLen*2; // two times(*2) because one 'printer' is already printed
            }
        }
    }
}
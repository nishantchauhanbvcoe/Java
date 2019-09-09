// Write a program that will start with a double called sum set to zero. Add 0.1 to sum 1000 times by using a for loop.

public class Java_7 {
    public static void main(String[] args) {
        double result = 0.0;
        for (int i = 0; i < 1000; i++) {
            result += 0.1;
        }
        if(result == 100.0)
            System.out.print(result + "\nSum equals to 100.");
        else
            System.out.print(result + "\nSum is not equal to 100.");
    }
}
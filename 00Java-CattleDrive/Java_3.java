// Write a program that will read in a year and report if it is a leap year.
// 1.Any year that is divisible by 400 is definitely a leap year.
// 2.If it is not divisible by 400, then check if it is divisible by 100, if so, then it is NOT a leap year (even if it is divisible by 4), and
// 3.If the above two conditions are not satisfied we check for divisibility by 4, if it is divisible by 4 it is a leap year.

import java.util.*;

// Input can be read directly from the command line and then taken from 'args' array. 
public class Java_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Input Year: ");
        int inputYear = reader.nextInt();

        if (inputYear % 400 == 0)
            System.out.print(inputYear + " is an even year.");
        else if (inputYear % 100 == 0)
            System.out.print(inputYear + " is an odd year.");
        else if (inputYear % 4 == 0)
            System.out.print(inputYear + " is an even year.");
        else
            System.out.print(inputYear + " is an odd year.");

        reader.close();
    }
}

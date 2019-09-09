// Write a program that will read in a number from 0 to 99 and spell out that number. The program must also report any values that are out of range.

import java.util.*;

// Input can be read directly from the command line and then taken from 'args' array. 
public class Java_4A {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Input Number: ");
        int inputNumber = reader.nextInt();
        String zerototen[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String firstString[] = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

        if (inputNumber > 99 || inputNumber < 0) // Above 99 and less than 0
            System.out.print(inputNumber + " : Invalid!");
        else if (inputNumber <= 19) // For 0 to 19
            System.out.print(inputNumber + " : " + zerototen[inputNumber]);
        else if (inputNumber % 10 == 0) // Divisible by 10
            System.out.print(inputNumber + " : " + firstString[inputNumber / 10 - 2]);
        else
            System.out.print(inputNumber + " : " + firstString[(inputNumber - inputNumber % 10) / 10 - 2] + "-"
                    + zerototen[inputNumber % 10]);

        reader.close();
    }
}
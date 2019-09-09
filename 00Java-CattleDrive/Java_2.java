// Write a program that will read in a number from the command line and tell me if it is even or odd.

import java.util.Scanner;

// Input can be read directly from the command line and then taken from 'args' array. 
public class Java_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Input Number: ");
        int inputNumber = reader.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.print(inputNumber + " is an even number.");
        } else {
            System.out.print(inputNumber + " is an odd number.");
        }

        reader.close();
    }
}
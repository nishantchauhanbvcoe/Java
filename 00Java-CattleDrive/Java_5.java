// Write a program that (algorithmically) shows a times table.
//    0  1  2  
// 0  0  0  0
// 1  0  1  2
// 2  0  2  4

import java.util.*;

// Input can be read directly from the command line and then taken from 'args' array. 
public class Java_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Input Number: ");
        int inputNumber = reader.nextInt();
        for (int i = 0; i <= inputNumber; i++)
            System.out.print("\t" + i);
        for (int i = 0; i <= inputNumber; i++) {
            System.out.print("\n\n" + i);
            for (int j = 0; j <= inputNumber; j++) {
                System.out.print("\t" + i * j);
            }
        }

        reader.close();
    }
}
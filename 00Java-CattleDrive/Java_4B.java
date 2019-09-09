// Modify Java 4a so you can handle numbers as large as nine hundred ninety-nine billion, nine hundred ninety-nine million, nine hundred ninety-nine thousand, nine hundred ninety-nine.

import java.util.*;

// Input can be read directly from the command line and then taken from 'args' array. 
public class Java_4B {
    private static final String[] zerototen = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen" };
    private static final String[] firstString = { "ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety", "Hundred" };
    private static final String[] secondString = { "Thousand", "Lakh", "Crore", "Million", "Billion" };

    public static String zerotoX(int inputNumber, int inputLen, int[] inputNumArr, String outputString) {
        if (inputNumber <= 19)
            outputString += zerototen[inputNumber];
        else if (inputNumber % 10 == 0 && inputNumber <= 100)
            outputString += (firstString[inputNumber / 10 - 2]);
        else if (inputNumber < 100)
            outputString += (firstString[(inputNumber - inputNumber % 10) / 10 - 1] + "-"
                    + zerototen[inputNumber % 10]);
        else if (inputNumber < 1000)
            outputString += (zerototen[inputNumArr[inputLen - 3]] + "-hundred-" + zerotoX(
                    inputNumber - (100 * inputNumArr[inputLen - 3]), inputLen, inputNumArr, outputString));
        else if (inputNumber < 10000)
            outputString += (zerototen[inputNumArr[inputLen - 4]] + "-thousand-" + zerotoX(
                    inputNumber - (1000 * inputNumArr[inputLen - 4]), inputLen, inputNumArr, outputString));
        else if (inputNumber < 100000)
            outputString += (zerotoX(10 * inputNumArr[inputLen - 5] + inputNumArr[inputLen - 4], inputLen,
                    inputNumArr, outputString) + "-thousand-"
                    + zerotoX(inputNumber - (1000 * (10 * inputNumArr[inputLen - 5] + inputNumArr[inputLen - 4])),
                            inputLen, inputNumArr, outputString));

        else
            outputString = "lol";

        return outputString;
    }

    public static String executer(int inputLen, int inputNumber) {
        String outputString = "";
        char[] inputCharArr = ("" + inputNumber).toCharArray();
        int[] inputNumArr = new int[inputCharArr.length];
        for (int i = 0; i < inputLen; i++)
            inputNumArr[i] = Character.getNumericValue(inputCharArr[i]);

        int flag = 0;
        if (inputLen > 2) {
            for (int i = 1; i <= inputLen - 1; i++) // for numbers ending with only zeroes(1000, 400000...)
            {
                flag += (inputNumArr[i] == 0) ? 1 : 0;
                // System.out.println("\n" + flag + " " + inputNumArr[i]);
            }
            if (flag == inputLen - 1) {
                if (inputLen != 3) {
                    return inputLen % 2 == 0 ? (zerototen[inputNumArr[0]] + "-" + secondString[inputLen / 2 - 2])
                            : (firstString[inputNumArr[0] - 1] + "-" + secondString[(inputLen - 1) / 2 - 2]);
                } else
                    return ("ONE-HUNDRED");
            }
        }

        if (inputNumber < 0) // less than 0
            return (inputNumber + " : Invalid!");
        else if (inputNumber <= 100000) // 0 to 100000
            return zerotoX(inputNumber, inputLen, inputNumArr, outputString);
        else
            return "lol";
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Input Number: ");
        int inputNumber = reader.nextInt();
        int inputLen = String.valueOf(inputNumber).length();
        String outString = executer(inputLen, inputNumber);
        System.out.println("\n" + inputNumber + " : " + outString);

        reader.close();
    }
}
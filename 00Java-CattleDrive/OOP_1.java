// Write a program that tells you how many days old you are.

import java.util.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter.*;
import java.time.format.DateTimeFormatterBuilder;
import java.text.SimpleDateFormat;
import java.time.*;

// Input can be read directly from the command line and then taken from 'args' array. 
public class Java_8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] birthDate = new int[3];
        String dateString;
        String[] optionsInfo = { "Date Format: dd mm yyyy \nYour birth Date:", "Month: ", "Year: " };
        for (int i = 0; i < 3; i++) {
            System.out.print(optionsInfo[i]);
            birthDate[i] = reader.nextInt();
        }
        dateString = ((birthDate[0]<10 ? ("0" + birthDate[0]) : birthDate[0] )+ " " + (birthDate[1]<10 ? ("0" + birthDate[1]) : birthDate[1] )+ " " +birthDate[2]);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate d1 = LocalDate.parse(dateString, format);
        LocalDate d2 = LocalDate.parse(ZonedDateTime.now().format(format), format);
        long daysBetween = ChronoUnit.DAYS.between(d1, d2);

        System.out.print("\nNumber of days since your birth: " + daysBetween);

        reader.close();
    }
}
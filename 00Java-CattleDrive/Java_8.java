// Write a program that will show different time and date information based on what "code" you send it.

// ZonedDateTime.now().format(DateTimeFormatter.ofPattern("G yyyy-L-d E H:m:s z"))
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.*;

// Input can be read directly from the command line and then taken from 'args' array. 
public class Java_8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print(
                "0 - number of milliseconds since January 1, 1970\n1 - number of seconds since January 1, 1970\n2 - number of days since January 1, 1970\n3 - current date and time \n Your Choice:");
        int inputChoice = reader.nextInt();

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(1970, Calendar.OCTOBER, 1);
        long milliSecondsSinceEpoch = calendar.getTimeInMillis();
        long secondsSinceEpoch = milliSecondsSinceEpoch / 1000L;
        long minutesSinceEpoch = secondsSinceEpoch / 60L;

        switch (inputChoice) {
            case 0: {
                System.out.print("number of milliseconds since January 1, 1970: " + milliSecondsSinceEpoch);
                break;
            }
            case 1: {
                System.out.print("number of seconds since January 1, 1970: " + secondsSinceEpoch);
                break;
            }
            case 2: {
                System.out.print("number of days since January 1, 1970: " + minutesSinceEpoch);
                break;
            }
            case 3: {
                System.out.print("current date and time: "
                        + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("G yyyy-L-d E H:m:s z")));
                break;
            }
            default: {
                System.out.print("lol");
            }
        }
        reader.close();
    }
}
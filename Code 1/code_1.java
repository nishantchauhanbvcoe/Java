/**
 * @author nishant
 */

// FACTORIAL,  SUM AND AVERAGE,  PALINDROME,  PRIME
// FIBONACCI,  ARMSTRONG NUMBER TEST

import java.util.*;

public class code_1 {
  // FACTORIAL
  public static void factorial() {
    Scanner st = new Scanner(System.in);
    System.out.print(">>Input number for factorial: ");
    int n = st.nextInt();
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    System.out.println(">>Factorial of " + n + " is : " + result);
    st.close();
  }

  // SUM AND AVERAGE
  public static void sumandaverage() {
    Scanner st = new Scanner(System.in);
    System.out.print(">>Input number for sum and average: ");
    int n = st.nextInt();
    int sum = 0;
    int average = 1;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    average = sum / n;
    System.out.println(">>Sum of " + n + " numbers is : " + sum);
    System.out.println(">>Average of " + n + " numbers is : " + average);
    st.close();
  }

  // PALINDROME
  public static void palindrome() {
    Scanner st = new Scanner(System.in);
    System.out.print(">>Input number for palindrome: ");
    int n = st.nextInt();
    int divisor = 1;
    int copy = n;

    while (n / divisor >= 10) {
      divisor *= 10;
    }
    int checker = 1;
    while (n != 0) {
      int first = n / divisor;
      int last = n % 10;

      if (first != last) {
        System.out.println(">>Number " + copy + " is not a palindrome. ");
        checker = 0;
        break;
      }
      n = (n % divisor) / 10;
      divisor = divisor / 100;
    }
    if (checker == 1) {
      System.out.println(">>Number " + copy + " is a palindrome.");
    }
    st.close();
  }

  // PRIME
  public static void prime() {
    Scanner st = new Scanner(System.in);
    System.out.print(">>Input number for checking Prime: ");
    int n = st.nextInt();
    if (n <= 3 && n >= 0) {
      System.out.println(">>Number " + n + " is not prime. ");
    } else {
      int checker = 1;
      int i = 2;
      while (i < n) {
        if (n % i == 0) {
          System.out.println(">>Number " + n + " is not prime. ");
          checker = 0;
          break;
        }
        i += 1;
      }
      if (checker == 1) {
        System.out.println(">>Number " + n + " is prime.");
      }
    }
    st.close();
  }

  // FIBONACCI
  public static void fibonacci() {
    Scanner st = new Scanner(System.in);
    // First n Number of digits of fibonacci
    System.out.print(">>Input number for fibonacci: ");
    int n = st.nextInt();
    if (n >= 2) {
      int[] result = new int[n];
      result[0] = 0;
      result[1] = 1;
      for (int i = 2; i < n; i++) {
        result[i] = result[i - 2] + result[i - 1];
      }
      System.out.println(">>Fibonacci Series of " + n + " is : " + Arrays.toString(result));
    } else if (n == 1) {
      System.out.println(">>Fibonacci Series of " + n + " is : [0]");
    } else {
      System.out.println(">>Fibonacci Series not posible.");
    }
    st.close();
  }

  // ARMSTRONG NUMBER TEST
  public static void armstrong() {
    Scanner st = new Scanner(System.in);
    System.out.print(">>Input number for Armstrong test: ");
    int n = st.nextInt();
    if (n >= 0) {
      int result = 0;
      int copy = n;
      int len = Integer.toString(n).length();
      int[] nArr = new int[len];
      int i = 0;
      while (n > 0) {
        int d = n / 10;
        nArr[i] = n - d * 10;
        n = d;
        i++;
      }
      for (i = 0; i < len; i++) {
        result += Math.pow(nArr[i], len);
      }
      if (copy == result)
        System.out.println(">>Number " + copy + " is an Armstrong number!");
      else
        System.out.println(">>Number " + copy + " is NOT an Armstrong number!");
    } else {
      System.out.println(">>Number " + n + " is negative.");
    }
    st.close();
  }

  public static void main(String[] args) {
    System.out.print("------------     1    ------------\n");
    factorial();
    System.out.print("\n------------     2    ------------\n");
    sumandaverage();
    System.out.print("\n------------     3    ------------\n");
    palindrome();
    System.out.print("\n------------     4    ------------\n");
    prime();
    System.out.print("\n------------     5    ------------\n");
    fibonacci();
    System.out.print("\n------------     6    ------------\n");
    armstrong();
  }
}
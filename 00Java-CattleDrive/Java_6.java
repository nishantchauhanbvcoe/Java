// There once was a wise servant who saved the life of a princess. The king promised to pay whatever the servant could dream up. Knowing that the king loved chess, the servant told the king he would like to have grains of wheat. One grain on the first square of a chess board. Two grains on the next. Four on the third, and so on.
// There are 64 squares on a chessboard.

import java.math.BigInteger;

public class Java_6 {
    public static void main(String[] args) {
        System.out.println("GRAINS on each square:- ");
        for (int i = 1; i <= 64; i++) {
            BigInteger two = new BigInteger("2");
            BigInteger result = two.pow(i - 1);

            System.out.println("square " + i + ": " + result);
        }
    }
}
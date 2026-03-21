package logicbuilding.phase1.level1;

import java.util.stream.IntStream;

/**
 * 8. Print the sum of all odd numbers up to n.
 *
 * @author kamlesh patil
 */
public class P1L1Q8_SumOfOddNumbers {
    public static void main(String[] args) {
        int n = 10;
        int k = (n + 1) / 2;
        System.out.println("Sum is: " + k * k);
    }
}

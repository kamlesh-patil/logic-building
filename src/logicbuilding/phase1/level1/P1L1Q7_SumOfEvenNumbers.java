package logicbuilding.phase1.level1;

import java.util.stream.IntStream;

/**
 * 7. Print the sum of all even numbers up to n.
 *
 * @author kamlesh patil
 */
public class P1L1Q7_SumOfEvenNumbers {
    public static void main(String[] args) {
        int n = 10;
        int k = n / 2;
        System.out.println("Sum is: " + k * (k + 1));
    }
}

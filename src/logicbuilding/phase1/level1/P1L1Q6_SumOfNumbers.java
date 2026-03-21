package logicbuilding.phase1.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 6. Print the sum of first n natural numbers.
 *
 * @author kamlesh patil
 */
public class P1L1Q6_SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum;

        // Approach 1: Using loop (Time Complexity: O(n))
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum using loop: " + sum);

        // Approach 2: Using formula (Time Complexity: O(1))
        sum = n * (n + 1) / 2;
        System.out.println("Sum using formula: " + sum);

        // Approach 3: Using Java Streams (Time Complexity: O(n))
        sum = IntStream.rangeClosed(1, n).sum();
        System.out.println("Sum using streams: " + sum);

        sc.close();
    }
}

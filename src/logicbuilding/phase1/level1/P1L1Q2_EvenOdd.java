package logicbuilding.phase1.level1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. Check if a number is even or odd.
 *
 * @author kamlesh patil
 */
public class P1L1Q2_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}

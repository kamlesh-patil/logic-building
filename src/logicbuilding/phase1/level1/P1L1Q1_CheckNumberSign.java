package logicbuilding.phase1.level1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Take a number and print whether it’s positive, negative, or zero.
 *
 * @author kamlesh patil
 */
public class P1L1Q1_CheckNumberSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (number == 0) {
                System.out.println("Zero");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}

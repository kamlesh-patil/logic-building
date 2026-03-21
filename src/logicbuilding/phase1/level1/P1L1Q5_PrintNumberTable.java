package logicbuilding.phase1.level1;

import java.util.Scanner;

/**
 * 5. Print the table of a given number (n × 1 to n × 10).
 *
 * @author kamlesh patil
 */
public class P1L1Q5_PrintNumberTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + number + " = " + i * number + " ");
            }
        }
    }
}

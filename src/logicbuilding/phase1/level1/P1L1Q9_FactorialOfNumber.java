package logicbuilding.phase1.level1;

/**
 * 9. Print the factorial of a given number.
 *
 * @author kamlesh patil
 */
public class P1L1Q9_FactorialOfNumber {
    public static void main(String[] args) {
        int sum = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Using loop: " + sum);

        //using recursion
        sum = factorialOfNumber(n);

        System.out.println("Using recursion: " + sum);

        //Use BigInteger instead of int or long for very big numbers.
        //As internally it stores numbers as an array of integers,
        //not a fixed primitive type.
        //BigInteger can handle numbers of any size. The limit is only constrained by:
        //Available heap memory or Computation time
        //So there is no predefined maximum value. So when the number grows, Java simply allocates more memory.
    }

    private static int factorialOfNumber(int n) {
        if (n == 1) return 1;
        return factorialOfNumber(n - 1) * n;
    }
}

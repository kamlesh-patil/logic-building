package logicbuilding.phase1.level1;

/**
 * 10. Print the product of digits of a given number.
 *
 * @author kamlesh patil
 */
public class P1L1Q10_PrintProductOfDigits {
    public static void main(String[] args) {
        int n=25;
        String s = String.valueOf(n);
        int product=1;
        for(int i=0;i<s.length();i++){
            product*=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(product);
    }
}

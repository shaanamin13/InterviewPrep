import java.util.Scanner;

/**
 * Created by Shaan on 10/9/2015.
 */
public class StringManipulations {

    public static void main(String[] Args0) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder b = new StringBuilder();


        for (int i = A.length() - 1; i > -1; i--) {

            b.append(A.charAt(i));

        }

        String B = b.toString();

        if (A.equals(B)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}


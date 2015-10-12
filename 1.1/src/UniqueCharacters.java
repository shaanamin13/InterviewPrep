import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Shaan on 10/12/2015.
 */
public class UniqueCharacters {
    public static void main(String[] args0){
        Scanner in = new Scanner(System.in);

        String test = in.nextLine();

        System.out.println(isUnique(test));
    }

    public static boolean isUnique(String string){
        HashMap<Character, Integer> charMap = new HashMap<>();

        char[] test = string.toCharArray();


        for(int i = 0; i<test.length; i++){
            System.out.println(i);
            if(charMap.containsKey(test[i])) {
                return false;
            }
            else{
                charMap.put(test[i], 1);
            }
        }



        return true;

    }
}

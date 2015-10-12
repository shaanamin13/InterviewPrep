import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Shaan on 10/12/2015.
 */
public class PermutationCheck {
    public static void main(String[] args0){
        Scanner in = new Scanner(System.in);

        String test = in.nextLine();
        String test2 = in.nextLine();

        System.out.println(isPermutation(test, test2));
    }

    public static boolean isPermutation(String string, String string2){
        HashMap<Character, Integer> charMap = new HashMap<>();

        char[] test = string.toCharArray();
        char[] test2 = string2.toCharArray();

        if(test.length != test2.length){
            return false;
        }


        for(int i = 0; i<test.length; i++){

            if(charMap.containsKey(test[i])) {
                charMap.put(test[i], charMap.get(test[i]) + 1);
            }
            else{
                charMap.put(test[i], 1);
            }
        }

       for(int i = 0; i<test2.length; i++){
           if(charMap.containsKey(test2[i])){
               System.out.println(test2[i]);
               if(charMap.get(test[i]) == 0){
                   return false;
               }
               charMap.put(test[i], charMap.get(test[i]) - 1);

           }
           else {
               return false;
           }
       }


        return true;

    }
}

import java.util.Scanner;

/**
 * Created by Shaan on 10/12/2015.
 */
public class replaceSpaces {

    public static void main(String[] args0){

        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        mutateString(String string);

    }

    public static String mutateString(String mutateThis){
        char[] replaceString = mutateThis.toCharArray();
        int spaceCount = 0;

        for(int i = 0; i<replaceString.length; i++){
            if(replaceString[i] == ' '){
                spaceCount++;
            }
        }

        int newLength = replaceString.length + (spaceCount * 2);

        for(int i = replaceString.length ; i>=0; i--){
            if(replaceString[i] == ' '){
                replaceString[newLength -1]= '0';
                replaceString[newLength -2]= '2';
                replaceString[newLength - 3] = '%';

                newLength = newLength - 3;
            }


        }


    }
}

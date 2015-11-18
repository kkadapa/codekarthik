import java.util.Arrays;

/**
 * Created by Spectre on 11/17/15.
 */
public class UniqueCharsInArray {

    public static void main(String[] args) {

        System.out.println(isUniqueChars2("karthik"));
    }

    private static boolean isUniqueChars2(String str) {

        if (str.length() > 256) return false;

        boolean [] char_set = new boolean[256];

        for (int i=0;i<str.length();i++) {

        int val = str.charAt(i);

        if (char_set[val]){
            return false;
        }
            char_set[val] = true;
        }

    return true;
    }
}

/**
 * Created by Spectre on 11/18/15.
 */
public class compressString {

    public static void main(String[] args) {

        System.out.println(badString("aabcccccaaa"));
    }

    private static String badString(String str) {

    String mystr = "";

        char last = str.charAt(0);

        int count = 1;

        for (int i=1;i<str.length();i++){

            if (str.charAt(i) == last) {
                count++;

            } else { //insert char count, and update last char

                mystr += last + "" + count;
                last = str.charAt(i);
                count = 1;

            }
        }
        return mystr + last + count;
    }
}

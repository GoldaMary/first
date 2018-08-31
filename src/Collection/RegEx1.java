package Collection;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/20/18.
 */
public class RegEx1 {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[\\D]{6}","aaaaaa"));
        System.out.println(Pattern.matches("[@&%]","@"));

        //System.out.println(Pattern.matches("[a-z]+[0-9]{10}","al23456979")); //pswd created
       // System.out.println(Pattern.matches("[1][2][a-zA-Z0-9$@%&]","12ghytf@")); // 1st nd 2nd digit should be 1 nd 2

        System.out.println(Pattern.matches("[a-zA-Z0-9@#$%&]+[@][a-zA-Z]+[.][c][o][m]","golduz315@gmail.com"));
        System.out.println(Pattern.matches("[+][9][1][[0-9]+]{10}","+918281944003"));
    }
}

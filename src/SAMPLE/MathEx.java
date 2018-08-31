package SAMPLE;
import static java.lang.Math.*;
import java.util.Random;
/**
 * Created by expert on 7/26/18.
 */
public class MathEx {

    public static void main(String[] args) {
        System.out.println(abs(-10)); //Math.abs if there is no import stmt
        System.out.println(acos(-1));
        System.out.println(asin(1));
        System.out.println(max(10,12));
        Random random=new Random();
        int i=random.nextInt(10);
        System.out.println(i);
    }
}

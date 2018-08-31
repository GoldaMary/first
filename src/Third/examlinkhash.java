package Third;
import java.util.*;
/**
 * Created by expert on 7/12/18.
 */
public class examlinkhash {
    public static void main(String[] args) {

        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("ann");
        set.add("ammu");
        set.add("abc");
        set.add("seema");
        set.add("malu");
        set.add("manu");

        for(String obj:set){

            System.out.println(obj);
        }
    }
}

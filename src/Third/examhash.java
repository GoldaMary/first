package Third;

import java.util.HashSet;

/**
 * Created by expert on 7/12/18.
 */
public class examhash {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        set.add("ann");
        set.add("ammu");
        set.add("abc");
        set.add("manu");

        for(String obj:set){

            System.out.println(obj);
        }
    }
}

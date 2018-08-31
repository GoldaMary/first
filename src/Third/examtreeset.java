package Third;

import java.util.*;

/**
 * Created by expert on 7/12/18.
 */
public class examtreeset {
    public static void main(String[] args) {

        TreeSet<String> set=new TreeSet<>(); //we get result as ascending order
        set.add("maala");
        set.add("sanu");
        set.add("ann");
        set.add("chinju");

        for(String obj:set){

            System.out.println(obj);
        }
    }
}

package Collection;

import java.util.ArrayDeque;

/**
 * Created by expert on 7/19/18.
 */
public class collEx {

    public static void main(String[] args) {

        ArrayDeque<String> obj=new ArrayDeque<>();
        obj.addFirst("anu");
        obj.addLast("ammu");
        obj.add("sanu");
        obj.add("anna");
        obj.add("manju");
        System.out.println("head "+obj.peek()); //returns the first element
        System.out.println("removed first "+obj.pollFirst()); //remove and return
        //first element and returns null if empty
        System.out.println("remove last "+obj.pollLast()); //remove and return
        //last element returns null if empty
        System.out.println("after removal "+obj);
        System.out.println(obj.remove()); //remove first
        System.out.println(obj.removeFirst()); //remove and return first element
        System.out.println(obj.removeLast()); //remove and return last element
        System.out.println(obj);
    }
}

package Third;

import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Examplee {
    public static void main(String[] args) {

        LinkedList<String> Linked=new LinkedList<>();
        Linked.add("Sam");
        Linked.add("Anu");
        Linked.addFirst("Chinju");
        Linked.addLast("Anju");

        Linked.removeLast();
        Linked.remove(2);
        Linked.remove("Anu");
        for(String obj:Linked){

            System.out.println(obj);
        }
    }
}

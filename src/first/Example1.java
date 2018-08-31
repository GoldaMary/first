package first;
import java.util.*;
/**
 * Created by expert on 7/10/18.
 */
public class Example1 {
    public static void main(String[] args) {
        //general declaration
        ArrayList<String> al=new ArrayList<>();
        al.add("Golda");
        al.add("Chinju");
        al.add("Elizabeth");
        for(String obj:al){
            System.out.println(obj);
        }
//        List<String> al1=new ArrayList<>();
//        ArrayList<String>al2=new ArrayList<String>();
        ArrayList<Integer> b2=new ArrayList<>();
        b2.add(1);
        b2.add(5);
        for(Integer obj1:b2){
            System.out.println(obj1);
        }
         Iterator itr=al.iterator();//To iterate
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(int i=0;i<al.size();i++){ //size is used to get length
            System.out.println(al.get(i));// index based iteration
        }
        ArrayList<String> a1=new ArrayList<>();
        a1.add("apple");
        a1.add("orange");
        a1.add("grape");
        al.addAll(2,a1); //merging arrays
        al.remove("Golda");
        al.remove(3);
        for(String obj3:al){
            System.out.println(obj3);
        }
        }
    }


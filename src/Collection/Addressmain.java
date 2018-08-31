//package Collection;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by expert on 7/17/18.
// */
//public class Addressmain {
//
//    public static void main(String[] args) {
//
//        HashMap<Integer,AddressBook> hmap=new HashMap<>();
//        hmap.put(1,new AddressBook(101,"ann",23456));
//        hmap.put(2,new AddressBook(102,"mariya",98765));
//
//        for(Map.Entry<Integer,AddressBook> obj:hmap.entrySet()){
//            System.out.println("House no: "+obj.getKey());
//            AddressBook ab=obj.getValue();
//            System.out.println("name :"+ab.name+" phone no: "+ab.phoneno);
//        }
//
//        AddressBook.delete(101,hmap);
//
//        for(Map.Entry<Integer,AddressBook> obj:hmap.entrySet()){
//
//            System.out.println("Houseno: "+obj.getKey());
//            AddressBook ab=obj.getValue();
//            System.out.println("name: "+ab.name+" phoneno: "+ab.phoneno);
//        }
//    }
//}

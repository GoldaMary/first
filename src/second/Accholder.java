//package second;
//
//import java.util.ArrayList;
//
///**
// * Created by expert on 7/11/18.
// */
//public class Accholder extends Bank {
//
//    int accno;
//    String name;
//    float amount;
//
//    public Accholder(String bankname,int ifsc,String branch,int accno, String name, float amount) {
//        super(bankname,ifsc,branch);
//        this.accno = accno;
//        this.name = name;
//        this.amount = amount;
//    }
//    public static void display(ArrayList<Accountholder>ah){
//
//        for(Accountholder obj:ah){
//
//
//            System.out.println("Bankname:  "+obj.bankname+" IFSC:  "+obj.ifsc+" Branch:  "+obj.branch+" Account no: "+obj.accno+"  Accountholder: "+obj.name+"  Amount: "+obj.amount);
//        }}
//    public static void display(int accno,ArrayList<Accountholder>ah){
//        for(Accountholder obj:ah) {
//            if (obj.accno == accno) {
//                System.out.println("Accno: " + accno + " name: " + obj.name + " Amount: " + obj.amount);
//            }
//
//        }
//
//    }
//
//    public static void deposit(int accno,int amount,ArrayList<Accountholder>ah){
//
//        for(Accountholder obj:ah){
//            if(obj.accno==accno){
//                obj.amount+=amount;
//                System.out.println("Accno: "+obj.accno+" Balance: "+obj.amount);
//            }
//        }
//    }
//
//
//    public static void retrieve(int accno,int amount,ArrayList<Accountholder>ah){
//        for(Accountholder obj:ah){
//            if(obj.accno==accno){
//                obj.amount-=amount;
//                System.out.println("Accno: "+obj.accno+" Balance: "+obj.amount);
//            }
//        }
//
//    }
//    public static void remove(int accno,ArrayList<Accountholder>ah){
//        for(Accountholder obj:ah){
//            if(obj.accno==accno){
//                ah.remove(obj);
//                break;
//            }
//            Iterator itr=ah.iterator(); //to iterator
//            while(itr.hasNext()){ // point to the next element
//               Accholder obj1=(Employee)itr.next(); //typecasting
//        }
//    }
//
//    public static void main(String[] args) {
//        Accountholder a=new Accountholder("SBI",1111,"kottayam",1000,"Angel",5000f);
//        Accountholder a1=new Accountholder("Federal",2222,"Ekm",2000,"Ram",900f);
//        Accountholder a2=new Accountholder("Axis",3333,"Alapuzha",3000,"anju",40021f);
//
//        ArrayList<Accountholder>ah=new ArrayList<>();
//        ah.add(a);
//        ah.add(a1);
//        ah.add(a2);
//        display(ah);
//        display(2000,ah);
//        deposit(1000,10,ah);
//        retrieve(3000,10,ah);
//    }
//}
//
//

//package second;
//
///**
// * Created by expert on 7/4/18.
// */
//public class Account extends Bank{
//    int accno;
//    String name;
//    float amt;
//
//    public Account(String bankname,int ifc,String branch ,int accno, String name, float amt) {
//        super(bankname,ifc,branch);
//        this.accno = accno;
//        this.name = name;
//        this.amt = amt;
//    }
//    public void display(Account[] accarray){
//
//        for(Account obj:accarray){
//            System.out.println("bankname: "+obj.bankname+"ifc: "+obj.ifc+"branch: "+obj.branch+"accno: "+obj.accno+"name: "+obj.name+"amt: "+obj.amt+);
//
//        }
//    }
//    public static void display(int accno,Account[] accarray){
//
//        for(Account obj:accarray){
//            if(obj.accno=accno){
//                System.out.println("accno: "+accno+"name: "+obj.name+"amt: "+obj.amt);
//            }
//        }
//    }
//
//    public static void deposit(int accno,int amt,Account[] accarray){
//
//        for(Account obj:accarray){
//            if(obj.accno==accno){
//                obj.amt+=amt;
//                System.out.println("accno: "+obj.accno+"balance: "+obj.amt);
//            }
//        }
//    }
//    public static void retrive(int aacno,int amt,Account[] accarray){
//        for(Account obj:accarray){
//            if(obj.accno==accno){
//                obj.amt-=amt;
//                System.out.println()
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Account a=new Account("SBI",123,"kannur",501,"Ammu",5000);
//        Account a1=new Account("Federal",456,"calicut",225,"Gloria",10000);
//        Account a2=new Account("Canara",555,"Mumbai",555,"Sibin",25000);
//        Account accarray[]={a,a1,a2};
//        for(Account obj:accarray){
//            obj.display();
//
//        }
//    }
//}

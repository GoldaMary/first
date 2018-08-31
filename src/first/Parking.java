package first;

import java.util.ArrayList;

/**
 * Created by expert on 7/11/18.
 */
public class Parking {
    int type;
    String slotname;
    int time;

    public Parking(int type, String slotname, int time) {
        this.type = type;
        this.slotname = slotname;
        this.time = time;
    }

    public static void display(ArrayList<Parking>p){
        for(Parking obj:p){
            System.out.println(obj.slotname);
        }
    }
     public static void addVechicle(ArrayList<Parking>p,Parking obj){
        if(p.size()<3){
            p.add(obj);
        }
        else{
            System.out.println("All slots are occupied");
        }
     }
     public static void remove(ArrayList<Parking>p,String slotname){
         for(Parking obj:p){
             if(obj.slotname==slotname){
                 int amt=obj.time*10;
                 System.out.println("Slotno "+obj.slotname+"Amount="+amt);
                 p.remove(obj);
                 break;
             }
         }
     }
}

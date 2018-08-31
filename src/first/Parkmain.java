package first;

import java.util.ArrayList;

/**
 * Created by expert on 7/11/18.
 */
public class Parkmain {
    public static void main(String[] args) {

        Parking p1 = new Parking(2, "101", 2);
        Parking p2 = new Parking(2, "105", 5);
        Parking p3 = new Parking(2, "103", 3);
        Parking p4 = new Parking(2, "104", 6);

        ArrayList<Parking> parking2=new ArrayList<>();
        Parking.addVechicle(parking2,p1);
        Parking.addVechicle(parking2,p2);
        Parking.addVechicle(parking2,p3);
        Parking.addVechicle(parking2,p4);

        Parking.remove(parking2,"103");
        Parking.display(parking2);
    }
}

package Collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

/**
 * Created by expert on 8/13/18.
 */
public class Studarrayfile {

    public static void main(String[] args) throws IOException {


        BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
        String str;
        ArrayList<Stud> li=new ArrayList();
        while ((str=br.readLine())!=null){
            String x[]=str.split(",");
            li.add(new Stud(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));
        }
        for(Stud al:li){
            System.out.println("rollno: "+al.rollno+ "name: "+al.name+ "marks: "+al.marks);
        }

    }
}

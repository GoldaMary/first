package first;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 7/10/18.
 */
public class Empmain {
    public static void main(String[] args) {

        Employee emp1=new Employee("ammu",2000,"cse");
        Employee emp2=new Employee("kavya",25000,"ece");
        ArrayList<Employee> e1=new ArrayList<>();
        e1.add(emp1);
        e1.add(emp2);
//         for(Employee obj:e1){
//             System.out.println(obj.empname+" "+obj.salary+" "+obj.dept);
//         }
        Iterator itr=e1.iterator(); //to iterator
        while(itr.hasNext()){ // point to the next element
            Employee obj1=(Employee)itr.next(); //typecasting
            if(obj1.empname.equals("ammu")){

                e1.remove(obj1);
                break;
            }
            System.out.println(obj1.empname+" "+obj1.salary+" "+obj1.dept);
        }
    }
}

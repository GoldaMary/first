package second;
import java.util.Scanner;
/**
 * Created by expert on 6/27/18.
 */
public class employee
{
    public int add(int x,int y)
    {
       return x+y;
    }
    public static void main(String[] args)
    {
        department d=new department(1,"CSE");
        d.details();
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        System.out.println("read value from console");
        int a=s1.nextInt();
        int b=s2.nextInt();
        //System.out.println(a);
        employee e=new employee();
        System.out.println(e.add(a,b));
        //System.out.println(a);
    }
}

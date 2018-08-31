package second;

/**
 * Created by expert on 7/4/18.
 */
public class Faculty extends Department {
    int facid;
    String name;

    public Faculty(int deptid,String deptname,int facid, String name) {
        super(deptid,deptname);
        this.facid = facid;
        this.name = name;
    }
    public void printdetails(){
        System.out.println("deptid:"+super.deptid+"deptname:"+super.deptname+"facid"+facid+"fac name:"+name);
    }

    public static void main(String[] args) {
        Faculty f=new Faculty(101,"cse",11,"Anu");
        f.printdetails();
    }
}

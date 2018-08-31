package Third;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

/**
 * Created by expert on 7/12/18.
 */
public class Student implements Comparable<Student> {


    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        TreeSet<Student> obj=new TreeSet<Student>();
        obj.add(new Student(1,"ann",20));
        obj.add(new Student(2,"Sanu",21));
        obj.add(new Student(3,"malu",19));

        for(Student o:obj){
            System.out.println(o.rollno);
        }
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (rollno > o.rollno) {
            return 1;

        } else if (rollno < o.rollno) {
            return -1;
        } else {
            return 0;
        }

    }
}

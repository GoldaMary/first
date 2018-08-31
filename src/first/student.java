package first;

/**
 * Created by expert on 6/27/18.
 */
public class student {
    int rollno;
    String name;
    student(int no, String names) {
        rollno = no;
        name = names;
        display();
    }
     void display(){
         System.out.println(rollno+" "+name);
     }
    public static void main(String[] args) {
        student s = new student(10,"golda");
    }
}

package second;

/**
 * Created by expert on 7/3/18.
 */
public class PolyExample {
    //method overloading
    public void display(){
        System.out.println("dispaly function");
    }
    public void display(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        PolyExample p=new PolyExample();
        p.display();
        p.display("hello");
    }
}

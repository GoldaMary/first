package first;

/**
 * Created by expert on 7/6/18.
 */
public class ExceptionEx {

    public static void main(String[] args) {

        String s=null;
        try{

            s.length();
            int y=2/0;
        }catch(ArithmeticException e){
            System.out.println("exception caught");
        }
        catch(NullPointerException e){
            System.out.println("nullpointer exception");
        }
        System.out.println("rest of the code");
    }
}

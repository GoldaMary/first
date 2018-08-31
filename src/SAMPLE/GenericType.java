package SAMPLE;

/**
 * Created by expert on 8/31/18.
 */
public class GenericType<T> {

    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t=t;
    }

    public static void main(String[] args) {

        GenericType<String>type=new GenericType<>();
        type.set("Ann");
        String str=type.get();
        System.out.println(str);
    }
}

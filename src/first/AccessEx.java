package first;

/**
 * Created by expert on 7/5/18.
 */
public class AccessEx {

    public AccessEx(){

    }
    protected int a=10;
    private int c=14;
    int b=12;
    private String name;

  public void setName(String name){
      this.name=name;
  }
  public String getName(){
      return name;
  }

    public static void main(String[] args) {
        AccessEx ob=new AccessEx();
        //System.out.println(ob.a);

    }
}

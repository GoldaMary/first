package SAMPLE;

/**
 * Created by expert on 7/26/18.
 */
public class RecursiveEx {

    public static int getFibinocci(int n){

        if(n==1){
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return(getFibinocci(n-1)+getFibinocci(n-2));
    }

    public static void main(String[] args) {
        System.out.println(getFibinocci(5));
    }
}

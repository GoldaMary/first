package SAMPLE;
import java.util.*;
/**
 * Created by expert on 7/26/18.
 */
public class Recurfactorial {

    static int factorial(int n){

        if(n==0)
            return 1;
        else
            return (n*factorial(n-1));
        }

    public static void main(String[] args) {
        System.out.println("Enter the Number"); // console input
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(factorial(num));
       // System.out.println(factorial(5)); manuel input
    }

    }


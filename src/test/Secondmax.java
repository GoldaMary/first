package test;

import java.util.ArrayList;

/**
 * Created by expert on 8/14/18.
 */
public class Secondmax {

    public static void main(String[] args) {

        //int max=0;
        //int smax=0;
        int a[]={56,9,1,99,10,23,55,45};
//        max=a[0];
//
//        for (int i=0;i<a.length;i++){
//            if (a[i]>max){
//                smax=max;
//                max=a[i];
//            }
//        }
//        System.out.println(max);
//        //System.out.println(smax);
//
//
//

        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i=0;i<a.length/2;i++){
            arr1.add(a[i]);
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for (int i =(a.length/2);i<a.length;i++){
            arr2.add(a[i]);
        }

        System.out.println("first half" +arr1);
        System.out.println("second haif" +arr2);
      }
    }


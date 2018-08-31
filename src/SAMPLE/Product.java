package SAMPLE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by expert on 8/29/18.
 */
public class Product {

    int ptd;
    int price;
    String name;

    public Product(int ptd, int price, String name) {
        this.ptd = ptd;
        this.price = price;
        this.name = name;
    }

    public static void main(String[] args) {
        Product p1=new Product(1,500,"chair");
        Product p2=new Product(2,2000,"table");
        ArrayList<Product> al=new ArrayList<>();
        al.add(p1);
        al.add(p2);
        Stream<Product> s=al.stream();
        ArrayList<String> pl=new ArrayList<>();
        s.filter(z->z.price>1000).map(z->z.name).collect(Collectors.toList());//.forEach(z->{
           // System.out.println(z.ptd+" "+z.price+" "+z.name);
        //});
        System.out.println(pl);
        System.out.println("*******************");
        pl.stream().forEach(z->{
            System.out.println(z);
        });

    }
}

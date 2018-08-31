package Third;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Book {
    String name;
    float price;
    String author;

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args) {

        Book b1=new Book("twostates",100,"Chetanbhagath");
        Book b2=new Book("radamoozham",150,"MD");

        LinkedList<Book> b=new LinkedList<>();
        b.add(b1);
        b.add(b2);

        for(Book obj:b) {

            if (b.contains(b1)) {

                b1.price+=20;
            }
            System.out.println("Name: " + obj.name + "Price: " + obj.price + "Author: " + obj.author);

        }
    }
}

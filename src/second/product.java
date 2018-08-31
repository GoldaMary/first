package second;

/**
 * Created by expert on 7/3/18.
 */
public class product {
    int id;
    String name;
    float price;

    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] agrs) {
        product p = new product(1, "sari", 1300);
        product p1 = new product(2, "kurtha", 500);
        product p2 = new product(3, "jeans", 1500);
        product parray[] = {p, p1, p2};
        for (product obj : parray) {
            if (obj.price > 1000) {
                System.out.println(obj.id + " " + obj.name + " " + obj.price);
            }
        }
    }
}

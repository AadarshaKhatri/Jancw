import models.Order;
import models.Items;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Items item1 = new Items("Electric Toothbrush",1200,4);
        Items item2 = new Items("Electric scooter",30000,3);
        Items item3 = new Items("Shoes",6500,1);
        Items item4 = new Items("Cake",1200,1);


        List<Items> orderItems1 = new ArrayList<>();
        orderItems1.add(item1);
        orderItems1.add(item2);
        List<Items> orderItems2 = new ArrayList<>();
        orderItems2.add(item3);
        orderItems2.add(item4);

        Order order1 = new Order("Aadarsha Khatri","22 Jan,2024", orderItems1);
        Order order2 = new Order("Sam","24 Jan,204",orderItems2);

        order1.generateBill(500);
        order2.generateBill(1000);

    }
}

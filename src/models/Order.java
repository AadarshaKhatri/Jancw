package models;
import java.util.List;
import models.Items;

public class Order{
   String name;
   String date;
   List<Items> itemList;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public List<Items> getItemList() {
      return itemList;
   }

   public void setItemList(List<Items> itemList) {
      this.itemList = itemList;
   }

   public Order(String name, String date, List<Items> itemList) {
      this.name = name;
      this.date = date;
      this.itemList = itemList;
   }
   public void generateBill(int dis){
      int grand = 0;
      int total = 0;
      String orderId = this.getName();
      List<Items> ItemList = this.getItemList();
      for(Items item : ItemList){
         total =item.getQuantity() * item.getPrice();
         grand = grand+ total;

         System.out.println("Item: " + item.getName() +
                 ", Quantity: " + item.getQuantity() +
                 ", Price per unit: " + item.getPrice() +
                 ", Total: " + total);
      }


      grand -= (grand * dis) / 100;


      System.out.println("Order ID: " + name);
      System.out.println("Date: " + date);
      System.out.println("Grand Total : " + grand);
   }
}


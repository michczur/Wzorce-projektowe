package grcy.sda.patterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        //template
        ShoppingList templateList = new ShoppingList();

        //Everyday shoppings

        try {
            ShoppingList monday = (ShoppingList) templateList.clone();
            List<String> mondayList = monday.getShopings();
            mondayList.add("Sok pomidorowy");
            mondayList.add("Wysowianka");
            monday.setShopings(mondayList);

            System.out.println("Zakupy poniedziłkowe:");
            monday.getShopings().forEach(System.out::println);

            System.out.println("============");
            System.out.println("Lista ogólna:");

            templateList.getShopings()
                    .forEach(System.out::println);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

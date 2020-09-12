package grcy.sda.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable{
    private List<String> shopings;

    public ShoppingList() {
        shopings = new ArrayList<>();
        shopings.add("chleb");
        shopings.add("masło");
        shopings.add("pomidory");
        shopings.add("ser");
    }

    public ShoppingList(List<String> shopings) {
        this.shopings = shopings;
    }

    public List<String> getShopings() {
        return shopings;
    }

    public void setShopings(List<String> shopings) {
        this.shopings = shopings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempShopings = new ArrayList<>();
//        for (String shoping : shopings) {
//            tempShopings.add(shoping);
//        }

        tempShopings.addAll(shopings);
        return new ShoppingList(shopings);
    }
}

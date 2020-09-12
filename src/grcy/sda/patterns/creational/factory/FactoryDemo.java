package grcy.sda.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryDemo {
    public static void main(String[] args) {

        MacBook macBookair1 = MacBookFactory.getMacBook("air", "Mac Air 2015", "128");
        MacBook macBookair2 = MacBookFactory.getMacBook("Air", "Mac Air 2016", "512");
        MacBook macBookpro1 = MacBookFactory.getMacBook("Pro", "Mac Pro 2015", "128");
        MacBook macBookpro2 = MacBookFactory.getMacBook("PRO", "Mac Pro 2019", "256");

        List<MacBook> macList = new ArrayList<>();
        macList.add(macBookair1);
        macList.add(macBookair2);
        macList.add(macBookpro1);
        macList.add(macBookpro2);

        macList.stream()
                .forEach(x -> System.out.println(x.getName() + " disc:" + x.getDisc()));

        macList.stream()
                .map(x -> x.getName() + " disc: " + x.getDisc())
                .forEach(System.out::println);

        MacBook other = MacBookFactory.getMacBook("other", "unknown", "external");

    }
}

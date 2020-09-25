package grcy.sda.patterns.structural.flyweight;

import java.util.Arrays;
import java.util.List;

public class FordBaseTest {
    public static void main(String[] args) {
        FordMustang mustang1 = new FordMustang("Midnight Sky", "4.0", "Sony");
        System.out.println("==================");
        System.out.println("==================");


        FordMustang mustang2 = new FordMustang("Ruby Red", "4.5", "Denon");
        System.out.println("==================");
        System.out.println("==================");
        FordMustang mustang3 = new FordMustang("Midnight Sky", "3.5", "Denon");
        System.out.println("==================");
        System.out.println("==================");
        FordMustang mustang4 = new FordMustang("Black Panther", "3.2", "Sony");
        System.out.println("==================");
        System.out.println("==================");
        FordMustang mustang5 = new FordMustang("Midnight Sky", "4.0", "Denon");

        System.out.println("==================");
        FordMustangBaseFactory.getFordMustangBaseSet()
                .stream()
                .forEach(x -> System.out.println(x.getEngine() + " " + x.getColor()));

        System.out.println("==================");
        System.out.println(mustang1);

        System.out.println("=======");
        List<FordMustang> mustangs = Arrays.asList(mustang1, mustang2, mustang3, mustang4, mustang5);
        mustangs.forEach(x -> System.out.println(x.printMustangData()));

    }
}

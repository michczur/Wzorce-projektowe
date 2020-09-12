package grcy.sda.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilderDemo {
    public static void main(String[] args) {
        House house1 = new House.HouseBuilder("bloczki", "pustaki", "blacha")
                .build();

        House house2 = new House.HouseBuilder("ława", "max", "dachówka")
                .withGarage("wiata")
                .build();

        House house3 = new House.HouseBuilder("bloczki", "pustaki", "gont")
                .withGarden("oczko wodne")
                .build();

        House house4 = new House.HouseBuilder("ława", "bale drewniane", "darń i deski")
                .withGarden("las i plac zabaw")
                .withGarage("zewnętrzny podwójny")
                .build();

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        houses.stream()
                .map(x -> x.getWalls() + " " + x.getRoof() + " " + x.getGarage() + " " + x.getGarden())
                .forEach(System.out::println);
    }
}

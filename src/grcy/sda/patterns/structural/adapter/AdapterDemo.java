package grcy.sda.patterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Volvo volvo = new Volvo("V50", 200);

        AmericanMovable jeep = new Jeep("Renegade", 145);

        System.out.println("Volvo: " + volvo.getName() + " " + volvo.getSpeed());

        System.out.println("Jeep: " + ((Jeep) jeep).getName() + " " + jeep.getSpeed());

        System.out.println("Jeep z przelicznikiem prędkości:");
        System.out.println(Jeep.class.getCanonicalName() + ((Jeep) jeep).getName() + " " + ((Jeep) jeep).getSpeedKMH());
    }
}

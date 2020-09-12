package grcy.sda.patterns.structural.adapter;

public class Jeep extends AmericanCar {
    private String name;

    public Jeep(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}

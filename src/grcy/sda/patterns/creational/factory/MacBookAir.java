package grcy.sda.patterns.creational.factory;

public class MacBookAir extends MacBook {
    private String name;
    private String disc;

    public MacBookAir(String name, String disc) {
        System.out.println("MacBook Air created with " + disc + " disc.");
        this.name = name;
        this.disc = disc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDisc() {
        return disc;
    }
}

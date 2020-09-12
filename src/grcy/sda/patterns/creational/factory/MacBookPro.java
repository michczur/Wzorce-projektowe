package grcy.sda.patterns.creational.factory;

public class MacBookPro extends MacBook {
    private String name;
    private String disc;

    public MacBookPro(String name, String disc) {
        System.out.println("Mac Pro created");
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

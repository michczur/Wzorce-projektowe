package grcy.sda.generics;

public abstract class Team implements Comparable<Team>{
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }
}

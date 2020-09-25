package grcy.sda.patterns.behavioral.strategy;

public class WalkStrategy implements TravelStrategy {
    private boolean includeTouristPaths;

    public WalkStrategy(boolean includeTouristPaths) {
        this.includeTouristPaths = includeTouristPaths;
    }

    @Override
    public void setTravelPlan(String from, String to) {
        StringBuilder plan = new StringBuilder("Travel by foot")
                .append(includeTouristPaths ? " including touristic paths" : "")
                .append(".");
        System.out.println(plan);
    }
}

package grcy.sda.patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy {
    private boolean includeMotorways;
    private boolean includeFieldRoads;
    private boolean includeFerries;

    public CarStrategy(boolean includeMotorways, boolean includeFieldRoads) {
        this.includeMotorways = includeMotorways;
        this.includeFieldRoads = includeFieldRoads;
        includeFerries = false;
    }

    public CarStrategy(boolean includeMotorways, boolean includeFieldRoads, boolean includeFerries) {
        this.includeMotorways = includeMotorways;
        this.includeFieldRoads = includeFieldRoads;
        this.includeFerries = includeFerries;
    }

    @Override
    public void setTravelPlan(String from, String to) {
        StringBuilder plan = new StringBuilder("Travel by car")
                .append(includeMotorways ? " including paid roads" : "")
                .append(includeFieldRoads ? " including field roads" : "")
                .append(".");
        System.out.println(plan);

    }
}

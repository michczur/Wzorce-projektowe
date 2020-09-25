package grcy.sda.patterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Travel travel = new Travel("Rzeszów", "Bieszczady");

        travel.setTravelPlan(new WalkStrategy(false));

        travel.setTravelPlan(new CarStrategy(true, false));

        travel.setTravelPlan(new WalkStrategy(true));
    }
}

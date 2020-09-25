package grcy.sda.patterns.behavioral.state;

public class Onboarding implements FlightState {
    private static Onboarding INSTANCE = new Onboarding();

    private Onboarding() {
    }

    public static Onboarding getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Onboarding! Prepare to takeaway");
        flight.setFlightState(Takeaway.getINSTANCE());
    }
}

package grcy.sda.patterns.behavioral.state;

public class Flying implements FlightState {
    private static Flying INSTANCE = new Flying();

    private Flying() {
    }

    public static Flying getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Flying. Cabin crew provides drinks and meals.");
        flight.setFlightState(Landed.getINSTANCE());
    }
}

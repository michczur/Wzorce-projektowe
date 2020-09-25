package grcy.sda.patterns.behavioral.state;

public class Takeaway implements FlightState {
    private static Takeaway INSTANCE = new Takeaway();

    private Takeaway() {
    }

    public static Takeaway getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Takeaway. Please fasten your seatbelts and remain seated!");
        flight.setFlightState(Flying.getINSTANCE());
    }
}

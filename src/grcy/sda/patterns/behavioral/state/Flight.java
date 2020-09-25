package grcy.sda.patterns.behavioral.state;

public class Flight {
    FlightState flightState;

    public Flight() {
        if(this.flightState == null)
            this.flightState = Onboarding.getINSTANCE();
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }

    public void update() {
        if(flightState instanceof Onboarding) {
            System.out.println("\tPlease find your seat");
        }

        offerGoodsWhenFlying();

        flightState.updateState(this);
    }

    private void offerGoodsWhenFlying() {
        if(flightState instanceof Flying) {
            System.out.println("\tCabin crew sells perfumes");
            System.out.println("\tCabin crew sells alcohol");
        }
    }
}

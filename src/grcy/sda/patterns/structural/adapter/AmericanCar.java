package grcy.sda.patterns.structural.adapter;

public abstract class AmericanCar implements AmericanMovable {
    protected double speed;

    public double getSpeedKMH() {
        return speed * SpeedConverter.MILES_TO_KILOMETERS.getConverter();
    }


    //w klasie abstracyjnej możemy ale nie musimy definiować metod z interfejsu który implementujemy
//    @Override
//    public double getSpeed() {
//        return 0;
//    }
}

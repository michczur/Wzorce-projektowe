package grcy.sda.qa.abstractClass;

public interface Driver {
    //prowadzenie samochodu jak ma prawo jazdy
    boolean canDriveCar();

    //wyścigi, np gokartowe - od 12 lat, prawo jazdy niewymagane
    boolean canRace();
}

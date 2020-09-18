package grcy.sda.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private int pesel;
    private final int unikalnyNrKlienta;
    private List<Rachunek> listaRachunkow;

    // TODO: 18.09.2020 - każdy klient musi być w jakimś banku 
    public Klient(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        unikalnyNrKlienta = hashCode();
        listaRachunkow = new ArrayList<Rachunek>();
        System.out.println("Utworzono nowego klienta");
    }

    private String getImie() {
        return imie;
    }

    private void setImie(String imie) {
        this.imie = imie;
    }

    private String getNazwisko() {
        return nazwisko;
    }

    private void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private int getPesel() {
        return pesel;
    }

    private void setPesel(int pesel) {
        this.pesel = pesel;
    }

    private List<Rachunek> getListaRachunkow() {
        return listaRachunkow;
    }

    public void newKlient(String imie, String nazwisko, int pesel) {
        Klient klient = new Klient(imie, nazwisko, pesel);

    }

    public void dodajRachunekKlienta(Rachunek rachunek, Klient klient) {
        klient.listaRachunkow.add(rachunek);
        System.out.println("Dodano rachunek " + rachunek + " do listy rachunkow klienta" + klient);
    }

    public void usunZListyRachunkow(Rachunek rachunek) {
        listaRachunkow.remove(rachunek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, pesel);
    }
}

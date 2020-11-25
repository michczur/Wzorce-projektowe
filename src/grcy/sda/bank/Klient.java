package grcy.sda.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Klient extends Bank{
    private String imie;
    private String nazwisko;
    private int pesel;
    private final int unikalnyNrKlienta=hashCode();
    private List<Rachunek> listaRachunkow=new ArrayList<>();

    public Klient() {
        imie=null;
        nazwisko=null;
        pesel=0;
        System.out.println("tworzę nowego klienta");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public List<Rachunek> getListaRachunkow() {
        return listaRachunkow;
    }

    public void dodajRachunekKlienta(Rachunek rachunek) {
        this.listaRachunkow.add(rachunek);
        System.out.println("Dodano rachunek " + rachunek + " do listy rachunkow klienta" + this);
    }
    public void usunZListyRachunkow(Rachunek rachunek) {
        listaRachunkow.remove(rachunek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, pesel,getNazwa());
    }


}

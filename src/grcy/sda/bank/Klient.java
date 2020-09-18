package grcy.sda.bank;

import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private int pesel;
    private int UnikalnyNrKlienta;
    private List<Rachunek> listaRachunkow;

    public Klient(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
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

    public void newKlient(String imie,String nazwisko, int pesel){
        setImie(imie);
        setNazwisko(nazwisko);
        setPesel(pesel);
    }
    public void dodajRachunekKlienta(Rachunek rachunek,Klient klient) {
        klient.listaRachunkow.add(rachunek);
    }
}

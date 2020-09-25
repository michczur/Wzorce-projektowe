package grcy.sda.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String nazwa;
    private List<Klient> listaKlientow;
    private List<Rachunek> listaRachunkow;

    public Bank(String nazwa) {
        this.nazwa = nazwa;
        listaKlientow = new ArrayList<>();
        listaRachunkow = new ArrayList<>();
        System.out.println("Utworzono nowy bank -" + nazwa);
    }

    public void usunZlistyKlientow(Klient klient) {
        listaKlientow.remove(klient);
    }

    public void usunZlistyRachunkow(Rachunek rachunek) {
        listaRachunkow.remove(rachunek);
    }

    public List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public List<Rachunek> getListaRachunkow() {
        return listaRachunkow;
    }

    // TODO: 18.09.2020 lista klientów banku (z listą rachunków(z saldem lub bez))
    // TODO: 18.09.2020 lista rachunków klienta (z saldem lub bez)
    // TODO: 18.09.2020 OPT(lista rachunków (z saldami lub bez))

    @Override
    public String toString() {
        return "Bank " + nazwa + ", listaKlientow=" + listaKlientow +
                ", listaRachunkow=" + listaRachunkow;
    }
}

package grcy.sda.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Bank {
    private String nazwa;
    private List<Klient> listaKlientow=new ArrayList<>();
    private List<Rachunek> listaRachunkow= new ArrayList<>();

    public Bank() {
        nazwa=null;
        System.out.println("tworzę nowy bank");
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

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
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

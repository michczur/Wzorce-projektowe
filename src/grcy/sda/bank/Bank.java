package grcy.sda.bank;

import java.util.List;

public class Bank {
    private String nazwa;
    private List<Klient> listaKlientow;
    private List<Rachunek> listaRachunkow;

    public Bank(String nazwa, List<Klient> listaKlientow, List<Rachunek> listaRachunkow) {
        this.nazwa = nazwa;
        this.listaKlientow = listaKlientow;
        this.listaRachunkow = listaRachunkow;
    }
}

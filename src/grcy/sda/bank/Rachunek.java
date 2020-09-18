package grcy.sda.bank;

import java.util.Objects;

public class Rachunek {
    private String typRachunku;
    private int stanRachunku;
    private final int UnikalnyNrRachunku;

    public Rachunek(String typRachunku, int stanRachunku) {
        this.typRachunku = typRachunku;
        this.stanRachunku = stanRachunku;
        UnikalnyNrRachunku = hashCode();
    }

    private String getTypRachunku() {
        return typRachunku;
    }

    private void setTypRachunku(String typRachunku) {
        this.typRachunku = typRachunku;
    }

    private int getStanRachunku() {
        return stanRachunku;
    }

    private void setStanRachunku(int stanRachunku) {
        this.stanRachunku = stanRachunku;
    }

    public void wplataNaRachunek(int kwota) {
        setStanRachunku(stanRachunku + kwota);
        System.out.println("Stan rachunku: " + getStanRachunku());
    }

    public void wyplataZRachunku(int kwota) {
        if (kwota <= stanRachunku) {
            setStanRachunku(stanRachunku - kwota);
            System.out.println("Udało się wypłacić " + kwota + "zł");
        }
        if (kwota==0)
        {
            // klient.usunZListyRachunkow();
            // TODO: 18.09.2020 // zaimplementuj połączenie( kazdy rachunek musi byc w jakims banku i byc jakiegos klienta)
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(typRachunku, stanRachunku);
    }
}

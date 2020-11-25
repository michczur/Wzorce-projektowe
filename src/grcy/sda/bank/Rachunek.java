package grcy.sda.bank;

import java.util.Objects;

public class Rachunek extends Klient{
    private String typRachunku;
    private int stanRachunku;
    private final int UnikalnyNrRachunku=hashCode();

    public Rachunek() {
        typRachunku=null;
        stanRachunku=0;
        System.out.println("tworzę nowy rachunek");
    }

    public String getTypRachunku() {
        return typRachunku;
    }

    public void setTypRachunku(String typRachunku) {
        this.typRachunku = typRachunku;
    }

    public int getStanRachunku() {
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
            this.usunZListyRachunkow(this);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(typRachunku,stanRachunku,getImie(),getNazwisko(),getPesel(),getNazwa());
    }
}

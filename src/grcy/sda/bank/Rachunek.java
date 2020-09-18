package grcy.sda.bank;

public class Rachunek {
    private String typRachunku;
    private int stanRachunku;
    private int UnikalnyNrRachunku;

    public Rachunek(String typRachunku, int stanRachunku, int unikalnyNrRachunku) {
        this.typRachunku = typRachunku;
        this.stanRachunku = stanRachunku;
        UnikalnyNrRachunku = unikalnyNrRachunku;
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

    public void setStanRachunku(int stanRachunku) {
        this.stanRachunku = stanRachunku;
    }
}

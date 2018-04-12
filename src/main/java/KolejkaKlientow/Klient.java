package KolejkaKlientow;

import java.time.LocalTime;

public class Klient {
    private String imie;
    private LocalTime czasPrzybycia;
    private boolean czyPriorytet;

    public Klient(String imie, LocalTime czasPrzybycia, boolean czyPriorytet) {
        this.imie = imie;
        this.czasPrzybycia = czasPrzybycia;
        this.czyPriorytet = czyPriorytet;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public LocalTime getCzasPrzybycia() {
        return czasPrzybycia;
    }

    public void setCzasPrzybycia(LocalTime czasPrzybycia) {
        this.czasPrzybycia = czasPrzybycia;
    }

    public boolean isCzyPriorytet() {
        return czyPriorytet;
    }

    public void setCzyPriorytet(boolean czyPriorytet) {
        this.czyPriorytet = czyPriorytet;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", czasPrzybycia=" + czasPrzybycia +
                ", czyPriorytet=" + czyPriorytet +
                '}';
    }
}

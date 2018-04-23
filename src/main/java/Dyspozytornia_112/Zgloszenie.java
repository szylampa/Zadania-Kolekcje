package Dyspozytornia_112;

import java.time.LocalTime;

public class Zgloszenie {
    private TypZgloszenia typZgloszenia;
    private String treśćZgłoszenia;
    private LocalTime czasZgłoszenia;

    public Zgloszenie(TypZgloszenia typZgloszenia, String treśćZgłoszenia, LocalTime czasZgłoszenia) {
        this.typZgloszenia = typZgloszenia;
        this.treśćZgłoszenia = treśćZgłoszenia;
        this.czasZgłoszenia = czasZgłoszenia;
    }

    public TypZgloszenia getTypZgloszenia() {
        return typZgloszenia;
    }

    public void setTypZgloszenia(TypZgloszenia typZgloszenia) {
        this.typZgloszenia = typZgloszenia;
    }

    public String getTreśćZgłoszenia() {
        return treśćZgłoszenia;
    }

    public void setTreśćZgłoszenia(String treśćZgłoszenia) {
        this.treśćZgłoszenia = treśćZgłoszenia;
    }

    public LocalTime getCzasZgłoszenia() {
        return czasZgłoszenia;
    }

    public void setCzasZgłoszenia(LocalTime czasZgłoszenia) {
        this.czasZgłoszenia = czasZgłoszenia;
    }

    @Override
    public String toString() {
        return "Zgloszenie{" +
                "typZgloszenia=" + typZgloszenia +
                ", treśćZgłoszenia='" + treśćZgłoszenia + '\'' +
                ", czasZgłoszenia=" + czasZgłoszenia +
                '}';
    }
}
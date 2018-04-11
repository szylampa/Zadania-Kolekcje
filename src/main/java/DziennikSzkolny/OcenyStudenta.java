package DziennikSzkolny;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OcenyStudenta {

    private Map<Przedmiot, List<Double>> mapaOcen = new HashMap<>();

    public OcenyStudenta() {
    }

    public Map<Przedmiot, List<Double>> getMapaOcen() {
        return mapaOcen;
    }

    public void setMapaOcen(Map<Przedmiot, List<Double>> mapaOcen) {
        this.mapaOcen = mapaOcen;
    }

    public void dodajOcene(Przedmiot przedmiot, Double ocena) {
        List<Double> listaOcen;                      //deklaracja
        if (mapaOcen.containsKey(przedmiot)) {
            // pod podanym przedmiotem widnieją już jakieś oceny
            listaOcen = mapaOcen.get(przedmiot);            //przypisanie
        } else {
            // nie ma ocen czyli nie ma listy ocen
            listaOcen = new ArrayList<>();
        }
        listaOcen.add(ocena);
        mapaOcen.put(przedmiot, listaOcen);
    }

    public void wypiszOceny() {
        System.out.println("Oceny: ");
        for (Przedmiot przedmiot : Przedmiot.values()) {
            wypiszOceny(przedmiot);
        }
    }

    public void wypiszOceny(Przedmiot przedmiot) {
        if (mapaOcen.containsKey(przedmiot)) {
            System.out.println(przedmiot + " -> " + mapaOcen.get(przedmiot));
        }
    }

    public void wypiszSrednia() {
        System.out.println("Srednia z przedmiotów: ");
        double sumaSrednichZPrzedmiotow = 0.0;
        double licznikSumowanychPrzedmiotow = 0;
        for (Przedmiot przedmiot : Przedmiot.values()) {
            double sredniaZPrzedmiotu = obliczSredniaZPrzedmiotu(przedmiot);
            if (sredniaZPrzedmiotu != 0.0) {
                System.out.println("Srednia (" + przedmiot + "): " + sredniaZPrzedmiotu);
                sumaSrednichZPrzedmiotow += sredniaZPrzedmiotu;
                licznikSumowanychPrzedmiotow++;
            }
        }
        double sredniaZWszystkichPrzedmiotow = sumaSrednichZPrzedmiotow / licznikSumowanychPrzedmiotow;
        System.out.println("Srednia ogólem: " + sredniaZWszystkichPrzedmiotow);
    }

    private double obliczSredniaZPrzedmiotu(Przedmiot przedmiot) {
        if (!mapaOcen.containsKey(przedmiot)) {
            //brak ocen
            return 0;
        }
        //pobieranie ocen
        List<Double> listaOcen = mapaOcen.get(przedmiot);
        //obliczam sume ocen, streamem
        double sredniaOcenZPrzedmiotu = listaOcen.stream().mapToDouble(o -> o).sum();
        sredniaOcenZPrzedmiotu /= listaOcen.size();
        return sredniaOcenZPrzedmiotu;
    }
}



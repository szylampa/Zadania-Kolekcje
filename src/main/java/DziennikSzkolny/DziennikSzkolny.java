package DziennikSzkolny;

import java.util.HashMap;
import java.util.Map;

public class DziennikSzkolny {

    private Map<String, DaneStudenta> mapaStudnetow = new HashMap<>();
    private Map<String, OcenyStudenta> mapaOcenStudnetow = new HashMap<>();

    public DziennikSzkolny() {
    }

    public void dodajStudnta(String nrIndeksu, String imie, String nazwisko) {
        if (mapaStudnetow.containsKey(nrIndeksu)) {
            System.out.println("Uwaga, nadpisuję dane studenta!");
        }
        mapaStudnetow.put(nrIndeksu, new DaneStudenta(imie, nazwisko, nrIndeksu));
    }

    public void dodajOceneDlaStudenta(String nrIndeksu, Przedmiot przedmiot, Double ocena) {
        OcenyStudenta ocenyStudenta;
        if (mapaOcenStudnetow.containsKey(nrIndeksu)) {
            //to znaczy że są oceny
            ocenyStudenta = mapaOcenStudnetow.get(nrIndeksu);
        } else {
            // oznacza że w mapie nie ma pod podanym kluczem żadnej oceny
            ocenyStudenta = new OcenyStudenta();
        }
        ocenyStudenta.dodajOcene(przedmiot, ocena);
        mapaOcenStudnetow.put(nrIndeksu, ocenyStudenta);
    }

    public void wypiszOcenyStudenta(String nrIndeksu) {
        if (!mapaOcenStudnetow.containsKey(nrIndeksu)) {
            System.out.println("Nie posiadam ocen tego studenta!");
            return;  /// zakończenie metody wcześniej bez robienia else i tworzenia kolejnego zagłebienia, spełnienie jakiegoś warunku początkowego
        }
        //wywołaj metode wypiszOceny() z klasy OcenyStudenta
        mapaOcenStudnetow.get(nrIndeksu).wypiszOceny();


    }

    public void wypiszSrednia(String nrIndeksu) {
        if (!mapaOcenStudnetow.containsKey(nrIndeksu)) {
            System.out.println("Nie posiadam ocen tego studenta!");
            return;
        }
        mapaOcenStudnetow.get(nrIndeksu).wypiszSrednia();
    }

    public void znajdzStudentaPoIndeksie(String nrIndeksu) {
        DaneStudenta studenta = mapaStudnetow.get(nrIndeksu);
        System.out.println(studenta);
    }

}

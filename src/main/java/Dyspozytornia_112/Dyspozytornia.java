package Dyspozytornia_112;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.UUID.randomUUID;

public class Dyspozytornia {
    Map<String, Zgloszenie> mapaZgloszen = new HashMap<>();

    public void wypiszWszystkieZgłoszenia() {
        mapaZgloszen.values().stream().forEach(zgloszenie -> System.out.println(zgloszenie));
    }


    public void dodajZgloszenie(String tresc, TypZgloszenia typZgloszenia) {
        Zgloszenie zgloszenie = new Zgloszenie(typZgloszenia, tresc, LocalTime.now());
        mapaZgloszen.put(String.valueOf(randomUUID()), zgloszenie);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public int zwróćNajaktualniejszeZgłoszenia(int limit) {

        mapaZgloszen.values().stream()
                .limit(limit)
                .forEach(zgloszenie -> System.out.println(zgloszenie));
        return limit;
    }

    List<Zgloszenie> zwróćZgłoszeniaTypu(TypZgloszenia typZgloszenia) {
        return mapaZgloszen.values().stream()
                .collect(Collectors.toList());
    }


}
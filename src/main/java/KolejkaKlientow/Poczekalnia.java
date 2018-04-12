package KolejkaKlientow;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;


public class Poczekalnia {

    private PriorityQueue<Klient> kolejka = new PriorityQueue<>(new Comparator<Klient>() {
        @Override
        public int compare(Klient o1, Klient o2) {
            if (o1.isCzyPriorytet() && !o2.isCzyPriorytet()) {
                return -1;
            } else if (!o1.isCzyPriorytet() && o2.isCzyPriorytet()) {
                return 1;
            }
            if (o1.getCzasPrzybycia().isBefore(o2.getCzasPrzybycia())) {
                return -1;
            } else if (o1.getCzasPrzybycia().isAfter(o2.getCzasPrzybycia())) {
                return 1;
            }
            return 0;
        }
    });


    public Poczekalnia() {
    }


    public void dodajKlienta(String imie, boolean czyPriorytet) throws InterruptedException {
        if (czyPriorytet) {
            kolejka.add(new Klient(imie, LocalTime.now(), true));
            TimeUnit.SECONDS.sleep(1);
        } else {
            kolejka.add(new Klient(imie, LocalTime.now(), false));
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public Optional<Klient> pobierzKlienta(){
        return Optional.ofNullable(kolejka.poll());
    }

    public void wypiszWszystkichKlientow() {
        while (!kolejka.isEmpty()) {
            System.out.println(kolejka.poll());
        }
    }
}

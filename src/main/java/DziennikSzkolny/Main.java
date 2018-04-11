package DziennikSzkolny;

public class Main {
    public static void main(String[] args) {
        DziennikSzkolny dziennikSzkolny = new DziennikSzkolny();

        dziennikSzkolny.dodajStudnta("123456", "Jan", "Kowalski");
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.INFORMATYKA, 3.0);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.INFORMATYKA, 5.0);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.INFORMATYKA, 4.5);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.J_ANGIELSKI, 4.5);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.J_ANGIELSKI, 2.5);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.J_ANGIELSKI, 3.5);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.J_POLSKI, 4.5);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.J_POLSKI, 1.5);
        dziennikSzkolny.dodajOceneDlaStudenta("123456", Przedmiot.J_POLSKI, 2.5);

        dziennikSzkolny.wypiszOcenyStudenta("123456");
        dziennikSzkolny.wypiszSrednia("123456");

    }
}

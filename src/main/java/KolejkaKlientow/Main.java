package KolejkaKlientow;
//Zadanie 2:
//        Problem:
//        Stworzymy aplikację kontrolującą kolejność pobierania elementów z obiektu. Spróbujemy zrealizować zadanie reprezentujące kolejkę na poczcie lub w pewnej poczekalni.
//
//        Stwórz klasę Klient, która posiada:
//        - imie klienta (wyłącznie dla celów prezentacji - żeby później łatwiej nam było czytać poprawność wyników)
//        - czas przybycia
//        - czy jest priorytetem (tak lub nie)
//
//        Stwórz klasę Poczekalnia, która jako pola posiada:
//        - KOLEJKĘ PRIORYTETOWĄ klientów
//
//        Do klasy poczekalnia dodaj metody:
//        - dodajKlienta(String imie, boolean czyPriorytet):void - która dodaje klienta o podanym imieniu z informacją czy jest priorytetyzowany.
//          W metodzie stwórz instancje klasy Klient i ustaw mu wartości wszystkich pól. Czas dodania ustaw na 'now()' czyli moment dodania go do kolejki.
//        - pobierzKlienta():Klient - która zwraca następnego w kolejce klienta
//        - wypiszKolejnoKlientów():void - metoda która wyciąga z kolejki klientów dopóki w kolejce są jacyś klienci. Wraz 'wyciąganiem' klientów wypisuj ich informacje na ekran.


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Poczekalnia poczekalnia = new Poczekalnia();
        poczekalnia.dodajKlienta("John", false);
        poczekalnia.dodajKlienta("Bob", false);
        poczekalnia.dodajKlienta("Fred", false);
        poczekalnia.dodajKlienta("Tim", true);
        poczekalnia.wypiszWszystkichKlientow();
    }
}

package MoviesDatabase;

import java.util.Arrays;

//*Movies database:
//Stwórz enum MovieType który posiada opcje:
//    ACTION, DRAMA, COMEDY, HORROR
//Stwórz model filmu, który : (klasa Movie)
//    - posiada pole nazwa filmu - String
//    - posiada pole typ filmu (enum)
//    - posiada pole data wydania filmu - data
//    - posiada pole nazwisko autora - String
//1. Stwórz klasę MoviesDatabase która posiada:
//    - jako pole posiada mapę filmów. Mapa powinna mapować z wartości typu String (będzie to nazwa filmu) na model (na obiekty klasy Movie)
//    - stwórz metodę dodawania do bazy danych filmów ( addMovie(Movie m)) która dodaje do mapy film
//    - stwórz metodę wyszukiwania filmów z bazy danych, która przyjmuje jako parametr nazwę filmu, a zwraca film który jest w bazie danych pod tą nazwą.
//    - stwórz metodę wypisywania wszystkich filmów. Metoda powinna iterować po wartościach mapy i wypisywać informacje o filmie (nadpisz metodę toString w klasie ...[wiesz jakiej?]). metoda printAllMovies().
//    - stwórz metodę o tej samej nazwie co powyższa, która przyjmuje jako parametr typ filmu (MovieType) i również iteruje wartości, jedak wypisuje tylko te filmy których MovieType odpowiada temu podanemu jako parametr.
//2. Stwórz maina w którym będziesz testować tą funkcjonalność dodawania/wyszukiwania/wypisywania i filtrowania (wypisywanie tylko tych z wybranej kategorii) filmów.
public class Main {
    public static void main(String[] args) {
        Movie a = new Movie("Batman - Początek", 2005, "Nolan", MovieType.ACTION);
        Movie b = new Movie("Zielona Mila", 1999, "Darabont", MovieType.DRAMA);
        Movie c = new Movie("Forrest Gump", 1994, "Zemeckis", MovieType.COMEDY);
        Movie d = new Movie("Milczenie Owiec", 1991, "Demme", MovieType.HORROR);
        Movie e = new Movie("Matrix", 1991, "Wachowski", MovieType.ACTION);
        MoviesDatabase bazadanych = new MoviesDatabase();

        bazadanych.addMovie(a);
        bazadanych.addMovie(b);
        bazadanych.addMovie(c);
        bazadanych.addMovie(d);
        bazadanych.addMovie(e);

        System.out.println("Czy jest Awatar?");
        bazadanych.searchMovie("Awatar");
        System.out.println("Czy jest Milczenie Owiec?");
        bazadanych.searchMovie("Milczenie Owiec");
        System.out.println("Wszystkie filmy AKCJI: ");
        bazadanych.printAllMovies(MovieType.ACTION);
        System.out.println("Wszystkie filmy w bazie: ");
        bazadanych.printAllMovies();
    }
}

package MoviesDatabase;


import java.util.HashMap;
import java.util.Map;

public class MoviesDatabase {

    Map<String, Movie> moviesDatabase = new HashMap<>();

    public void addMovie(Movie m) {
        moviesDatabase.put(m.getNazwaFilmu(), m);

    }

    public void searchMovie(String wpisanaNazwa) {
        Movie m = moviesDatabase.get(wpisanaNazwa);
        System.out.println(m);
    }

    public void printAllMovies() {
        for (Movie m : moviesDatabase.values()) {
            System.out.println(m);
        }
    }

    public void printAllMovies(MovieType type) {
        for (Movie m : moviesDatabase.values()) {
            if (m.getTypFilmu().equals(type)) {
                System.out.println(m);
            }
        }
    }

    @Override
    public String toString() {
        return "MoviesDatabase{" +
                "moviesDatabase=" + moviesDatabase +
                '}';
    }
}

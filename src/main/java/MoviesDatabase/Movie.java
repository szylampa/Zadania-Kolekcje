package MoviesDatabase;

public class Movie {
    private String nazwaFilmu;
    private int dataWydania;
    private String nazwiskoAutora;
    private MovieType typFilmu;

    public Movie(String nazwaFilmu, int dataWydania, String nazwiskoAutora, MovieType typFilmu) {
        this.nazwaFilmu = nazwaFilmu;
        this.dataWydania = dataWydania;
        this.nazwiskoAutora = nazwiskoAutora;
        this.typFilmu = typFilmu;
    }

}

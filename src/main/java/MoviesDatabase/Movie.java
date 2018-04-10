package MoviesDatabase;

public class Movie {
    private String nazwaFilmu;
    private MovieType typFilmu;
    private int dataWydania;
    private String nazwiskoAutora;

    public void setNazwaFilmu(String nazwaFilmu) {
        this.nazwaFilmu = nazwaFilmu;
    }

    public void setTypFilmu(MovieType typFilmu) {
        this.typFilmu = typFilmu;
    }

    public void setDataWydania(int dataWydania) {
        this.dataWydania = dataWydania;
    }

    public void setNazwiskoAutora(String nazwiskoAutora) {
        this.nazwiskoAutora = nazwiskoAutora;
    }

    public String getNazwaFilmu() {

        return nazwaFilmu;
    }

    public MovieType getTypFilmu() {
        return typFilmu;
    }

    public int getDataWydania() {
        return dataWydania;
    }

    public String getNazwiskoAutora() {
        return nazwiskoAutora;
    }

    public Movie(String nazwaFilmu, int dataWydania, String nazwiskoAutora, MovieType typFilmu) {
        this.nazwaFilmu = nazwaFilmu;
        this.dataWydania = dataWydania;
        this.nazwiskoAutora = nazwiskoAutora;
        this.typFilmu = typFilmu;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nazwaFilmu='" + nazwaFilmu + '\'' +
                ", typFilmu=" + typFilmu +
                ", dataWydania=" + dataWydania +
                ", nazwiskoAutora='" + nazwiskoAutora + '\'' +
                '}';
    }
}

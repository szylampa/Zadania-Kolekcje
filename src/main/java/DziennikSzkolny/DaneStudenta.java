package DziennikSzkolny;

public class DaneStudenta {
    private String imie;
    private String nazwisko;
    private String nrIndeksu;

    @Override
    public String toString() {
        return "DaneStudenta{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrIndeksu='" + nrIndeksu + '\'' +
                '}';
    }

    public DaneStudenta(String imie, String nazwisko, String nrIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
    }

    public DaneStudenta() {
    }

    public String getImie() {

        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(String nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }
}

import Magazyn.Kategoria;
import org.junit.Test;
import Magazyn.Magazyn;
import Magazyn.Produkt;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MagazynTests {
    @Test
    public void defaultConstructor_produktyWKategorii_notnull(){
        Magazyn magazyn = new Magazyn();

        assertNotNull(magazyn.produktyWkategorii);
    }

    @Test
    public void dodajProdukt_produktNieWKategorii_DodaniePoprawnegoProduktu(){
        Produkt p = new Produkt(1, LocalDate.of(2000,11,22), "Nazwa", 11.0, Kategoria.NABIAL);
        Magazyn m = new Magazyn();

        m.dodajProdukt(p);

        assertEquals(m.produktyWkategorii.get(Kategoria.NABIAL).get(0).getId(), 1);
    }

    @Test
    public void dodajProdukt_produktNull_exception(){
        Magazyn magazyn = new Magazyn();
        magazyn.dodajProdukt(null);

        magazyn.produktyWkategorii.get(Kategoria.NABIAL).get(0).getId();
    }
}

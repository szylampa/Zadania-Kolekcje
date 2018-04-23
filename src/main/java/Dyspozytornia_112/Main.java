package Dyspozytornia_112;

public class Main {
    public static void main(String[] args) {
        Dyspozytornia dyspozytornia =new Dyspozytornia();

        dyspozytornia.dodajZgloszenie("Policja",TypZgloszenia.POLICJA);
        dyspozytornia.dodajZgloszenie("Karetka",TypZgloszenia.KARETKA);
        dyspozytornia.dodajZgloszenie("aaa",TypZgloszenia.KARETKA);
        dyspozytornia.dodajZgloszenie("bb",TypZgloszenia.POLICJA);
        dyspozytornia.dodajZgloszenie("Straz",TypZgloszenia.STRAŻ);
        dyspozytornia.dodajZgloszenie("c",TypZgloszenia.POLICJA);

        dyspozytornia.wypiszWszystkieZgłoszenia();
        System.out.println("Najnowsze");
        dyspozytornia.zwróćNajaktualniejszeZgłoszenia(3);
        System.out.println("Typ zgłoszenia");
        dyspozytornia.zwróćZgłoszeniaTypu(TypZgloszenia.POLICJA);
    }
}
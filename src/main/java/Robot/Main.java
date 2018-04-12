package Robot;

//Stwórz enum RuchRobota która posiada wartości:
//        KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK
//        każdy z ruchów posiada również dodatkową informację (liczbową) która reprezentuje ile % baterii robota jest potrzebne do wykonania podanego ruchu.
//        Stwórz klasę Robot która posiada pola:
//        - poziom baterii ( wartość od 0 do 100)
//        - nazwa robota
//        - czy włączony
//        stwórz metody:
//        - poruszRobotem(RuchRobota):void - ktora porusza robotem jeśli robot posiada dostateczną ilość energii (oraz odejmuje zadaną ilość energii z robota)
//        - naładujRobota():void - która zwiększa ilość % baterii do 100%
//        - włączRobota():void - włącza robota
//        - wyłączRobota():void - wyłącza robota
//        Robot nie może się poruszać kiedy jest wyłączony!
//        Robot może być ładowany tylko gdy jest wyłączony!

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(100.0, "Bob", false);
        robot.wlaczRobota();
        robot.poruszRobota(RuchRobota.SKOK);
        robot.wylaczRobota();
        robot.poruszRobota(RuchRobota.RUCH_LEWA_REKA);
        System.out.println(robot.getPoziomBaterii());
        robot.naladujRobota();
        robot.wlaczRobota();
        robot.naladujRobota();
        System.out.println(robot.getPoziomBaterii());
    }
}

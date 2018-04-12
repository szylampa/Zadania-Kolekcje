package Robot;

public class Robot {

    private double poziomBaterii;
    private String nazwaRobota;
    private boolean czyWlaczony;


    public void poruszRobota(RuchRobota ruchRobota) {
        if (czyWlaczony) {
            if (poziomBaterii > 0) {
                poziomBaterii = poziomBaterii - ruchRobota.getProcentBaterii();
                switch (ruchRobota) {
                    case SKOK:
                        System.out.println("SKOK, obecny poziom baterii = " + poziomBaterii);
                        break;
                    case RUCH_LEWA_REKA:
                        System.out.println("Ruszylem lewa reka, obecny poziom baterii = " + poziomBaterii);
                        break;
                    case RUCH_PRAWA_REKA:
                        System.out.println("Ruszylem prawa reka, obecny poziom baterii = " + poziomBaterii);
                        break;
                    case KROK_LEWA:
                        System.out.println("Krok w lewo, obecny poziom baterii = " + poziomBaterii);
                        break;
                    case KROK_PRAWA:
                        System.out.println("Krok w prawo, obecny poziom baterii = " + poziomBaterii);
                        break;
                }
            } else {
                System.out.println("Robot rozładowany! Trzeba naładować robota!");
            }
        } else {
            System.out.println("Robot wylaczony! Aby zaczac sie poruszac najpierw wlacz robota");
        }
    }

    public void naladujRobota() {
        if (czyWlaczony) {
            poziomBaterii = 100;
            System.out.println("Robot naładowany!");
        } else {
            System.out.println("Robot wylaczony! Aby naładowac, najpierw wlacz robota");
        }
    }

    public void wlaczRobota(){
        if (!czyWlaczony){
            czyWlaczony = true;
            System.out.println("Włączm robota");
        }else {
            System.out.println("Robot już działa");
        }
    }

    public void wylaczRobota(){
        if (czyWlaczony){
            czyWlaczony = false;
            System.out.println("Wyłączam robota");
        }else {
            System.out.println("Robot już wyłączony");
        }
    }

    public Robot(double poziomBaterii, String nazwaRobota, boolean czyWlaczony) {
        this.poziomBaterii = poziomBaterii;
        this.nazwaRobota = nazwaRobota;
        this.czyWlaczony = czyWlaczony;
    }

    public double getPoziomBaterii() {
        return poziomBaterii;
    }

    public void setPoziomBaterii(double poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
    }

    public String getNazwaRobota() {
        return nazwaRobota;
    }

    public void setNazwaRobota(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
    }

    public boolean isCzyWlaczony() {
        return czyWlaczony;
    }

    public void setCzyWlaczony(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
    }
}

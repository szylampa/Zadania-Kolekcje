package Robot;

public enum RuchRobota {
    KROK_LEWA(10.0),
    KROK_PRAWA(10.0),
    RUCH_LEWA_REKA(5.0),
    RUCH_REKA_PRAWA(5.0),
    SKOK(20.0);

    private double procentBaterii;

    RuchRobota(double procentBaterii) {
        this.procentBaterii = procentBaterii;
    }
}

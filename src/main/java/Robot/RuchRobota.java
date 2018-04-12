package Robot;

public enum RuchRobota {
    KROK_LEWA(10.0),
    KROK_PRAWA(10.0),
    RUCH_LEWA_REKA(5.0),
    RUCH_PRAWA_REKA(5.0),
    SKOK(20.0);

    private double procentBaterii;

    RuchRobota(double procentBaterii) {
        this.procentBaterii = procentBaterii;
    }

    public double getProcentBaterii() {
        return procentBaterii;
    }

    public void setProcentBaterii(double procentBaterii) {
        this.procentBaterii = procentBaterii;
    }

    @Override
    public String toString() {
        return "RuchRobota{" +
                "procentBaterii=" + procentBaterii +
                '}';
    }
}

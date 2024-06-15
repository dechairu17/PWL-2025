package jobsheet3.Latihan1;

class Bola {
    private double jariJari;

    public Bola(double r) {
        jariJari = r;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}

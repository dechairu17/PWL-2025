package jobsheet3.Latihan1;

class LimasSegiEmpatSamaSisi {
    private double panjangSisiAlasLimas;
    private double tinggiLimas;


    public LimasSegiEmpatSamaSisi(double p, double t) {
        panjangSisiAlasLimas = p;
        tinggiLimas = t;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaan = panjangSisiAlasLimas * panjangSisiAlasLimas + 4 * (0.5 * panjangSisiAlasLimas * tinggiLimas);
        return luasPermukaan;
    }

    public double hitungVolume() {
        double volume = (1.0 / 3.0) * panjangSisiAlasLimas * panjangSisiAlasLimas * tinggiLimas;
        return volume;
    }
}


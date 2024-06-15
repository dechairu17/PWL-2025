class Kendaraan08 {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    Kendaraan08(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    @Override
    public String toString() {
        return String.format("| %-11s| %-11s| %-5s| %-12d| %-5d| %-16d|",
                noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
    }
}
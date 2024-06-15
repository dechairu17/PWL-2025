public class TranksaksiPajak08 {
    int kodeTransaksi;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan08 kendaraan08;

    public TranksaksiPajak08(int kodeTransaksi, long nominalBayar, long denda, int bulanBayar, Kendaraan08 kendaraan08) {
        this.kodeTransaksi = kodeTransaksi;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan08 = kendaraan08;
    }
}

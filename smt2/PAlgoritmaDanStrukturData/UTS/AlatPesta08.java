public class AlatPesta08 {
    int kodeAlat08;
    String namaAlat08;
    double hargaSewa08;
    int stock08;

    public AlatPesta08(int kodeAlat08, String namaAlat08, double hargaSewa08, int stock08){
        this.kodeAlat08 = kodeAlat08;
        this.namaAlat08 = namaAlat08;
        this.hargaSewa08 = hargaSewa08;
        this.stock08 = stock08;
    }

    void tampil(){

    }

    void tampilDataAlatPesta(){
        System.out.println("Kode alat = " + kodeAlat08);
        System.out.println("Nama Alat = " + namaAlat08 );
        System.out.println("Harga Sewa = " + hargaSewa08);
        System.out.println("stock yang ada = " + stock08);
    }
}
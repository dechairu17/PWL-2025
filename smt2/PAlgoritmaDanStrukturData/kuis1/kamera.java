package kuis1;

public class kamera {
     int id_kamera;
     String merek;
     String jenis;
     int harga_sewa;
     String resolusi;
     String status;
     double diskon;

    

    public kamera(int id_kamera, String merek, String jenis, int harga_sewa, String resolusi, String status) {
        this.id_kamera = id_kamera;
        this.merek = merek;
        this.jenis = jenis;
        this.harga_sewa = harga_sewa;
        this.resolusi = resolusi;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int hitungBiayaSewa(int durasiSewa) {
        harga_sewa = harga_sewa * durasiSewa;
        return harga_sewa;
    }

    int hitungDiskon() {
        if (harga_sewa > 1000000) {
            diskon = harga_sewa * 0.80;
        } else if (harga_sewa >= 800000 || harga_sewa <= 600000){
            diskon = harga_sewa * 0.95;
        } else if(harga_sewa <= 400000){
            System.out.println("Tidak ada diskon ");
        }
        System.out.println("Hitung harga setelah di diskon : " + diskon);
        return (int) diskon;
    }
    int hargaBayar(){
        int hargaBayar = (int) diskon;
        System.out.println("Harga yang harus di bayar : " + hargaBayar);
        return hargaBayar;
    }

    public void tampilkanInfo() {
        System.out.println("ID Kamera: " + id_kamera);
        System.out.println("Merek: " + merek);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga Sewa: Rp" + harga_sewa);
        System.out.println("Resolusi: " + resolusi);
        System.out.println("Status: " + status);
    }

    
}

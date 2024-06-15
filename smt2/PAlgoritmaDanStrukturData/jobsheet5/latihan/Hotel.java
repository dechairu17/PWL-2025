package jobsheet5.latihan;

public class Hotel {
    String nama;
    String kota;
    int harga;
    byte bintang;

    
    Hotel(String n, String k, int h, byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil(){
        System.out.println("Nama Hotel = " +nama);
        System.out.println("Kota = " + kota);
        System.out.println("Harga sewa Hotel = " + harga);
        System.out.println("Bintang Hotel = " + (byte)bintang);
    }
}

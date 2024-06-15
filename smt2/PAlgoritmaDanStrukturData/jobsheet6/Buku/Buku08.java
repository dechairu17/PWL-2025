package jobsheet6.Buku;

public class Buku08 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku08(String kodeBuku2, String judul, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku2;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    void tampil(){
        
    }

    void tampilDataBuku(){
        System.out.println("Kode buku : " + kodeBuku);
        System.out.println("Judul buku : " + judul);
        System.out.println("tahun terbit buku : " + tahunTerbit);
        System.out.println("Pengarang buku : " + pengarang);
        System.out.println("Stock buku : " + stock);
    }

}

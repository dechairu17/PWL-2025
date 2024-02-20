public class Buku08 {
    String judul, pengarang;
    int halaman, stock, harga;

    void tampilInformasi (){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Halaman : " + halaman);
        System.out.println("Stock : " + stock);
        System.out.println("Harga : " + harga);
    }

    void terjual(int jml){
        stock -= jml ;
    }

    void restock (int jml){
        stock += jml;
    }

    void gantiHarga (int hrg){
        harga = hrg;
    }
    public Buku08 (){

    }
    public Buku08 (String jud, String pg, int hal, int stock, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stock = stock;
        harga = har;
    }
}
package jobsheet2;

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
}
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
        if (stock > 0) {
            stock -= jml;
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok habis, tidak bisa menjual buku.");
        }
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

    public void hitungHargaTotal(Object terjual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungHargaTotal'");
    }

    public void hitungHargaTotal(Object terjual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungHargaTotal'");
    }

    public void hitungHargaTotal(Object terjual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungHargaTotal'");
    }
}
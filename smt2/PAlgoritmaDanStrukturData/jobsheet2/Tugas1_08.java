public class Tugas1_08 {

        int terjual = 0;
        String judul, pengarang;
        int halaman, stock, harga;
        int hargaTotal ;
        double diskon ;
        int hrgaBayar;

        void tampilInformasi (){
            System.out.println("Judul : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Halaman : " + halaman);
            System.out.println("Stock : " + stock);
            System.out.println("Harga : " + harga);
        }
    
        int terjual(int jml){
            stock -= jml ;
            return jml;
        }
    
        void restock (int jml){
            stock += jml;
        }
    
        void gantiHarga (int hrg){
            harga = hrg;
        }

       
    
        int hitungHargaTotal(int jml){
            hargaTotal = harga * jml;
            System.out.println("Harga total: "+ hargaTotal);
            return hargaTotal;
        }
    
        int hitungDiskon() {
            if (hargaTotal > 150000) {
                diskon = hargaTotal * 0.88;
            } else if (hargaTotal >= 75000 || hargaTotal <= 150000){
                diskon = hargaTotal * 0.95;
            } else if(hargaTotal < 75000){
                System.out.println("Tidak ada diskon ");
            }
            System.out.println("Hitung harga setelah di diskon : " + diskon);
            return (int) diskon;
        }
        int hargaBayar(){
            hrgaBayar = (int) diskon;
            System.out.println("Harga yang harus di bayar : " + hrgaBayar);
            return hrgaBayar;
        }

    }


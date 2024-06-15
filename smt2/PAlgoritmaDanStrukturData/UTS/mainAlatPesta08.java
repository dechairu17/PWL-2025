import java.util.Scanner;

public class mainAlatPesta08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        MenuAlatPesta08 data08 = new MenuAlatPesta08();
        int jumAlat08 = 3;

        System.out.println("_____________________________________________"); 
        System.out.println("Masukkan data08 Alat Pesta : "); 
        for (int i = 0; i < jumAlat08; i++) { 
        System.out.println("_____________________________________________"); 
        System.out.print("Kode Alat \t: "); 
        int kodeAlat08 = sc.nextInt(); 
        System.out.print("Nama Alat \t: "); 
        String namaAlat08 = sc1.nextLine(); 
        System.out.print("Harga Sewa \t: "); 
        int hargaSewa08 = sc.nextInt(); 
        System.out.print("stock \t\t: "); 
        int stock08= sc.nextInt(); 
 
        AlatPesta08 m08= new AlatPesta08(kodeAlat08, namaAlat08, hargaSewa08, stock08); 
        data08.tambah08(m08); 
    }
    System.out.println("_____________________________________________"); 
    System.out.println("data keseluruhan Alat Pesta : "); 
    data08.tampil08(); 
    
    System.out.println("______________________________________________"); 
    System.out.println("Menu ");
    System.out.println("1. Tampilkan data dengan dari harga terendah");
    System.out.println("2. Tampilkan data dengan dari kode terendah");
    System.out.println("3. Cari data ");
    System.out.println("______________________________________________"); 
    System.out.println("Masukan Pilihan Menu Anda");
    int menu08 = sc.nextInt();
    System.out.println("______________________________________________"); 

    if (menu08 == 1) {
        System.out.println("Sorting dari Harga Terendah");
        data08.bubblesortHarga08();
        data08.tampil08();
    } else if (menu08 == 2) {
        data08.bubblesortKode08();
        data08.tampil08();
    } else if (menu08 == 3) {
        System.out.println("Pencarian data08 "); 
        System.out.println("Masukkan Kode Alat Pesta yang dicari: "); 
        System.out.print("Kode Alat Pesta : "); 
        int cari = sc.nextInt(); 
        System.out.println("menggunakan sequential Search"); 
        int posisi = data08.FindSeqSearch08(cari); 
        data08.tampilPosisi08(cari, posisi); 
        data08.TampilData08(cari, posisi); 
    } else {
        System.out.println("Menu yang anda pilih tidak ada");
    }
    
    
 
 } 
}

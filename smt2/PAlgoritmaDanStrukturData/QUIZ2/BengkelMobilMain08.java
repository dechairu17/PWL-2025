import java.util.Scanner;

public class BengkelMobilMain08 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SLLBengkel08 list = new SLLBengkel08();
        String namaPelanggan;
        String NoHp;
        int KodeLayanan;
        String namaLayanan;
        int harga;

        boolean run = true;
        do {
            System.out.println("================================"); 
            System.out.println("BENGKEL POLINEMA"); 
            System.out.println("================================"); 
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Print Antrian");
            System.out.println("3. Hapus Antrian dan tambah layanan");
            System.out.println("4. Tampil Semua Layanan");
            System.out.println("5. Tampil Total Pemasukan ");
            System.out.println("6. Tampil Layanan berdasarkan harga termurah");
            System.out.println("7. Keluar dari menu");
            System.out.println("================================"); 
            System.out.print("Masukan Pilihan Anda : ");
            int pilihan = sc.nextInt(); 
            System.out.println("================================"); 
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Nama :");
                    namaPelanggan = sc.next();
                    System.out.print("Masukan No HP : ");
                    NoHp = sc.next();
                    Pelanggan08 pelanggan = new Pelanggan08(namaPelanggan, NoHp);
                    System.out.print("Masukan Kode Layanan : ");
                    KodeLayanan = sc.nextInt();
                    System.out.print("Masukan Nama Layanan : ");
                    namaLayanan = sc.next();
                    System.out.print("Masukan harga : ");
                    harga = sc.nextInt();
                    Layanan08 layanan = new Layanan08(KodeLayanan, namaLayanan, harga);
                    list.addLast(pelanggan, layanan);
                    break;
                    case 2:
                    list.print();
                    break;
                case 3:
                    System.out.print("Masukan Kode Layanan Baru : ");
                    KodeLayanan = sc.nextInt();
                    System.out.print("Masukan Nama Layanan Baru : ");
                    namaLayanan = sc.next();
                    System.out.print("Masukan harga Layanan Baru : ");
                    harga = sc.nextInt();
                    Layanan08 layananBaru = new Layanan08(KodeLayanan, namaLayanan, harga);
                    list.removeLastAndAddService(layananBaru);
                    break;
                
                case 4:
                    list.tampilSemuaLayanan();
                    break;
                case 5:
                    System.out.println("Total Pemasukan: " + list.totalPemasukan());
                    break;
                case 6:
                    list.tampilLayananTermurah();
                    break;
                case 7:
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (run);
    }
}

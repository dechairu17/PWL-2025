import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL08 list = new DLL08();
        List<TranksaksiPajak08> transaksiList = new ArrayList<>();

        Kendaraan08 k1 = new Kendaraan08("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        Kendaraan08 k2 = new Kendaraan08("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        Kendaraan08 k3 = new Kendaraan08("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        Kendaraan08 k4 = new Kendaraan08("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        list.add(k1);
        list.add(k2);
        list.add(k3);
        list.add(k4);

        int pilih;
        do {
            System.out.println("Menu ");
            System.out.println("1. Daftar Kendaraan ");
            System.out.println("2. Bayar Pajak ");
            System.out.println("3. Tampil Seluruh Transaksi ");
            System.out.println("4. Urutkan Transaksi Berdasar nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("+++++++++++++++++++++++++++");
                    System.out.println("Daftar Kendaraan");
                    System.out.println("+++++++++++++++++++++++++++");
                    System.out.println("| Nomor TNKB  |Nama Pemilik|Jenis |CC Kendaraan|Tahun|Bulan Harus Bayar|");
                    System.out.println("-------------------------------------------------------------------------");
                    list.printAllKendaraan();
                    break;
                case 2:
                    System.out.println("+++++++++++++++++++++++++++");
                    System.out.println("Daftar Kendaraan");
                    System.out.println("+++++++++++++++++++++++++++");
                    System.out.println("| Nomor TNKB  |Nama Pemilik|Jenis |CC Kendaraan|Tahun|Bulan Harus Bayar|");
                    System.out.println("-------------------------------------------------------------------------");
                    list.printAllKendaraan();
                    System.out.print("Masukkan Nomer TNKB: ");
                    sc.nextLine();  // consume newline
                    String tnkb = sc.nextLine();
                    System.out.print("Bulan Bayar: ");
                    int bulanBayar = sc.nextInt();
                    TranksaksiPajak08 transaksi = list.bayarPajak(tnkb, bulanBayar, transaksiList.size() + 1);
                    if (transaksi != null) {
                        transaksiList.add(transaksi);
                    }
                    break;
                case 3:
                    list.printAllTransaksi(transaksiList);
                    break;
                case 4:
                    // Implement case 4 logic here
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih != 5);
        sc.close();
    }
}

package praktikum3;

import java.util.Scanner;

public class mainPembeli {
    public static void menu(){
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("6. cari nama ");
        System.out.println("7. Daftar pembeli");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kapasitas Queue : ");
        int jumlah = sc.nextInt();
        Queue08 antri = new Queue08(jumlah);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    System.out.print("no Hp : ");
                    int noHp = sc.nextInt();
                    Pembeli08 pb = new Pembeli08(nama,noHp);
                    sc.nextLine();
                    antri.enqueue(pb);
                    break;
                case 2:
                    Pembeli08 antrian = antri.dequeue();
                    if (!"".equals(antrian.nama) && antrian.noHp != 0 ) {
                        System.out.println("Antrian yang keluar : " + antrian.nama + " " + antrian.noHp );                        
                        break;
                    }    
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukan nama yang ingin anda cari antreannya : ");
                    String cariNama = sc.next();
                    antri.peekPosition(cariNama);
                    break;
                case 7:
                    antri.daftarPembeli();
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}

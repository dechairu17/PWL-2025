package praktikum2;

import java.util.Queue;
import java.util.Scanner;

public class QueueMain08 {
    public static void menu(){
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kapasitas Queue : ");
        int jumlah = sc.nextInt();
        QueueNasabah08 antri = new QueueNasabah08(jumlah);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc.next();
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    System.out.print("Alamat : ");
                    String alamat = sc.next();
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc.nextDouble();
                    Nasabah08 nb = new Nasabah08(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    Nasabah08 data = antri.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);                        
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
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 );
    }
}

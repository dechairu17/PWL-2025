package kuis1;

import java.util.Scanner;

public class mainKamera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("=======================================");

        System.out.print("Masukkan ID Kamera: ");
        int idKamera = sc.nextInt();
        System.out.print("Masukkan Merek: ");
        String merek = sc.next();
        System.out.print("Masukkan Jenis: ");
        String jenis = sc.next();
        System.out.print("Masukkan Resolusi: ");
        String resolusi = sc.next();
        System.out.print("Masukkan Harga Sewa: ");
        int hargaSewa = sc.nextInt();

        kamera kamera1 = new kamera(idKamera, merek, jenis, hargaSewa, resolusi, "tersedia");

        System.out.println("=======================================");
        System.out.println("=======================================");

        kamera1.tampilkanInfo();

        System.out.println("=======================================");
        System.out.println("BIAYA KAMERA YANG DI SEWA");
        System.out.println("=======================================");
        
        System.out.println("Biaya sewa untuk 3 hari: Rp" + kamera1.hitungBiayaSewa(3));

        kamera1.setStatus("disewa");
        
        System.out.println("=======================================");
        System.out.println("DETAIL KAMERA YANG DI SEWA");
        System.out.println("=======================================");

        kamera1.tampilkanInfo();

        int diskon = kamera1.hitungDiskon();
        System.out.println("Diskon: Rp" + diskon);

        int hargaBayar = kamera1.hargaBayar();
        System.out.print("Harga yang harus dibayar: Rp" + hargaBayar);
    }
}


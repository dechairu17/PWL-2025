package Tugas1;

import java.util.Scanner;

public class MainTugas108 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListTugas108 dll = new DoubleLinkedListTugas108();
        int noAntrian;
        String nama;
        boolean run = true;
        do {
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.print("Masukan Pilihan Anda : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
            System.out.println("-----------------------------------");
            System.out.println("Masukan Data Penerima Vaksin");
            System.out.println("-----------------------------------");
            System.out.print("Nomor Antrian : ");
            noAntrian = sc.nextInt();
            System.out.print("Nama Penerima : ");
            nama = sc.next();
            dll.addLast(noAntrian, nama);
                break;
            case 2:
            System.out.println("-----------------------------------");
            System.out.println("Masukan Data Penerima Vaksin");
            System.out.println("-----------------------------------");
            dll.removeFirst();
                break;
            case 3:
            dll.print();
            System.out.println("Sisa Antrian : " + dll.size());
        System.out.println("=============================================");
                break;
            case 4:
                run = false;
                break;
            default:
                break;
        }
        } while (run);
    }
    
}

package Tugas;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
 
public class Main08 {
    public static Queue<Mahasiswa08> mahasiswas = new LinkedList<>();
    public static Queue<MataKuliah08> mataKuliahs = new LinkedList<>();
    public static Queue<Nilai08> nilais = new LinkedList<>();
 
    public static Scanner sc = new Scanner(System.in);
 
    public static void menu() {
        System.out.println("***********************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("***********************************************");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Data Nilai");
        System.out.println("6. Keluar");
        System.out.println("***********************************************");
        System.out.print("Pilih Menu: ");
    }
 
    public static void inputNilai() {
        System.out.println("--- Masukkan Data ---");
        System.out.print("Masukkan nilai : ");
        double nilai = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("********************************************************************");
        System.out.println("NIM            Nama                  Telf");
        mahasiswas.forEach((mhs) -> {
            System.out.printf("%-3s          %-12s          %10s\n", mhs.nim, mhs.nama, mhs.notelp);
        });

        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("********************************************************************");
        System.out.println("Kode           Mata Kuliah                                      SKS");
        mataKuliahs.forEach((mk) -> {
            System.out.printf("%-5s          %-40s          %-2s\n", mk.kode, mk.mataKuliah, mk.sks);
        });
        
        System.out.print("Masukkan Kode Mata Kuliah : ");
        String kode = sc.nextLine();
        String nama = "";
        for (Mahasiswa08 mhs : mahasiswas) {
            if (mhs.nim.equals(nim)) {
                nama = mhs.nama;
            }
        }

        String mataKuliah = "";
        String sks = "";
        for (MataKuliah08 mk : mataKuliahs) {
            if (mk.kode.equals(kode)) {
                mataKuliah = mk.mataKuliah;
                sks = mk.sks;
            }
        }
        nilais.add(new Nilai08(nim, nama, mataKuliah, sks, nilai));
    }

    public static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*******************************************************************************");
        System.out.println("NIM            Nama                Mata Kuliah                 SKS         Nilai");
        nilais.forEach((n) -> {
            System.out.printf("%-5s          %-10s          %-10s          %-2s          %-4s\n", n.nim, n.nama, n.mataKuliah, n.sks, n.nilai);
        });
    }

    public static void cariNilai() {
        tampilNilai();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        boolean found = false;
        for (Nilai08 n : nilais) {
            if (n.nim.equals(nim)) {
                System.out.println("NIM            Nama              Mata Kuliah            SKS         Nilai");
                System.out.printf("%-5s          %-10s          %10s          %-2s          %-4s\n", n.nim, n.nama, n.mataKuliah, n.sks, n.nilai);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }

    
    public static void sortData() {
        Nilai08[] nilaiArr = new Nilai08[nilais.size()];
        int i = 0;
        for (Nilai08 n : nilais) {
            nilaiArr[i] = n;
            i++;
        }
        for (int j = 0;j < nilaiArr.length - 1;j++) {
            for (int k = 0;k < nilaiArr.length - j - 1;k++) {
                if (nilaiArr[k].nilai < nilaiArr[k + 1].nilai) {
                    Nilai08 temp = nilaiArr[k];
                    nilaiArr[k] = nilaiArr[k + 1];
                    nilaiArr[k + 1] = temp;
                }
            }
        }
        nilais.clear();
        for (Nilai08 n : nilaiArr) {
            nilais.add(n);
        }
    }



    public static void hapusData() {
        tampilNilai();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        boolean found = false;
        for (Nilai08 n : nilais) {
            if (n.nim.equals(nim)) {
                nilais.remove(n);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public static void main(String[] args) {
        mahasiswas.add(new Mahasiswa08("20001", "Thalhah", "021xxx"));
        mahasiswas.add(new Mahasiswa08("20002", "Zubair", "021xxx"));
        mahasiswas.add(new Mahasiswa08("20003", "Abdul-Rahman", "021xxx"));
        mahasiswas.add(new Mahasiswa08("20004", "Sa'ad", "021xxx"));
        mahasiswas.add(new Mahasiswa08("20005", "Sa'id", "021xxx"));
        mahasiswas.add(new Mahasiswa08("20006", "Ubaidah", "021xxx"));
        mataKuliahs.add(new MataKuliah08("00001", "Internet Of Things", "3"));
        mataKuliahs.add(new MataKuliah08("00002", "Algoritma dan Struktur Data", "2"));
        mataKuliahs.add(new MataKuliah08("00003", "Algoritma dan Pemograman", "2"));
        mataKuliahs.add(new MataKuliah08("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        mataKuliahs.add(new MataKuliah08("00005", "Praktikum Algoritma dan Pemograman", "3"));
        int menu;
        do {
            menu();
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1: 
                    inputNilai();
                    break;
                case 2: 
                    tampilNilai();
                    break;
                case 3: 
                    cariNilai();
                    break;
                case 4: 
                    sortData();
                    break;
                case 5: 
                    hapusData();
                    break;
                case 6: 
                    System.out.println("Exit...");
                    break;
                default: 
                    System.out.println("Menu tidak ada");
            }
        }while (menu != 6);
    }
}
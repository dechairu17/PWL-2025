package jobsheet6.Buku;

import java.util.Scanner;

public class mainBuku08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku08 data = new PencarianBuku08();
        int jmlBuku = 3;

        System.out.println("---------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari Kode Buku Terkecil: ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("==========================");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok \t: ");
            int stock = s.nextInt();
            
            Buku08 m = new Buku08(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("---------------------------------------");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.print("Cari buku berdasarkan judul: ");
        String cariJudul = s1.nextLine();
        
        data.sort();
        int posisi = data.findSeqSearchJudul(cariJudul);
        System.out.println("sequential search: ");
        data.TampilData(cariJudul, posisi);
        
        System.out.println("binary search: ");
        posisi = data.findJudulBinarySearch(cariJudul, 0, data.listBuku08.length - 1);
        data.TampilData(cariJudul, posisi);
    }
    }


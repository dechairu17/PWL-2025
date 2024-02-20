package jobsheet1;

import java.util.Scanner;

public class fungsi1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi array untuk menyimpan nama cabang
        String[] namaCabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        // Deklarasi array untuk menyimpan stok bunga
        int[][] stokBunga = new int[namaCabang.length][4];

        // Harga bunga
        int[] hargaBunga = {
            75000, // Aglonema
            50000, // Keladi
            60000, // Alocasia
            10000  // Mawar
        };

        // Meminta input stok bunga untuk setiap cabang
        for (int i = 0; i < namaCabang.length; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.printf("Cabang %s\n", namaCabang[i]);
            System.out.println("-----------------------------------------------------");

            for (int j = 0; j < hargaBunga.length; j++) {
                String namaBunga = "";
                switch (j) {
                    case 0:
                        namaBunga = "Aglonema";
                        break;
                    case 1:
                        namaBunga = "Keladi";
                        break;
                    case 2:
                        namaBunga = "Alocasia";
                        break;
                    case 3:
                        namaBunga = "Mawar";
                        break;
                }
                System.out.printf("Masukkan Stok %s: ", namaBunga);
                stokBunga[i][j] = sc.nextInt();
            }
        }

        // Menghitung pendapatan setiap cabang
        int[] pendapatanCabang = new int[namaCabang.length];
        for (int i = 0; i < namaCabang.length; i++) {
            for (int j = 0; j < hargaBunga.length; j++) {
                pendapatanCabang[i] += stokBunga[i][j] * hargaBunga[j];
            }
        }

        // Menghitung pendapatan total
        int pendapatanTotal = 0;
        for (int i = 0; i < pendapatanCabang.length; i++) {
            pendapatanTotal += pendapatanCabang[i];
        }

        // Menampilkan hasil
        System.out.println("-----------------------------------------------------");
        System.out.println("TotalPendapatan RoyalGarden");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < namaCabang.length; i++) {
            System.out.printf("Cabang %s: Rp. %d\n", namaCabang[i], pendapatanCabang[i]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("Total Pendapatan: Rp. %d\n", pendapatanTotal);
    }
}

package jobsheet4.Pangkat;

import java.util.Scanner;

public class mainPangkat08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat08[] png = new Pangkat08[elemen];
        for (int i = 0; i < elemen; i++) {

            System.out.println("Masukkan nilai yang akan dipangkatkan ke- " + (i + 1) + " : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan niai pemangkat ke- " + (i + 1) + " : ");
            int pang = sc.nextInt();
            png[i] = new Pangkat08(nilai, pang);
        }
        for (int i = 0; i < elemen; i++) {
            png[i].menu();
            do {
                System.out.println("===========================================");
                System.out.println("Silahkan Pilih Menu :");
                System.out.println("1. Brute Force");
                System.out.println("2. Devide and Conquer");
                System.out.println("3. Exit");
                System.out.println("");
                System.out.print("Pilihan Menu Anda (1/2/3): ");
                int menu = sc.nextInt();
                switch (menu) {
                    case 1: {
                        System.out.println("============================");
                        System.out.println("Hasil Pangkat dengan Brute Force ");
                        for (int j = 0; j < elemen; j++) {
                            System.out.println("Nilai " + png[j].nilai + " pangkat " + png[j].pangkat + " adalah : " + png[j].PangkatBF(png[j].nilai, png[j].pangkat));
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("=============================");
                        System.out.println("Hasil Pangkat dengan Devide and Conquer ");
                        for (int j = 0; j < elemen; j++) {
                            System.out.println("Nilai " + png[j].nilai + " pangkat " + png[j].pangkat + " adalah : " + png[j].PangkatDC(png[j].nilai, png[j].pangkat));
                        }
                        break;
                    }

                }
            } while (true);
        }
        System.out.println("=================================");

    }

}

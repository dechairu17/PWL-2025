package week10.jobsheet;

import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String [][] penonton = new String[4][2];
        penonton [0][0] = "Amin";
        penonton [0][1] = "Bena";
        penonton [1][0] = "Candra";
        penonton [1][1] = "Dela";
        penonton [2][0] = "Eka";
        penonton [2][1] = "Farhan";
        penonton [3][0] = "Gisel";
        penonton [3][1] = "Hana";

        System.out.println("Menu ");
        System.out.println("1: Input data penonton  ");
        System.out.println("2: Tampilkan daftar penonton  ");
        System.out.println("3: Exit ");
        System.out.print("Masukan pilihan menu anda : ");
        menu = sc.nextInt();

        if (menu == 1) {
            while (true) {
            System.out.print("Masukan nama :");
            nama = sc.next();
            System.out.print("Masukan baris :");
            baris = sc.nextInt();
            System.out.print("Masukan kolom :");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            if (baris == 1 && kolom == 2) {
                System.out.println("Kursi tidak tersedia");
            }
            System.out.print("Input penonton lainnya (y/n) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        } else if (menu == 2) {
            System.out.println("Dafta penonton :");
            for (int i = 0; i < penonton.length; i++) {
                System.out.println("Penonton pada baris ke- " + (i+1) + ": " + String.join(", ", penonton[i]));
            }
        } else if (menu == 3){
            System.out.println("Terimakasih");
        }
        
        
    }
}

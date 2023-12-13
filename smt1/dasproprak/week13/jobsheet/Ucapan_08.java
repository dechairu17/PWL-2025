package week13.jobsheet;

import java.util.Scanner;

import week4.jobsheet.pisahobat;

public class Ucapan_08 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        System.out.println();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");;
    }
}

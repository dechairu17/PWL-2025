package jobsheet1;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi array untuk menyimpan nilai mata kuliah
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
       
        
        int[] nilaiAngka = new int[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        int[] SKS = {2,2,2,3,2,2,3,2};
        double totalNilai=0,IP;

         for (int i = 1; i <=30; i++) {
            System.out.print("=");
        }
        System.out.println("\nProgram Menghitung IP Semester");
        for (int i = 1; i <=30; i++) {
            System.out.print("=");
        
        }System.out.println("");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("Masukkan Nilai Angka untuk MK %s: ", mataKuliah[i]);
            nilaiAngka[i] = sc.nextInt();
        }
        for (int i = 0; i < mataKuliah.length; i++) {
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
            } else {
                nilaiHuruf[i] = "E";
            }
        }
        for (int i = 0; i < mataKuliah.length; i++) {
                if (nilaiAngka[i] >= 80) {
                    bobotNilai[i] = 4;
                } else if (nilaiAngka[i] >= 73) {
                    bobotNilai[i] = 3.5;
                } else if (nilaiAngka[i] >= 65) {
                    bobotNilai[i] = 3;
                } else if (nilaiAngka[i] >= 60) {
                    bobotNilai[i] = 2.5;
                } else if (nilaiAngka[i] >= 50) {
                    bobotNilai[i] = 2;
                } else {
                    bobotNilai[i] = 1;
                }
            }
       
            for (int i = 1; i <=30; i++) {
                System.out.print("=");
            }
            System.out.println();
            System.out.println("Hasil Konversi Nilai");
            for (int i = 1; i <=30; i++) {
                System.out.print("=");
            }
            System.out.println();
        System.out.printf("  %-50s  %-10s  %-10s  %-10s \n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("| %-50s | %10d | %10s | %10.2f |\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println();
        for (int i = 1; i <=30; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < bobotNilai.length; i++) {
            totalNilai += (bobotNilai[i]*SKS[i]);
        }
        IP = totalNilai / 18;
        System.out.printf("IP = %.2f",IP);

    }
}

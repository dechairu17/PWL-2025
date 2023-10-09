package week7.jobsheet;

import java.util.Scanner;

public class WhileGaji08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;
        String jabatan;
        
        System.out.print("Masukan jumlah karyawan : ");
        jumlahKaryawan = sc.nextInt();

        int i =0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan -Direktur, Manajer, Karyawan");
            System.out.println("Masukan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = sc.next();
            System.out.println("Masukan jumlah jam lembur : ");
            jumlahJamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
        }

    }
}

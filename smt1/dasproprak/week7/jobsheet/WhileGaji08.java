package week7.jobsheet;

import java.util.Scanner;

public class WhileGaji08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        
        System.out.print("Masukan jumlah karyawan : ");
        jumlahKaryawan = sc.nextInt();

        int i =0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan -Direktur, Manajer, Karyawan");
            System.out.print("Masukan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = sc.next();
            System.out.print("Masukan jumlah jam lembur : ");
            jumlahJamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                --i;             
                continue;
            }

            totalGajiLembur += gajiLembur;
        }
        System.out.print("Total gaji lembur : " + totalGajiLembur);
    }
}

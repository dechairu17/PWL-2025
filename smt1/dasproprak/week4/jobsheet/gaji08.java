package week4.jobsheet;

import java.util.Scanner;

public class gaji08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji ;

        System.out.print("Masukan Jumlah masuk : ");
        jmlMasuk = input.nextInt();

        System.out.print("Masukan Jumlah tidak masuk : ");
        JmlTdkMasuk = input.nextInt();

        System.out.println("Masukan gaji : ");
        gaji = input.nextInt();

        System.out.println("Masukan potongan gaji : ");
        potGaji = input.nextInt();

        TotGaji = (jmlMasuk*gaji) - (JmlTdkMasuk*potGaji);

        System.out.println("Total Gaji : " + TotGaji);
    }
}

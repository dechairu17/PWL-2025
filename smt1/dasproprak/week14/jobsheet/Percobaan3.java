package week14.jobsheet;

import java.util.Scanner;

public class Percobaan3 {
    static double hitunglaba (double saldo,int tahun ) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitunglaba(saldo, tahun -1 ));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah Saldo Awal : ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();
        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitunglaba(saldoAwal, tahun));
    }
}

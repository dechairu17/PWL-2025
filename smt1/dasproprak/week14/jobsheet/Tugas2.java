package week14.jobsheet;

import java.util.Scanner;

public class Tugas2 {
    static int penjumlahanRekrusif(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            int hasil = penjumlahanRekrusif(n - 1) + n;
            System.out.print(" + " + n);
            return hasil;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        System.out.print("Masukan angka: ");
        angka =  sc.nextInt();
        sc.close();
        int result = penjumlahanRekrusif(angka);
        System.out.print(" = " + result);
    }
}

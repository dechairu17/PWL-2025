package week14.jobsheet;

import java.util.Scanner;

public class Tugas3 {
    static boolean isPrima(int angka, int n) {
        if (n <= 1) {
            return false;
        } else if (n > Math.sqrt(angka)) {
            return true;
        } else if (n % n == 0 ) {
            return false;
        } else {
            return isPrima(angka, n + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = sc.nextInt();
        sc.close();

        if (isPrima(angka, 2)) {
            System.out.println(angka + " adalah bilangan prima. ");
        } else {
            System.out.println(angka + " bukan bilangan prima");
        }
    }
}

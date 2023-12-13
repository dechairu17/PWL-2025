package week14.jobsheet;

import java.util.Scanner;

public class Tugas4 {
    public static int fibonacci (int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan bulan ke- ");
        int bulan = sc.nextInt();
        sc.close();

        int Jumlah = fibonacci(bulan);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke- " + bulan + " adalah " + Jumlah);
    }
}

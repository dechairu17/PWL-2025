package week14.jobsheet;

import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            int hasilPangkat = x * hitungPangkat(x, y - 1);
            System.out.print(x);
            if (y > 1) {
                System.out.print("x");
            }
            return hasilPangkat;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();

        System.out.print("Hasil Pangkat: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}

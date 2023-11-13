package week11.jobsheet;

import java.util.Scanner;

public class kotak {
    public static void main(String[] args) {
        System.out.print("Masukan Nilai : ");
        Scanner sc = new Scanner(System.in);
        int nilai = sc.nextInt();
        for (int i = 0; i < nilai; i++) {
            for (int j = 0; j < nilai; j++) {
                if (i == 0 || i == nilai-1 || j == 0 || j == nilai-1) {
                    System.out.print(nilai);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

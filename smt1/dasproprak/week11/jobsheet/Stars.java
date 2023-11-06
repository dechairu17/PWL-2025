package week11.jobsheet;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai N : ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
    }
}

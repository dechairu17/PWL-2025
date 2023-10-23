package week8.jobsheet;

import java.util.Scanner;

public class uts1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int sudutA, sudutB, sudutC;
        System.out.print("Masukan sudut A: ");
        sudutA = sc.nextInt();
        System.out.print("Masukan sudut B: ");
        sudutB = sc.nextInt();
        System.out.print("Masukan sudut C: ");
        sudutC = sc.nextInt();

        if ((sudutA + sudutB + sudutC) == 180) {
            if ((sudutA + sudutB == sudutC) || (sudutB + sudutC == sudutA ) || (sudutA + sudutC == sudutB) ) {
                System.out.println("SIKU SIKU");
            } else {
                System.out.println("BUKAN SIKU SIKU");
            }
        } else {
            System.out.println("Kesalahan");
        }
    }
}

package week7.jobsheet;

import java.util.Scanner;

public class WhileKelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1 ;
        int kelipatan, jumlah = 0, counter = 0;
        System.out.print("Masukan bilangan kelipatan: ");
        kelipatan = sc.nextInt(); 
        while (i <= 50) {
            i++;
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        float avg = (float) jumlah / counter ;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata rata dari bilangan kelipatan %d adalah %.2f\n " , kelipatan, avg);
    }
}

package week6.jobsheet;

import java.util.Scanner;

public class TugasPemilihan21 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int bil1,bil2,bil3,maks;
        System.out.print("Masukan Bilangan 1 : ");
        bil1 = input08.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = input08.nextInt();
        System.out.print("Masukan Bilangan 3 : ");
        bil3 = input08.nextInt();

        if (bil1 > bil2) {
            maks = bil1;
                if (maks > bil3) {
                    System.out.println("Nilai Terbesar : " +maks);
                }else{
                    System.out.println("Nilai Terbesar : " +bil3);
                }
        }else {
            maks = bil2;
            if (maks > bil3) {
                System.out.println("Nilai Terbesar : " +maks);
            }else {
                System.out.println("Nilai Terbesar : " +bil3);
            }
        }
    }
}

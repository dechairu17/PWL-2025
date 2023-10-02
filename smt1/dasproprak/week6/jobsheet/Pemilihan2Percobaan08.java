package week6.jobsheet;

import java.util.Scanner;

public class Pemilihan2Percobaan08 {
    public static void main(String[] args) {
        
        Scanner Input08 = new Scanner(System.in);
        
        int tahun;
        System.out.print("Masukan tahun : ");
        tahun = Input08.nextInt();

        if ((tahun % 4) == 0 ) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat ");
                else {
                    System.out.println("Bukan tahun kabisat");
                }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
    
}

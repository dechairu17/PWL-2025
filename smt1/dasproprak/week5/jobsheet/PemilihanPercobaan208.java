package week5.jobsheet;
import java.util.Scanner;
public class PemilihanPercobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("Nilai uas      :");
        float uas = input08.nextFloat();
        System.out.print("Nilai uts      :"); 
        float uts = input08.nextFloat();
        System.out.print("Nilai kuis     :");
        float kuis = input08.nextFloat();
        System.out.print("Nilai tugas    :");
        float tugas = input08.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (total > 80 && total <=100 ) {
            System.out.print("Nilai total " + total + "Mendapatkan Nilai A(kualifikasi sangat baik)");
        } else if (total > 73 && total <=80) {
            System.out.print("Nilai total " + total + "Mendapatkan Nilai B+ (lebih dari baik) ");
        } else if (total > 65 && total <=73) {
            System.out.print("Nilai total " + total + "Mendapatkan Nilai B (baik)");
        } else if (total > 60 && total <=65) {
            System.out.print("Nilai total " + total + "Mendapatkan Nilai C+ (lebih dari cukup)");
        } else if (total > 50 && total<= 60) {
            System.out.print("Nilai total " + total + "Mendapatkan Nilai C (cukup)");
        } else if (total > 39 && total <= 50) {
            System.out.print("Nilai total " + total + "Mendapatkan Nilai D (kurang)");
        } else if (total <= 39) {
            System.out.print(total + "Mendapat Nilai E (gagal)");
        }
            
    }
            
}


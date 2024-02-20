package jobsheet1;
import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
    double tugas, kuis, UTS, UAS,total = 0;
    System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
    System.out.println("------------------------");
    System.out.println("------------------------");
    System.out.println("Masukan Nilai Tugas : ");
    tugas = sc.nextDouble();
    System.out.println("Masukan Nilai Kuis : ");
    kuis = sc.nextDouble();
    System.out.println("Masukan Nilai UTS : ");
    UTS = sc.nextDouble();
    System.out.println("Masukan Nilai UAS : ");
    UAS = sc.nextDouble();
    System.out.println("------------------------");
    System.out.println("------------------------");
    if ((tugas >= 0 &&  tugas <= 100) && (kuis >= 0 && kuis <= 100) && (UTS >= 0 && UTS <= 100) && (UAS >= 0 && UAS <= 100)) {
       total = (tugas * 0.2) + (kuis * 0.2) + (UTS * 0.3) + (UAS * 0.3);
        if (total > 80 && total <=100 ) {
        System.out.println("Nilai total " + total + " Mendapatkan Nilai A(kualifikasi sangat baik) ");
    } else if (total > 73 && total <=80) {
        System.out.println("Nilai total " + total + " Mendapatkan Nilai B+ (lebih dari baik) ");
    } else if (total > 65 && total <=73) {
        System.out.println("Nilai total " + total + " Mendapatkan Nilai B (baik)");
    } else if (total > 60 && total <=65) {
        System.out.println("Nilai total " + total + " Mendapatkan Nilai C+ (lebih dari cukup)");
    } else if (total > 50 && total<= 60) {
        System.out.println("Nilai total " + total + " Mendapatkan Nilai C (cukup)");
    } else if (total > 39 && total <= 50) {
        System.out.println("Nilai total " + total + " Mendapatkan Nilai D (kurang)");
    } else if (total <= 39) {
        System.out.println(total + " Mendapat Nilai E (gagal)");
    }

    System.out.println("------------------------");
    System.out.println("------------------------");
    if (total > 60) {
        System.out.println("SELAMAT ANDA LULUS ");
    } else {
        System.out.println("MAAF ANDA TIDAK LULUS ");
    }
    } else {
        System.out.println("Nilai yang anda masukan tidak valid ");
    }   
   

    }
}
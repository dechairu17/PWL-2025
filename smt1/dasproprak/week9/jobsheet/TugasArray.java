package week9.jobsheet;

import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlElemen; 
        int nilaiMin = 100;
        int nilaiMax =0;
        double rata2;  
        int total = 0;

        int [] nilaiElemen = new int[1000];

        System.out.print("Masukan Jumlah Elemen : ");
        jmlElemen = sc.nextInt();

        for( int i = 0 ;i < jmlElemen; i++ ){
            System.out.print("Masukan nilai elemen ke-" + (i+1) + " : ");
            nilaiElemen [i] = sc.nextInt();
            total += nilaiElemen[i];
        
        if (nilaiElemen[i] > nilaiMax) {
            nilaiMax = nilaiElemen[i];
        }
        else if (nilaiElemen[i] < nilaiMin ) {
            nilaiMin = nilaiElemen[i];
        } 
    }
    rata2 = total / jmlElemen;
    System.out.println("Nilai Terbesar : " + nilaiMax);
    System.out.println("Nilai Terkecil : " + nilaiMin);
    System.out.println("Rata Rata : " + rata2);
    }
}

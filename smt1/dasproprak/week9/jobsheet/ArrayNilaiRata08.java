package week9.jobsheet;

import java.util.Scanner;

public class ArrayNilaiRata08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiMhs  = new int [10];
        double totalLulus =0;
        double totalTdkLulus =0;
        int jmlMhs;
        int lulus = 0; 
        int tdkLulus = 0;
        
        System.out.print("Masukan Jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();
        for (int i = 0; i < jmlMhs; i++){
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                totalLulus +=nilaiMhs[i];
                lulus++;
            }  else if (nilaiMhs[i] <= 70 && nilaiMhs[i] >= 1){
               totalTdkLulus +=nilaiMhs[i];
               tdkLulus++;
            } else {

            }
        }
        double rata2Lulus = totalLulus/lulus;
        double rata2TdkLulus = totalTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai Lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai Tidak Lulus= " + rata2TdkLulus);
    }
}
package week9.jobsheet;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ArrayNilai {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] nilaiAkhir = new int [10];

    for(int i = 0 ; i < 10; i++){
        System.out.print("Masukan nilai akhir ke-"+i+" : ");
        nilaiAkhir [i] = sc.nextInt();
    }
    for(int i = 0 ; i < 10; i++){
        System.out.println("Nilai akhir ke-" +i+ " adalah : " +nilaiAkhir[i] );
    }
    }
}

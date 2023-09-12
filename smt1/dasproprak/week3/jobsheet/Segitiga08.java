package week3.jobsheet;

import java.util.Scanner;

public class Segitiga08 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int alas, tinggi ;
        float luas;
        System.out.println("masukan alas : ");
        alas = sc.nextInt();
        System.out.println("masukan tinggi : ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("luas segitiga : " + luas );

    }
}

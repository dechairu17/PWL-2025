package week13.jobsheet;

import java.util.Scanner;

public class Percobaan608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukan Panjang : ");
        p = sc.nextInt();
        System.out.print("Masukan Lebar : ");
        l = sc.nextInt();
        System.out.print("Masukan Tinggi : ");
        t = sc.nextInt();

        L = hitungluas(p, l);
        System.out.println("Luas Persegi Panjang adalah: "+ L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah : " + vol);
    }
    static int hitungluas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungluas(a, b)*tinggi;
        return volume;
    }
}

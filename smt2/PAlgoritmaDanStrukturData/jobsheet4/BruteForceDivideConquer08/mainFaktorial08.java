package jobsheet4.BruteForceDivideConquer08;

import java.util.Scanner;

public class mainFaktorial08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen: ");
        int jml = sc.nextInt();

        Faktorial08[] fk = new Faktorial08[jml];
        for (int i = 0; i < jml; i++) {
            fk[i] = new Faktorial08();

            System.out.println("Masukkan nilai data ke-" + (i + 1) + ": ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("\nMETODE BRUTE FORCE");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial " + fk[i].nilai + " adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("\nMETODE DIVIDE AND CONQUER");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}

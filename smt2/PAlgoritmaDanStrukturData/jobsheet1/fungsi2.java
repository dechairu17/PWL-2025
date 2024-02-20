package jobsheet1;

import java.util.Scanner;

public class fungsi2 {
    static Scanner input = new Scanner(System.in);
    static String[] toko = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
    static int[][] stok= {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static double[] totalPendapatan = new double[4];

    public static void main(String[] args) {
        System.out.print("Toko Bunga\s\t\t\t");
        System.out.print( "Aglonema\s\t\t");
        System.out.print( "Keladi\s\t\t");
        System.out.print( "Alocasia\s\t\t");
        System.out.print( "Mawar");

        for(int i = 0; i<toko.length;i++){
            System.out.println(); 
            System.out.printf( "%-20s", toko[i] );
            for(int j=0; j<stok.length;j++){
                System.out.printf( "%20d", stok[i][j]);
            }
        }

        System.out.println();
        System.out.println("Hitung pendapatan");
        for(int i = 0;i<toko.length;i++){
            hitungPendapatan(i);
        }
        System.out.println();
        System.out.println("Pengurangan Stok");
        penguranganStok();
    }

    static void hitungPendapatan(int index) {
        double totalAglonema = stok[index][0] *75000;
        double totalKeladi = stok[index][1] *50000;
        double totalAlocasia = stok[index][2] *60000;
        double totalMawar = stok[index][3] *10000;

        totalPendapatan[index] = totalAglonema+totalAlocasia+totalKeladi+totalMawar;
        System.out.println("Total pendapatan " + toko[index] + " adalah " + totalPendapatan[index]);
    }

    static void penguranganStok(){
        int[]penguranganStok = {-1, -2, 0, -5};;
        for (int i= 0; i<stok[3].length;i++){
            stok[3][i]+= penguranganStok[i];
        }
        System.out.print(toko[3]+"\s\t\t\t\t");
        System.out.print( stok[3][0] + "\s\t\t");
        System.out.print( stok[3][1] + "\s\t\t\t");
        System.out.print( stok[3][2] + "\s\t\t\t");
        System.out.print( stok[3][3] );
    }

}
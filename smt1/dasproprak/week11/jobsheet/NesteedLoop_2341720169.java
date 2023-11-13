package week11.jobsheet;

import java.util.Scanner;

public class NesteedLoop_2341720169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] temps = new double [5][7];
        double [] rata2 = new double[5];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke- " + (i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke- " + (j+1) + ": ");
                temps[i][j] = sc.nextDouble();
                rata2[i] += temps[i][j]; 
            }
            System.out.println();
        }
        for (int i = 0; i < rata2.length; i++) {
            rata2[i]/= 7;
        }

        int k = 1;
        for (double[] a : temps) {
            System.out.print("Kota ke-" + k + ": "); 
            for (double b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
            k++;
        }
        System.out.println();
        for (int i = 0; i < rata2.length; i++) {
            System.out.println("Rata Rata dari kota ke-" + (i+1) + ": " +rata2[i]);
        }
    }
}

package week6.jobsheet;

import java.util.Scanner;

public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        Scanner Input08 = new Scanner(System.in);
        float sudut1,sudut2,sudut3,totalSudut;
        System.out.print("Masukan Sudut 1 : ");
        sudut1 = Input08.nextFloat();
        System.out.print("Masukan Sudut 2 : ");
        sudut2 = Input08.nextFloat();
        System.out.print("Masukan Sudut 3 : ");
        sudut3 = Input08.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah Segitiga siku siku");
                else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                    System.out.println("Segitiga tersebut adalah Segitiga sama sisi");
                }
                    else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                        System.out.println("Segitiga tersebut adalah segitiga sama kaki");
                    }
                        else if ((sudut1 != 90) && (sudut2 != 90) && (sudut3 != 90)) {
                            System.out.println("Segitiga tersebut adalah segitiga sembarang"); }
                
        } else {
            System.out.println("bukan segitiga");
        }
    }
}

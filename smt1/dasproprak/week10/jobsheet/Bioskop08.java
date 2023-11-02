package week10.jobsheet;

import java.util.Scanner;

public class Bioskop08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] penonton = new String [4][50000000];
        penonton [0][0] = "Amin";
        penonton [0][1] = "Bena";
        penonton [5000][0] = "Candra";
        penonton [1][1] = "Dela";
        penonton [2][0] = "Eka";
        penonton [2][1] = "Farhan";
        penonton [3][0] = "Gisel";
        penonton [3][1] = "Hana";

        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang Baris : " + barisPenonton.length);
        }
    }
}

package week13.jobsheet;

import java.util.Scanner;

public class tugas {
    static Scanner sc = new Scanner(System.in);
    static double hitungV(int a){
        return a*a*a;
    }
    static double hitungLP(int a){
        return 6*a*a;
    }
    public static void main(String[] args) {
        int a = sc.nextInt();
        System.out.println("volume kubus " + hitungV(a));

    }
}

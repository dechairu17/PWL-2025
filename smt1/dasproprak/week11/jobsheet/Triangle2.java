package week11.jobsheet;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan nilai N = "); 
        int N = sc.nextInt(); 
        if (N > 3) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k= 1; k <= i; k++) {
                System.out.print(k);
        }
        System.out.println();
        }
    }
 }
}
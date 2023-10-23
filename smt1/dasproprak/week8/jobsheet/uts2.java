package week8.jobsheet;

import java.util.Scanner;

public class uts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan bilangan bulat N (N > 0): ");
        int N = sc.nextInt();
        if (N >= 0 ) {
        
        int nilai = 0;
        for (int n = 1; n <= N ; n++ ){
            nilai += n * n;
        }
        System.out.print("Jika user memasukan N = " + N + ", itu artinya : " + nilai);
    }
}
}
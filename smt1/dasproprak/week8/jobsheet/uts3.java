package week8.jobsheet;

import java.util.Scanner;

public class uts3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, jmlDigitGanjil=0,digit;
        System.out.print("Masukan user bilangan bulat N (N > 0)");
        N = sc.nextInt();
        
        if (N > 0) {
            while (N > 0 ) {
                digit = N % 10;
                if (digit % 2 != 0) {
                    jmlDigitGanjil++;
                }
                N /= 10;
            }
        System.out.println("Jumlah digit ganjil dalam bilangan N adalah " + jmlDigitGanjil);
        }
    }
}

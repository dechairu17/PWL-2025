package week5.jobsheet;
import java.util.Scanner;

public class PemilihanPercobaan108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        int angka = input08.nextInt();
        String message = angka %2 == 0? "Genap" : "ganjil"; 
        System.out.println("Angka bilangan " + message);
    }
}

package week5.jobsheet;
import java.util.Scanner;
public class PemilihanPercobaan308 {
    public static void main(String[] args) {
        Scanner input08 =new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        System.out.println("Masukan angka pertama : ");
        angka1 = input08.nextDouble();
        System.out.println("Masukan angka kedua : ");
        angka2 = input08.nextDouble();
        System.out.println("Masukan operator (+ - * /) :");
        operator = input08.next().charAt(0);
        
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
                break;
            default:
                System.out.println("Operator tidak ada");
                break;
        }
    }
}

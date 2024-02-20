package jobsheet1;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("Pilih rumus yang ingin dihitung:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Masukan Pilihan Anda : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan(scanner);
                break;
            case 2:
                hitungJarak(scanner);
                break;
            case 3:
                hitungWaktu(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void hitungKecepatan(Scanner scanner) {
        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v): " + kecepatan);
    }

    private static void hitungJarak(Scanner scanner) {
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak (s): " + jarak);
    }

    private static void hitungWaktu(Scanner scanner) {
        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t): " + waktu);
    }
}
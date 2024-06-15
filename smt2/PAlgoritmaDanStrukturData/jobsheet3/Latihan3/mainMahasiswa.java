package jobsheet3.Latihan3;


import java.util.Scanner;

public class mainMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa[] mahasiswa = new Mahasiswa[3];


        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.next();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.next();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            String jenisKelamin = scanner.next();
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();

            Mahasiswa mhs = new Mahasiswa(nama, nim, jenisKelamin, ipk);
            mahasiswa[i] = mhs;
        }

        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mhs : mahasiswa) {
            System.out.println("Nama: " + mhs.Nama());
            System.out.println("NIM: " + mhs.Nim());
            System.out.println("Jenis Kelamin: " + mhs.JenisKelamin());
            System.out.println("IPK: " + mhs.Ip());
            System.out.println();
        }

        double totalIpk = 0;
        for (Mahasiswa mhs : mahasiswa) {
            totalIpk += mhs.Ip();
        }
        double rataIpk = totalIpk / mahasiswa.length;
        System.out.println("Rata-rata IPK: " + rataIpk);

        double maxIpk = mahasiswa[0].Ip();
        Mahasiswa mahasiswaTerbaik = mahasiswa[0];
        for (int i = 1; i < mahasiswa.length; i++) {
            if (mahasiswa[i].Ip() > maxIpk) {
                maxIpk = mahasiswa[i].Ip();
                mahasiswaTerbaik = mahasiswa[i];
            }
        }
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + mahasiswaTerbaik.Nama());
        System.out.println("NIM: " + mahasiswaTerbaik.Nim());
        System.out.println("Jenis Kelamin: " + mahasiswaTerbaik.JenisKelamin());
        System.out.println("IPK: " + mahasiswaTerbaik.Ip());
    }
}

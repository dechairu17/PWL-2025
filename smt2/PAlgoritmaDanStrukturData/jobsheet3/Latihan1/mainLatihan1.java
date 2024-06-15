package jobsheet3.Latihan1;

import java.util.Scanner;

public class mainLatihan1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int jmlBangunRuang;
        System.out.println("1. Kerucut ");
        System.out.println("2. Limas Segi Empat Sama Sisi ");
        System.out.println("3. Bola ");
        System.out.println("Bangun ruang apa yang ingin anda hitung : ");
        int bangunRuang = scanner.nextInt();
        
        System.out.println("Masukan Jumlah bangun ruang yang ingin anda hitung : ");
        jmlBangunRuang = scanner.nextInt();

        if (bangunRuang == 1) {
            Kerucut[] kerucutArray = new Kerucut[jmlBangunRuang];
            for (int i = 0; i < jmlBangunRuang; i++) {
                System.out.println("Bangun Ruang Limas Segi Empat ke-" + (i + 1));
                System.out.print("Masukkan jari-jari kerucut ke- " + (i+1) + " : ");
                double jariJariKerucut = scanner.nextDouble();
                System.out.print("Masukkan sisi miring kerucut ke- " + (i+1) + " : ");
                double sisiMiringKerucut = scanner.nextDouble();
                kerucutArray[i] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
                System.out.println("Luas Permukaan Bangun Kerucut ke-" + (i + 1) + ": " + kerucutArray[i].hitungLuasPermukaan());
                System.out.println("Volume Bangun Kerucut ke-" + (i + 1) + ": " + kerucutArray[i].hitungVolume());
            }
        } else if (bangunRuang == 2) {
            LimasSegiEmpatSamaSisi[] limasArray = new LimasSegiEmpatSamaSisi[jmlBangunRuang];
            for (int i = 0; i < jmlBangunRuang; i++) {
                System.out.println("Bangun Ruang Limas Segi Empat ke-" + (i + 1));
                System.out.print("Masukkan panjang sisi alas limas ke- " + (i+1) + " : ");
                double panjangSisiAlasLimas = scanner.nextDouble();
                System.out.print("Masukkan tinggi limas ke- " + (i+1) + " :  ");
                double tinggiLimas = scanner.nextDouble();
                limasArray[i] = new LimasSegiEmpatSamaSisi(panjangSisiAlasLimas, tinggiLimas);
                System.out.println("Luas Permukaan Bangun Kerucut ke-" + (i + 1) + ": " + limasArray[i].hitungLuasPermukaan());
                System.out.println("Volume Bangun Kerucut ke-" + (i + 1) + ": " + limasArray[i].hitungVolume());
            }
        } else if (bangunRuang == 3) {
            Bola[] bola = new Bola[jmlBangunRuang];
            for (int i = 0; i < jmlBangunRuang; i++) {
                System.out.println("Bangun Ruang Limas Segi Empat ke-" + (i + 1));
                System.out.print("Masukkan jari-jari bola ke- " + (i+1) + " :  ");
                double jariJariBola = scanner.nextDouble();
                bola[i] = new Bola(jariJariBola);
                System.out.println("Luas Permukaan Bangun Kerucut ke-" + (i + 1) + ": " + bola[i].hitungLuasPermukaan());
                System.out.println("Volume Bangun Kerucut ke-" + (i + 1) + ": " + bola[i].hitungVolume());

            }
        } else {
            System.out.println("Pilihan tidak valid");
            return;
        }

        
    }
}


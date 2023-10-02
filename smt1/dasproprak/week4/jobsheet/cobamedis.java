package week4.jobsheet;

import java.util.Scanner;

public class cobamedis {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String nama, asalKota, tanggalPeriksa, keluhan, lokasi;
    int umur, jmlObat, totalHargaObat;
    System.out.println("masukan identitas pasien ");
    System.out.print("nama : ");
    nama = sc.next();
    System.out.print("umur : ");
    umur = sc.nextInt();
    System.out.print("alamat : ");
    asalKota = sc.next();
    System.out.print("tanggal periksa : ");
    tanggalPeriksa = sc.next();
    System.out.print("keluhan : ");
    keluhan = sc.next(); 
    String namaObat = "paracetamol" ;
    System.out.println("Obat yang disarankan : " + namaObat);
    int hargaObat = 13_000;
    System.out.println("harga obat : " + hargaObat );
    System.out.println("Masukan jumlah obat yang dibeli");
    jmlObat = sc.nextInt();
    totalHargaObat = (jmlObat*hargaObat);
    System.out.println("total harga obat yang di bayar : " + totalHargaObat);
    }
}
package week4.jobsheet;

import java.util.Scanner;
import java.util.Arrays;

public class HargaBayar {
    String[] namaObat = {"Volvo", "BMW", "Ford", "Mazda"};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int harga, Jumlah;
        double dis, total , bayar , jmlDis, halamanBuku;
        String merkBuku ;

        System.out.print("Masukan merk Buku : ");
        merkBuku = input.next();
        System.out.print("halaman buku : ");
        halamanBuku = input.nextInt();
        System.out.print("Masukan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.print("Masukan jumlah yang di beli : ");
        Jumlah = input.nextInt();
        System.out.print("Masukan Diskon : ");
        dis = input.nextDouble();

        total = harga * Jumlah ;
        jmlDis = total * dis;
        System.out.println("Diskon yang harus anda dapatkan : " + jmlDis);
        System.out.println("Jumlah harga yang harus di bayar : " + total);
        
    }
    
}

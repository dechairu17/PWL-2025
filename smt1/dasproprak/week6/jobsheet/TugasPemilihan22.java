package week6.jobsheet;

import java.util.Scanner;

public class TugasPemilihan22 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        String kamus = "kamus";
        String novel = "novel";
        String jenisBuku;
        int jmlKamus, jmlNovel,jmlBukuLain;

        System.out.print("Masukan jenis buku yang ingin anda beli : ");
        jenisBuku = input08.next();

        if (jenisBuku.equalsIgnoreCase(kamus)) {
            System.out.println("Anda telah memilih untuk membeli buku kamus ");
            System.out.println("Anda mendapatkan diskon sebesar 10%");
            System.out.println("Masukan jumlah kamus yang di beli");
            jmlKamus = input08.nextInt();
            if (jmlKamus >= 3) {
                System.out.println("Anda mendapatkan tambahan diskon sebesar 2% ");
                System.out.println("Total diskon yang anda dapatkan 12%");
            } else if ((jmlKamus == 1 )||(jmlKamus == 2) ) {
                System.out.println("Anda tidak mendapatkan tambahan diskon");
                System.out.println("Total diskon yang anda dapatkan adalah 10%");
            }
        } else if (jenisBuku.equalsIgnoreCase(novel)){
            System.out.println("Anda telah memilih untuk membeli buku novel ");
            System.out.println("Mendapatkan diskon sebesar 7%");
            System.out.println("Masukan jumlah novel yang di beli");
            jmlNovel = input08.nextInt();
            if (jmlNovel > 3 ) {
                System.out.println("Anda mendapatkan tambahan diskon sebesar 2%");
                System.out.println("Total diskon yang anda dapatkan 9%");
            } else if ((jmlNovel >= 1) || (jmlNovel <= 3)) {
                System.out.println("Anda mendapatkan tambahan diskon sebesar 1%");
                System.out.println("Total diskon yang anda dapatkan 8%");
            }
        } else {
            System.out.println("Anda telah memilih untuk membeli buku selain kamus dan novel ");
            System.out.print("Masukan jumlah buku selain novel dan kamus yang ingin anda beli : ");
            jmlBukuLain = input08.nextInt();
            if (jmlBukuLain > 3) {
                System.out.println("Anda mendapatkan diskon sebesar 5%");
            } else if ((jmlBukuLain <= 3) || (jmlBukuLain >= 1)) {
                System.out.println("Maaf anda tidak mendapatkan diskon");
            }
        }
    }
}

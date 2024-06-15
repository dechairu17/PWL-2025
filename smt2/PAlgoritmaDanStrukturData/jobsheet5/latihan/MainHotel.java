package jobsheet5.latihan;

import java.util.Scanner;


public class MainHotel {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel H1 = new Hotel("Sibuya", "Jepang", 350000, (byte)5);
        Hotel H2 = new Hotel("Savana" , "Malang", 600000,(byte)4);
        Hotel H3 = new Hotel("Ariya" , "Malang", 500000,(byte)3);

        list.tambah(H1);
        list.tambah(H2);
        list.tambah(H3);

        list.tampilAll();
        System.out.println("Menu Filter Hotel ");
        System.out.println("1. Harga ");
        System.out.println("2. Bintang ");
        System.out.print("Masukan Pilihan anda : " );
        int pil = sc.nextInt();
        System.out.println("-----------------------------");
        System.out.println("");

        if (pil == 1) {
          list.bubblesort();
          list.tampilAll();  
        } else if (pil == 2) {
          list.selectionSort();
          list.tampilAll();  
        } else {
            System.out.println("Filter yang anda pilih tidak ada");
        }



    }
}

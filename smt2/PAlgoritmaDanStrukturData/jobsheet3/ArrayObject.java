package jobsheet3;

import java.util.Scanner;

public class ArrayObject {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Panjang Array: ");
        int j= sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[j];


        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke- " + i);
            System.out.print("Masukan Panjang  : " );
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukan Lebar  : " );
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke- " + i);
            System.out.println("Panjang : " + ppArray[i].panjang + " , Lebar : " + ppArray[i].lebar );            
        }

    }
}


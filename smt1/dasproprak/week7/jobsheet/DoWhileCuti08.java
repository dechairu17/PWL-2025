package week7.jobsheet;

import java.util.Scanner;

public class DoWhileCuti08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Masukan jatah cuti : ");
        jatahCuti = sc.nextInt();
        
        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t) : ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Masukan jumlah hari : ");
                jumlahHari = sc.nextInt();
                

                if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti : " + jatahCuti);
            }else {
                System.out.println("Sisa jatah cuti tidak mencukupi " );
            }

            } else if (konfirmasi.equalsIgnoreCase("t")){
                System.out.println("Selesai");
                break;
            }
        } while (jatahCuti > 0);
    
}
}

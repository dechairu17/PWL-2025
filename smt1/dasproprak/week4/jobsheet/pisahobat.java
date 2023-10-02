package week4.jobsheet;
import java.util.Scanner;

public class pisahobat {

    public static void main(String[] args) {
        String NamaObatA,NamaObatB,NamaObatC,NamaObatD,NamaObatE,NamaObatF,NamaObatG,NamaObatH;
        int obatA = 10000;
        int obatB = 11000;
        int obatC = 12000;
        int obatD = 13000;
        int obatE = 14000;
        int obatF = 15000;
        int obatG = 16000;
        int obatH = 17000;

        NamaObatA= "gratazon : " + obatA; 
        NamaObatB = "paratusin : " + obatB;
        NamaObatC = "inamid : " + obatC;
        NamaObatD = "promag : " + obatD;
        NamaObatE = "panadol : " + obatE;
        NamaObatF = "paracetamol : " + obatF;
        NamaObatG = "antibiotik : " + obatG;
        NamaObatH = "dekolgen : " + obatH;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. " +NamaObatA );
        System.out.println("2. " +NamaObatB);
        System.out.println("3. " +NamaObatC);
        System.out.println("4. " +NamaObatD);
        System.out.println("5. " +NamaObatE);
        System.out.println("6. " +NamaObatF);
        System.out.println("7. " +NamaObatG);
        System.out.println("8. " +NamaObatH);
        System.out.println("Masukan pilihan obat anda : (1/2/3/4/5/6/7/8)");
        int obat = sc.nextInt();
        System.out.println("Masukan jumlah obat yang ingin anda beli : ");
        int jmlObat = sc.nextInt();
        int totalHargaObat ;

        totalHargaObat = obatA*jmlObat;
        System.out.println("total harga yang anda bayar : " + totalHargaObat);
    }

}
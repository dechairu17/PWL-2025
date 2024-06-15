package jobsheet5.bubble;

public class mahasiswa {
    String nama;
    int thnMasuk, umur;
    double Ipk;

    mahasiswa (String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        Ipk = i;

    }

    void tampil(){
        System.out.println("Nama : " + nama );
        System.out.println("Tahun Masuk : " + thnMasuk);
        System.out.println("Umur : " + umur);
        System.out.println("IPK : " + Ipk);
    }
}

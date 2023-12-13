package week12.materi;

public class cba1 {
    public static int tambahDuaAngka(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        System.out.println("Hasil penambahan di dalam fungsi: " + hasil);
        return hasil;
    }

    public static void main(String[] args) {
        int hasilJumlah = tambahDuaAngka(5, 3);
        System.out.println("Hasil penambahan yang dikembalikan: " + hasilJumlah);
    }
}

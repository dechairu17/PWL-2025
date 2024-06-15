package jobsheet1;

public class Contoh {
    public static void main(String[] args) {
        int i = 100;
        boolean kondisi;
        do {
            i -= 30;
            kondisi = i < 0;
        } while (!kondisi);
        System.out.println("Nilai i = " + i);
    }
}

